package com.wenqi.bootwebdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class MultiExtendedItemInfo {
    @JsonProperty("atc_cnt_30d")
    private String atcCnt30d;
    @JsonProperty("item_id")
    private String itemId;
    @JsonProperty("shop_name_en")
    private String shopNameEn;
    @JsonProperty("shop_name_local")
    private String shopNameLocal;
    @JsonProperty("shop_url")
    private String shopUrl;
    @JsonProperty("cate_name_en")
    private String cateNameEn;
    @JsonProperty("trend_names")
    private String trendNames;
    @JsonProperty("cate_name_local")
    private String cateNameLocal;
    @JsonProperty("shop_logo")
    private String shopLogo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
