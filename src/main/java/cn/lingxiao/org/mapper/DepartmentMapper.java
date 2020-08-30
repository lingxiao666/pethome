package cn.lingxiao.org.mapper;

import cn.lingxiao.basic.mapper.BaseMapper;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.query.DepartmentQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface DepartmentMapper extends BaseMapper<Department> {


    /*部门查询*/
    List<Department> loadTree();
}
