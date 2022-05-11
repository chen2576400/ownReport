package com.df.report.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.util.CollectionUtils;

/**
 * @author yangyu
 * @version 1.0
 */

@Slf4j
public class EntityUtils {
    /**
     * Object[] 转 Java Bean
     *
     * @param objectArray 原数组
     * @param clazz       目标 Bean
     * @param <T>
     * @return
     */
    public static <T> T objectArrayToBean(Object[] objectArray, Class<T> clazz) {
        if (objectArray == null || objectArray.length == 0) {
            return null;
        }
        Class<?>[] tClass = null;
        Constructor<?>[] constructors = clazz.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == objectArray.length) {
                tClass = parameterTypes;
                break;
            }
        }
        T t = null;
        try {
            t = clazz.getConstructor(tClass).newInstance(objectArray);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return t;
    }


    public static <T> List<T> objectArrayToBean(List<Object[]> objectArray, Class<T> clazz) {

        List<T> ts = new ArrayList<>();

        for (Object[] objects : objectArray) {
            if (objectArray == null || objects.length == 0) {
                return null;
            }
            Class<?>[] tClass = null;
            Constructor<?>[] constructors = clazz.getConstructors();
            for (int i = 0; i < constructors.length; i++) {
                Constructor<?> constructor = constructors[i];
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == objects.length) {
                    tClass = parameterTypes;
                    break;
                }
            }
            try {
                ts.add(clazz.getConstructor(tClass).newInstance(objects));
            } catch (Exception e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        }

        return ts;

    }

    /**
     * 将数组数据转换为实体类
     * 此处数组元素的顺序必须与实体类构造函数中的属性顺序一致
     *
     * @param list  数组对象集合
     * @param clazz 实体类
     * @param <T>   实体类
     * @param model 实例化的实体类
     * @return 实体类集合
     */
    public static <T> List<T> castEntityList(List<Object[]> list, Class<T> clazz, Object model) {
        List<T> returnList = new ArrayList<T>();
        if (list.isEmpty()) {
            return returnList;
        }
        //获取每个数组集合的元素个数
        Object[] co = list.get(0);

        //获取当前实体类的属性名、属性值、属性类别
        List<Map<String, Object>> attributeInfoList = getFiledsInfo(model);
        //创建属性类别数组
        Class[] c2 = new Class[attributeInfoList.size()];
        //如果数组集合元素个数与实体类属性个数不一致则发生错误
        if (attributeInfoList.size() != co.length) {
            return returnList;
        }
        //确定构造方法
        for (int i = 0; i < attributeInfoList.size(); i++) {
            c2[i] = (Class) attributeInfoList.get(i).get("type");
        }
        try {
            for (Object[] o : list) {
                Constructor<T> constructor = clazz.getConstructor(c2);
                returnList.add(constructor.newInstance(o));
            }
        } catch (Exception ex) {
            log.error("实体数据转化为实体类发生异常：异常信息：{}", ex.getMessage());
            return returnList;
        }
        return returnList;
    }

    /**
     * 功能描述: 〈数组转对象〉
     *
     * @param clazz   实体类
     * @param objects 数组
     * @param <T>     实体类
     * @param model   实例化的实体类
     * @return : T
     * @author : yangyu 2019/12/4 10:01
     */
    public static <T> T castEntity(Object[] objects, Class<T> clazz, Object model) {
        T t = null;
        List<Object[]> list = new ArrayList<>();
        if (objects.length > 0) {
            list.add(objects);
        }
        List<T> ts = castEntityList(list, clazz, model);
        if (!CollectionUtils.isEmpty(ts)) {
            t = ts.get(0);
        }
        return t;
    }

    /**
     * 根据属性名获取属性值
     *
     * @param fieldName 属性名
     * @param modle     实体类
     * @return 属性值
     */
    private static Object getFieldValueByName(String fieldName, Object modle) {
        try {
            String firstLetter = fieldName.substring(0, 1).toUpperCase();
            String getter = "get" + firstLetter + fieldName.substring(1);
            Method method = modle.getClass().getMethod(getter);
            return method.invoke(modle);
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 获取属性类型(type)，属性名(name)，属性值(value)的map组成的list
     *
     * @param model 实体类
     * @return list集合
     */
    private static List<Map<String, Object>> getFiledsInfo(Object model) {
        Field[] fields = model.getClass().getDeclaredFields();
        List<Map<String, Object>> list = new ArrayList<>(fields.length);
        Map<String, Object> infoMap = null;
        for (Field field : fields) {
            infoMap = new HashMap<>(3);
            infoMap.put("type", field.getType());
            infoMap.put("name", field.getName());
            infoMap.put("value", getFieldValueByName(field.getName(), model));
            if (!"serialVersionUID".equals(field.getName())) {
                list.add(infoMap);
            }
        }
        return list;
    }


}

