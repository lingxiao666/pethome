package cn.lingxiao.basic.util;

import lombok.Data;
/*
* 返回数据分装类
* */
@Data
public class AjaxResult {
    private boolean success = true;
    private String manager="操作成功";
    /*返回页面的数据*/
    private Object object;

    public AjaxResult(boolean success, String manager, Object object) {
        this.success = success;
        this.manager = manager;
        this.object = object;
    }

    public AjaxResult() {
    }

    public static AjaxResult all(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getManager() {
        return manager;
    }

    public AjaxResult setManager(String manager) {
        this.manager = manager;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxResult setObject(Object object) {
        this.object = object;
        return this;
    }
}
