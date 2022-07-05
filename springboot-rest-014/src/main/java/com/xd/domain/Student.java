package com.xd.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student {
    private Integer id;
    private String name;
    private Integer age;
}
