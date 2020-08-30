package cn.lingxiao.org.domain;

import cn.lingxiao.basic.domian.BaseDomain;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel(description = "部门数据")
public class Department extends BaseDomain {
    /*主键*//*
    @ApiModelProperty(value = "id")*/
    private Long id;
    /*部门编号*/
    @ApiModelProperty(value = "编号", required = true)
    private String sn;
    /*部门名称*/
    @ApiModelProperty(value = "名称")
    private String name;
    /*暂时不用*/
    @ApiModelProperty(value = "路径")
    private String dirPath;
    /*部门状态 0 正常 ，-1 停用*/
    @ApiModelProperty(value = "状态")
    private int state;
    private Employee manager;
    private Department parent;
    private List<Department> chailren;

}
