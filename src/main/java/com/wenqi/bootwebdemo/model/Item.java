package com.wenqi.bootwebdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    private long itemId;
    private String itemTitle;
    private double itemPrice;
    private int itemSoldCnt;
    private int stockAvailable;
    private String itemUrl;
    private long shopId;
}
