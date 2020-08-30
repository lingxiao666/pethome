package cn.lingxiao;

import cn.lingxiao.org.domain.Department;
import org.junit.Test;

public class PethomeTest {
    @Test
    public void test(){
        Department department = new Department();
        department.setName("niubi");
        System.out.println(department);
    }
}
