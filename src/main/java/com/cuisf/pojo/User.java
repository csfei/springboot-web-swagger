package com.cuisf.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("用户实体类")
public class User {

    @ApiModelProperty("用户名")
    public String name;

    private Integer age;
}
