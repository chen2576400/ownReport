package com.df.report.util;

import lombok.Data;
import org.springframework.data.domain.Page;

/**
 * @description:
 * @author: Mr.Nchen
 * @create: 2022-05-12 09:50
 **/
@Data
public class PageResult {
    private Boolean enble;//我自定义的

    // 当前页（从页面获取的当前页码，未计算）
    private int currentPage;
    // 前一页
    private int prevPage;
    // 下一页
    private int nextPage;
    // 尾页
    private int lastPage;
    // 总记录数
    private int count;
    // 每页的条数
    private int pageSize = 3;
    // 分页计入数（不包含当前页之前的所有的查询数）
    private int pageRecord;
    // 页面分页模型（传入页面使用的DOM）
    private String page;


//    /**
//     * @param currentPage 当前页
//     * @param pageSize    分页条数
//     * @param count       总记录数
//     * @return
//     */
//    public static PageResult ok(Integer currentPage, int pageSize, int count) {
//        return new PageResult(currentPage, pageSize, count);
//    }

    public PageResult(Boolean enble,String page) {
        this.enble=enble;
        this.page = page;
    }

    public static PageResult ok(PageVO pageVO, Integer count) {
//        return new PageResult(pageVO.getCurrent(), pageVO.getSize(), count, pageVO.getEnable());
        return new PageResult(pageVO, count);

    }


    // 有参构造器
    public PageResult(PageVO pageVO, Integer count) {
        initPageVO(pageVO);//为空时候给默认值
//        init(currentPage, pageSize, count);
        init(pageVO.getCurrent(), pageVO.getSize(), count);
        initLastPage();
        initCurrentPage();
        initPrevPage();
        initNextPage();
        initPageRecord();
        initPage();
    }

    // 初始化三个重要元素(当前页传入0 或者 空 都默认为1)
    private void init(Integer currentPage, int pageSize, int count) {
        if (currentPage == null || currentPage == 0) {
            currentPage = 1;
        }
        this.currentPage = currentPage;
        this.count = count;
        this.pageSize = pageSize;
    }

    // 初始化尾页
    private void initLastPage() {
        if (count % pageSize == 0) {
            lastPage = count / pageSize;
        } else {
            lastPage = count / pageSize + 1;
        }
    }

    // 初始化并矫正当前页(防止外部访问出错)
    private void initCurrentPage() {
        if (currentPage < 1) {
            currentPage = 1;
        } else if (currentPage > lastPage) {
            currentPage = lastPage;
        }
    }

    // 初始化上一页
    private void initPrevPage() {
        if (currentPage != 1) {
            prevPage = currentPage - 1;
        } else {
            prevPage = 1;
        }
    }

    // 初始化下一页
    private void initNextPage() {
        if (currentPage != lastPage) {
            nextPage = currentPage + 1;
        } else {
            nextPage = lastPage;
        }
    }

    // 初始化分页计入数
    private void initPageRecord() {
        pageRecord = (currentPage - 1) * pageSize;
        if (pageRecord < 0) {
            pageRecord = 0;
        }
    }

    // 初始化页面分页模型（按键中的class属性是bootstrap的样式）
    private void initPage() {
        page = "第" + currentPage + "/" + lastPage + "页，共" + count + "条记录。";
        page += "首页";
        page += "上一页";
        page += "下一页";
        page += "尾页";
    }


    public void initPageVO(PageVO pageVO) {
        pageVO.setEnable(pageVO.getEnable() != null && pageVO.getEnable());//默认不开启分页
        pageVO.setSize(pageVO.getSize() == null ? 10 : pageVO.getSize());//默认10条
        pageVO.setCurrent(pageVO.getCurrent() == null ? 1 : pageVO.getCurrent());//默认从第一页
        this.enble = pageVO.getEnable();
    }
}
