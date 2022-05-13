package com.df.report.service.impl;

import com.alibaba.fastjson.JSON;
import com.df.report.model.ProjectLeveVo;
import com.df.report.model.ProjectTypeVo;
import com.df.report.service.PiprojectService;
import org.hibernate.query.internal.NativeQueryImpl;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chenning
 * @description 针对表【piproject】的数据库操作Service实现
 * @createDate 2022-05-11 16:52:08
 */
@Service
public class PiprojectServiceImpl
        implements PiprojectService {

    @Autowired
    private EntityManager em;

    @Override
    public Map<String, Object> projectType() {
        Query query = em.createNativeQuery("SELECT\n" +
                "\t* \n" +
                "FROM\n" +
                "\t(\n" +
                "\tSELECT\n" +
                "\t\tcount( piproject.id ) AS count,\n" +
                "\t\tpiproject.ltdtype_definition_ref_id AS id \n" +
                "\tFROM\n" +
                "\t\tpiproject \n" +
                "\tWHERE\n" +
                "\t\tpiproject.lc_state_ref_id NOT IN ( SELECT id FROM lc_state WHERE state_name = '废弃' ) \n" +
                "\tGROUP BY\n" +
                "\t\tpiproject.ltdtype_definition_ref_id \n" +
                "\t) a\n" +
                "\tLEFT JOIN (\n" +
                "\tSELECT\n" +
                "\t\tzh_cn AS NAME,\n" +
                "\t\tholder_reference_id \n" +
                "\tFROM\n" +
                "\t\tltdlocalizable_property_value \n" +
                "\tWHERE\n" +
                "\t\tzh_cn != '' \n" +
                "\tGROUP BY\n" +
                "\t\tzh_cn,\n" +
                "\tholder_reference_id \n" +
                "\t) b ON a.id = b.holder_reference_id");


        query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List list = query.getResultList();
        List<ProjectTypeVo> projectTypeVos = JSON.parseArray(JSON.toJSONString(list), ProjectTypeVo.class);
        Map map = new HashMap();
        //计算百分比
        Double total = 0.0;
        DecimalFormat df = new DecimalFormat("#.0000");
        //            list.add(projectTypeVo);
        for (ProjectTypeVo projectTypeVo : projectTypeVos) total += projectTypeVo.getCount();
        for (ProjectTypeVo projectTypeVo : projectTypeVos) {
            String percentage = df.format(projectTypeVo.getCount() / total);
            projectTypeVo.setPercentage(Double.parseDouble(percentage));
        }
        map.put("list", projectTypeVos);
        map.put("total", total);
        return map;
    }


    @Override
    public List<ProjectLeveVo> projectLevel() {
        DecimalFormat df = new DecimalFormat("#0.00");
        Query query = em.createNativeQuery("SELECT\n" +
                "\tt.add_by_name AS NAME,\n" +
                "\tCOUNT( t.add_by_name ) AS count \n" +
                "FROM\n" +
                "\tpiproject t\n" +
                "\tINNER JOIN lc_state t1 ON ( t1.id = t.lc_state_ref_id ) \n" +
                "WHERE\n" +
                "\t( t1.state_name != '废弃' ) \n" +
                "GROUP BY\n" +
                "\tt.add_by_name");
        query.unwrap(NativeQueryImpl.class).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List list = query.getResultList();
        List<ProjectLeveVo> projectLeveVos = JSON.parseArray(JSON.toJSONString(list), ProjectLeveVo.class);
        double sum = projectLeveVos.stream().mapToDouble(ProjectLeveVo::getCount).sum();
        projectLeveVos.forEach(projectLeveVo -> projectLeveVo.setPercentage(df.format(projectLeveVo.getCount() / sum)));
        return projectLeveVos;
    }
}




