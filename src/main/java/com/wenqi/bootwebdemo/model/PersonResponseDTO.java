package com.wenqi.bootwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PersonResponseDTO {
    private String status;
    private Person person;
    private String greeting;
}
