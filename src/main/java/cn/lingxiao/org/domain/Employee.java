package cn.lingxiao.org.domain;

import cn.lingxiao.basic.domian.BaseDomain;
import lombok.Data;

import java.util.List;

@Data
public class Employee extends BaseDomain {
    private String username;
    private String email;
    private String phone;
    private String password;
    private Integer age;
    private Integer state;
    private Department department;
}
