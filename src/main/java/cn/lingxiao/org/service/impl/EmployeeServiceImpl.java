package cn.lingxiao.org.service.impl;

import cn.lingxiao.basic.service.impl.BaseServiceImpl;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Employee;
import cn.lingxiao.org.mapper.EmployeeMapper;
import cn.lingxiao.org.query.EmployeeQuery;
import cn.lingxiao.org.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {

}
