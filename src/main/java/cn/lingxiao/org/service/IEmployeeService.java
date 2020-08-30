package cn.lingxiao.org.service;

import cn.lingxiao.basic.service.IBaseService;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Employee;
import cn.lingxiao.org.query.EmployeeQuery;

import java.util.List;

public interface IEmployeeService extends IBaseService<Employee> {

   /* void add(Employee employee);

    void delete(Long id);

    void update(Employee employee);

    Employee findById(Long id);

    List<Employee> findAll();

    *//**
     * 分页查询
     *//*

    PageList<Employee> queryData(EmployeeQuery query);

    void bulkDelete(List<Long> ids);*/
}
