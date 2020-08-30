package cn.lingxiao.basic.mapper;

import cn.lingxiao.basic.query.BaseQuery;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.query.DepartmentQuery;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BaseMapper<T>{
    void save(T d);

    void remove(Long id);

    void update(T d);

    T loadById(Long id);

    List<T> loadAll();

    /**
     * 分页查询
     */
    //查询总条数
    Long queryCount(BaseQuery query);

    //查询当前的页数据
    List<T> queryData(BaseQuery query);

    /*批量删除*/
    void bulkRemove(List<Long> ids);

}
