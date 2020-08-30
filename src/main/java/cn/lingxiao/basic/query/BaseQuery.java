package cn.lingxiao.basic.query;

public class BaseQuery {
    private Long currentPage = 1L;
    private Long pageSize = 10l;
    private String keyWord;

    /**/
    private Long getStart() {
        return (this.currentPage - 1) * pageSize;
    }
}

