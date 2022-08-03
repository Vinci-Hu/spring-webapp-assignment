package com.wenqi.bootwebdemo.model;

public class DummyResponse {
    private String status;
    private DummyData data;
    private String message;

    @Override
    public String toString() {
        return "DummyResponse{" +
                "status='" + status + '\'' +
                ", data=" + data.toString() +
                ", message='" + message + '\'' +
                '}';
    }
}
