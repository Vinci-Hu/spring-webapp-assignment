
package com.wenqi.bootwebdemo.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "atc_cnt_30d",
    "item_id",
    "shop_name_en",
    "shop_name_local",
    "shop_url",
    "cate_name_en",
    "trend_names",
    "cate_name_local",
    "shop_logo"
})
@Generated("jsonschema2pojo")
public class ExtendedItemInfo {

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

    @JsonProperty("atc_cnt_30d")
    public String getAtcCnt30d() {
        return atcCnt30d;
    }

    @JsonProperty("atc_cnt_30d")
    public void setAtcCnt30d(String atcCnt30d) {
        this.atcCnt30d = atcCnt30d;
    }

    public ExtendedItemInfo withAtcCnt30d(String atcCnt30d) {
        this.atcCnt30d = atcCnt30d;
        return this;
    }

    @JsonProperty("item_id")
    public String getItemId() {
        return itemId;
    }

    @JsonProperty("item_id")
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public ExtendedItemInfo withItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }

    @JsonProperty("shop_name_en")
    public String getShopNameEn() {
        return shopNameEn;
    }

    @JsonProperty("shop_name_en")
    public void setShopNameEn(String shopNameEn) {
        this.shopNameEn = shopNameEn;
    }

    public ExtendedItemInfo withShopNameEn(String shopNameEn) {
        this.shopNameEn = shopNameEn;
        return this;
    }

    @JsonProperty("shop_name_local")
    public String getShopNameLocal() {
        return shopNameLocal;
    }

    @JsonProperty("shop_name_local")
    public void setShopNameLocal(String shopNameLocal) {
        this.shopNameLocal = shopNameLocal;
    }

    public ExtendedItemInfo withShopNameLocal(String shopNameLocal) {
        this.shopNameLocal = shopNameLocal;
        return this;
    }

    @JsonProperty("shop_url")
    public String getShopUrl() {
        return shopUrl;
    }

    @JsonProperty("shop_url")
    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public ExtendedItemInfo withShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
        return this;
    }

    @JsonProperty("cate_name_en")
    public String getCateNameEn() {
        return cateNameEn;
    }

    @JsonProperty("cate_name_en")
    public void setCateNameEn(String cateNameEn) {
        this.cateNameEn = cateNameEn;
    }

    public ExtendedItemInfo withCateNameEn(String cateNameEn) {
        this.cateNameEn = cateNameEn;
        return this;
    }

    @JsonProperty("trend_names")
    public String getTrendNames() {
        return trendNames;
    }

    @JsonProperty("trend_names")
    public void setTrendNames(String trendNames) {
        this.trendNames = trendNames;
    }

    public ExtendedItemInfo withTrendNames(String trendNames) {
        this.trendNames = trendNames;
        return this;
    }

    @JsonProperty("cate_name_local")
    public String getCateNameLocal() {
        return cateNameLocal;
    }

    @JsonProperty("cate_name_local")
    public void setCateNameLocal(String cateNameLocal) {
        this.cateNameLocal = cateNameLocal;
    }

    public ExtendedItemInfo withCateNameLocal(String cateNameLocal) {
        this.cateNameLocal = cateNameLocal;
        return this;
    }

    @JsonProperty("shop_logo")
    public String getShopLogo() {
        return shopLogo;
    }

    @JsonProperty("shop_logo")
    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public ExtendedItemInfo withShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public ExtendedItemInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ExtendedItemInfo.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("atcCnt30d");
        sb.append('=');
        sb.append(((this.atcCnt30d == null)?"<null>":this.atcCnt30d));
        sb.append(',');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null)?"<null>":this.itemId));
        sb.append(',');
        sb.append("shopNameEn");
        sb.append('=');
        sb.append(((this.shopNameEn == null)?"<null>":this.shopNameEn));
        sb.append(',');
        sb.append("shopNameLocal");
        sb.append('=');
        sb.append(((this.shopNameLocal == null)?"<null>":this.shopNameLocal));
        sb.append(',');
        sb.append("shopUrl");
        sb.append('=');
        sb.append(((this.shopUrl == null)?"<null>":this.shopUrl));
        sb.append(',');
        sb.append("cateNameEn");
        sb.append('=');
        sb.append(((this.cateNameEn == null)?"<null>":this.cateNameEn));
        sb.append(',');
        sb.append("trendNames");
        sb.append('=');
        sb.append(((this.trendNames == null)?"<null>":this.trendNames));
        sb.append(',');
        sb.append("cateNameLocal");
        sb.append('=');
        sb.append(((this.cateNameLocal == null)?"<null>":this.cateNameLocal));
        sb.append(',');
        sb.append("shopLogo");
        sb.append('=');
        sb.append(((this.shopLogo == null)?"<null>":this.shopLogo));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.itemId == null)? 0 :this.itemId.hashCode()));
        result = ((result* 31)+((this.shopNameEn == null)? 0 :this.shopNameEn.hashCode()));
        result = ((result* 31)+((this.cateNameLocal == null)? 0 :this.cateNameLocal.hashCode()));
        result = ((result* 31)+((this.cateNameEn == null)? 0 :this.cateNameEn.hashCode()));
        result = ((result* 31)+((this.shopLogo == null)? 0 :this.shopLogo.hashCode()));
        result = ((result* 31)+((this.atcCnt30d == null)? 0 :this.atcCnt30d.hashCode()));
        result = ((result* 31)+((this.trendNames == null)? 0 :this.trendNames.hashCode()));
        result = ((result* 31)+((this.shopNameLocal == null)? 0 :this.shopNameLocal.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.shopUrl == null)? 0 :this.shopUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedItemInfo) == false) {
            return false;
        }
        ExtendedItemInfo rhs = ((ExtendedItemInfo) other);
        return (((((((((((this.itemId == rhs.itemId)||((this.itemId!= null)&&this.itemId.equals(rhs.itemId)))&&((this.shopNameEn == rhs.shopNameEn)||((this.shopNameEn!= null)&&this.shopNameEn.equals(rhs.shopNameEn))))&&((this.cateNameLocal == rhs.cateNameLocal)||((this.cateNameLocal!= null)&&this.cateNameLocal.equals(rhs.cateNameLocal))))&&((this.cateNameEn == rhs.cateNameEn)||((this.cateNameEn!= null)&&this.cateNameEn.equals(rhs.cateNameEn))))&&((this.shopLogo == rhs.shopLogo)||((this.shopLogo!= null)&&this.shopLogo.equals(rhs.shopLogo))))&&((this.atcCnt30d == rhs.atcCnt30d)||((this.atcCnt30d!= null)&&this.atcCnt30d.equals(rhs.atcCnt30d))))&&((this.trendNames == rhs.trendNames)||((this.trendNames!= null)&&this.trendNames.equals(rhs.trendNames))))&&((this.shopNameLocal == rhs.shopNameLocal)||((this.shopNameLocal!= null)&&this.shopNameLocal.equals(rhs.shopNameLocal))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.shopUrl == rhs.shopUrl)||((this.shopUrl!= null)&&this.shopUrl.equals(rhs.shopUrl))));
    }

}
