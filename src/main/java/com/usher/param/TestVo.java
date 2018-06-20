package com.usher.param;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Author: Usher
 * @Description:
 */
@Getter
@Setter
public class TestVo {
    @NotBlank
    private String msg;

    @NotNull(message = "id不能为空")
    @Max(value = 10,message = "id不能大于10")
    @Min(value = 0,message = "id至少大于等于0")
    private Integer id;

    private List<String> strings;
}
