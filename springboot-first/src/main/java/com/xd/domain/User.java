package com.xd.domain;

import lombok.*;

@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    private String name;
    private Integer id;
    private Car car;

    public User(String name, Integer id){
        this.name = name;
        this.id = id;
    }
}
