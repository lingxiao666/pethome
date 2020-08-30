package cn.lingxiao.org.controller;

import cn.lingxiao.basic.util.AjaxResult;
import cn.lingxiao.basic.util.PageList;
import cn.lingxiao.org.domain.Employee;
import cn.lingxiao.org.query.EmployeeQuery;
import cn.lingxiao.org.service.IEmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@Api(tags = "员工接口controller",description = "员工接口详细描述")
public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;
    @ApiOperation(value = "员工添加或修改",notes = "如果有id就是修改否则就是添加")
    @PutMapping()
    public AjaxResult put(@RequestBody Employee employee) {
        try {
            if (employee.getId() == null) {
                employeeService.add(employee);
            } else {
                employeeService.update(employee);
            }
            return AjaxResult.all();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.all().setSuccess(false).setManager("操作失败");
        }

    }

    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable("id") Long id) {
        employeeService.delete(id);
        return AjaxResult.all();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable("id") Long id){
        return employeeService.findById(id);
    }

    @GetMapping
    public List<Employee> findAll() {
        List<Employee> list = employeeService.findAll();
        return list;
    }

    @PostMapping
    /*axos get不支持传对象*/
    public PageList<Employee> limit(@RequestBody EmployeeQuery query) {
        PageList<Employee> pageList = employeeService.queryData(query);
        return pageList;
    }
    @PatchMapping("/bulk")
    public AjaxResult bulkDelete(@RequestBody List<Long> ids) {
        try {
            employeeService.bulkDelete(ids);
            return AjaxResult.all();
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.all().setSuccess(false).setManager("删除失败" + e.getMessage());
        }
    }
}
