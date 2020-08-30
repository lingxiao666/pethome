package cn.lingxiao.org.query;

import cn.lingxiao.basic.query.BaseQuery;
import lombok.Data;

@Data
public class EmployeeQuery extends BaseQuery {
  /*  private Long currentPage = 1L;
    private Long pageSize = 10L;
    private String keyWord;

    *//**//*
    private Long getStart() {
        return (this.currentPage - 1) * pageSize;
    }*/
}
