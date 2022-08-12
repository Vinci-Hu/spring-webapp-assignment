package com.wenqi.bootwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MultiThreadCallRequestDTO {
    private int appid;
    private int scene;
    private int user_id;
    private int pageSize;
    private int thread_cnt;
}
