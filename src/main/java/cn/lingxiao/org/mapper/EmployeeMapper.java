package cn.lingxiao.org.mapper;

import cn.lingxiao.basic.mapper.BaseMapper;
import cn.lingxiao.org.domain.Employee;
import cn.lingxiao.org.query.EmployeeQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper extends BaseMapper<Employee> {

   /* void save(Employee employee);

    void remove(Long id);

    void update(Employee employee);

    Employee loadById(Long id);

    List<Employee> loadAll();

    *//**
     * 分页查询
     *//*
    //查询总条数
    Long queryCount(EmployeeQuery query);

    //查询当前的页数
    List<Employee> queryData(EmployeeQuery query);

    *//*批量删除*//*
    void bulkRemove(List<Long> ids);*/
}
