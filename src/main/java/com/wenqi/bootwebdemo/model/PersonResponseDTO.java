package com.wenqi.bootwebdemo.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonResponseDTO {
    private String status;
    private Person person;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
