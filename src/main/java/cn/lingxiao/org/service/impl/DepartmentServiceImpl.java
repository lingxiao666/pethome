package cn.lingxiao.org.service.impl;

import cn.lingxiao.basic.service.impl.BaseServiceImpl;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.mapper.DepartmentMapper;
import cn.lingxiao.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements IDepartmentService {
    /*因为有特有方法，所以需要在注入*/
    @Autowired
    private DepartmentMapper departmentMapper;

    /*上级部门查询*/
    @Override
    public List<Department> findTree() {
        return departmentMapper.loadTree();
    }
}
