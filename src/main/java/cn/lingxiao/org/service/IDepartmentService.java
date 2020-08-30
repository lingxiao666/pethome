package cn.lingxiao.org.service;

import cn.lingxiao.basic.service.IBaseService;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.query.DepartmentQuery;

import java.util.List;

public interface IDepartmentService extends IBaseService<Department> {


    List<Department> findTree();
}
