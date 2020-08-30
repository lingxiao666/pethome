package cn.lingxiao.basic.service;

import cn.lingxiao.basic.query.BaseQuery;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.query.DepartmentQuery;

import java.util.List;

public interface IBaseService<T> {
    void add(T t);

    void delete(Long id);

    void update(T t);

    T findById(Long id);

    List<T> findAll();

    /**
     * 分页查询
     */

    PageList<T> queryData(BaseQuery query);

    void bulkDelete(List<Long> ids);
}
