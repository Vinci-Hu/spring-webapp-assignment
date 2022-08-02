package com.wenqi.bootwebdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
    private long itemId;
    private String title;
    private double price;
    private int sold;
    private int stock;
    private String url;
    private long shopId;

    public Item() {
    }

    public Item(long itemId, String title, double price, int sold, int stock, String url, long shopId) {
        this.itemId = itemId;
        this.title = title;
        this.price = price;
        this.sold = sold;
        this.stock = stock;
        this.url = url;
        this.shopId = shopId;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getShopId() {
        return shopId;
    }

    public void setShopId(long shopId) {
        this.shopId = shopId;
    }

    public String toQueryString(){
        // 100, 'Zara', 'Ali', 18
        String value = String.valueOf(itemId) + ", "
                + String.valueOf(price) + ", "
                + String.valueOf(shopId) + ", "
                + String.valueOf(sold) + ", "
                + String.valueOf(stock) + ", '"
                + title + "', '"
                + url + "'"

                ;
        // long itemId, String title, double price, int sold, int stock, String url, long shopId
        return value;
    }
}
