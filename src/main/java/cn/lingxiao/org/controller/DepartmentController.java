package cn.lingxiao.org.controller;

import cn.lingxiao.basic.util.AjaxResult;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Department;
import cn.lingxiao.org.query.DepartmentQuery;
import cn.lingxiao.org.service.IDepartmentService;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
@Api(tags = "部门接口controller", description = "部门接口详细描述")
public class DepartmentController {
    @Autowired
    private IDepartmentService departmentService;

    @ApiOperation(value = "部门添加或修改", notes = "如果有id就是修改否则就是添加")
    @PutMapping()
    public AjaxResult put(@RequestBody Department department) {
        try {
            if (department.getId() == null) {
                departmentService.add(department);
            } else {
                departmentService.update(department);
            }
            return AjaxResult.all();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.all().setSuccess(false).setManager("操作失败");
        }

    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable("id") Long id) {
        departmentService.delete(id);
        return AjaxResult.all();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long id) {
        return departmentService.findById(id);
    }

    @GetMapping
    public List<Department> findAll() {
        List<Department> list = departmentService.findAll();
        return list;
    }

    @PostMapping
    /*axos get不支持传对象*/
    public PageList<Department> limit(@RequestBody DepartmentQuery query) {
        PageList<Department> pageList = departmentService.queryData(query);
        return pageList;
    }

    @PatchMapping("/bulk")
    public AjaxResult bulkDelete(@RequestBody List<Long> ids) {
        try {
            departmentService.bulkDelete(ids);
            return AjaxResult.all();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.all().setSuccess(false).setManager("删除失败" + e.getMessage());
        }
    }

    @GetMapping("/tree")
    public List<Department> fingdTree() {
        return departmentService.findTree();
    }
}
