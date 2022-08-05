package com.wenqi.bootwebdemo.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder // With this annotation, can do the following:
//        DummyData.builder().age("").name("").build();
public class DummyData {
    private String name;
    private String salary;
    private String age;
}
