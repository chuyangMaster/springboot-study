package com.xd.model;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class SysUser {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
}
