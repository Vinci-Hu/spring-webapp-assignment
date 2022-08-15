package com.wenqi.bootwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // With this annotation, can do the following:
//        DummyData.builder().age("").name("").build();
@AllArgsConstructor
@NoArgsConstructor
public class DummyData {
    private String name;
    private String salary;
    private String age;
}
