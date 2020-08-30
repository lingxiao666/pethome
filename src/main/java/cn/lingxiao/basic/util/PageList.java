package cn.lingxiao.basic.util;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
/*
* 分页查询封装类
* */
@Data
public class PageList<T> {
    private Long total =0L;
    private List<T> data=new ArrayList<>();

    public PageList() {
    }

    public PageList(Long total, List<T> data) {
        this.total = total;
        this.data = data;
    }
}
