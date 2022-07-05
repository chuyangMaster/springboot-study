package com.xd.domain;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Student implements Serializable {
    private static final long serialVersionUID = 7929168611598307686L;
    private Integer id;
    private String name;
    private Integer age;
}
