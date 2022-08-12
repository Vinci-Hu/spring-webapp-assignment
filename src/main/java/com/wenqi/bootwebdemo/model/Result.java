package com.wenqi.bootwebdemo.model;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"itemWantedStr", "itemTitle", "itemSoldCnt", "extendedItemInfo", "matchType", "clickTrackInfo", "itemDiscount", "express", "itemWantedCnt", "itemRegion", "promotionTag", "shopNameLocal", "type", "stockAvailable", "itemImg", "sellerId", "itemRatingScore", "itemDiscountPrice", "itemDiscountRaw", "isGc", "currency", "shopId", "isOfficialStore", "auctionType", "skuId", "idStr", "catIdLv1", "shopNameEn", "trackInfo", "isSoldByLazada", "isCertified", "shopLogo", "center", "itemDiscountPriceShow", "itemPriceShow", "shopUrl", "itemInstallment", "itemId", "catId", "categoryLv3Name", "itemReviews", "mainTitle", "brandId", "getTbc", "currencyFlag", "itemPrice", "location", "itemUrl"})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("itemWantedStr")
    private String itemWantedStr;
    @JsonProperty("itemTitle")
    private String itemTitle;
    @JsonProperty("itemSoldCnt")
    private Integer itemSoldCnt;
    @JsonProperty("extendedItemInfo")
    private ExtendedItemInfo extendedItemInfo;
    @JsonProperty("matchType")
    private String matchType;
    @JsonProperty("clickTrackInfo")
    private String clickTrackInfo;
    @JsonProperty("itemDiscount")
    private String itemDiscount;
    @JsonProperty("express")
    private Boolean express;
    @JsonProperty("itemWantedCnt")
    private Integer itemWantedCnt;
    @JsonProperty("itemRegion")
    private String itemRegion;
    @JsonProperty("promotionTag")
    private String promotionTag;
    @JsonProperty("shopNameLocal")
    private String shopNameLocal;
    @JsonProperty("type")
    private String type;
    @JsonProperty("stockAvailable")
    private String stockAvailable;
    @JsonProperty("itemImg")
    private String itemImg;
    @JsonProperty("sellerId")
    private String sellerId;
    @JsonProperty("itemRatingScore")
    private Integer itemRatingScore;
    @JsonProperty("itemDiscountPrice")
    private String itemDiscountPrice;
    @JsonProperty("itemDiscountRaw")
    private Integer itemDiscountRaw;
    @JsonProperty("isGc")
    private Boolean isGc;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("shopId")
    private Integer shopId;
    @JsonProperty("isOfficialStore")
    private Boolean isOfficialStore;
    @JsonProperty("auctionType")
    private String auctionType;
    @JsonProperty("skuId")
    private String skuId;
    @JsonProperty("idStr")
    private String idStr;
    @JsonProperty("catIdLv1")
    private Integer catIdLv1;
    @JsonProperty("shopNameEn")
    private String shopNameEn;
    @JsonProperty("trackInfo")
    private String trackInfo;
    @JsonProperty("isSoldByLazada")
    private Boolean isSoldByLazada;
    @JsonProperty("isCertified")
    private Boolean isCertified;
    @JsonProperty("shopLogo")
    private String shopLogo;
    @JsonProperty("center")
    private String center;
    @JsonProperty("itemDiscountPriceShow")
    private String itemDiscountPriceShow;
    @JsonProperty("itemPriceShow")
    private String itemPriceShow;
    @JsonProperty("shopUrl")
    private String shopUrl;
    @JsonProperty("itemInstallment")
    private Boolean itemInstallment;
    @JsonProperty("itemId")
    private Long itemId;
    @JsonProperty("catId")
    private Integer catId;
    @JsonProperty("categoryLv3Name")
    private String categoryLv3Name;
    @JsonProperty("itemReviews")
    private String itemReviews;
    @JsonProperty("mainTitle")
    private String mainTitle;
    @JsonProperty("brandId")
    private Integer brandId;
    @JsonProperty("getTbc")
    private Boolean getTbc;
    @JsonProperty("currencyFlag")
    private String currencyFlag;
    @JsonProperty("itemPrice")
    private String itemPrice;
    @JsonProperty("location")
    private String location;
    @JsonProperty("itemUrl")
    private String itemUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("itemWantedStr")
    public String getItemWantedStr() {
        return itemWantedStr;
    }

    @JsonProperty("itemWantedStr")
    public void setItemWantedStr(String itemWantedStr) {
        this.itemWantedStr = itemWantedStr;
    }

    public Result withItemWantedStr(String itemWantedStr) {
        this.itemWantedStr = itemWantedStr;
        return this;
    }

    @JsonProperty("itemTitle")
    public String getItemTitle() {
        return itemTitle;
    }

    @JsonProperty("itemTitle")
    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Result withItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }

    @JsonProperty("itemSoldCnt")
    public Integer getItemSoldCnt() {
        return itemSoldCnt;
    }

    @JsonProperty("itemSoldCnt")
    public void setItemSoldCnt(Integer itemSoldCnt) {
        this.itemSoldCnt = itemSoldCnt;
    }

    public Result withItemSoldCnt(Integer itemSoldCnt) {
        this.itemSoldCnt = itemSoldCnt;
        return this;
    }

    @JsonProperty("extendedItemInfo")
    public ExtendedItemInfo getExtendedItemInfo() {
        return extendedItemInfo;
    }

    @JsonProperty("extendedItemInfo")
    public void setExtendedItemInfo(ExtendedItemInfo extendedItemInfo) {
        this.extendedItemInfo = extendedItemInfo;
    }

    public Result withExtendedItemInfo(ExtendedItemInfo extendedItemInfo) {
        this.extendedItemInfo = extendedItemInfo;
        return this;
    }

    @JsonProperty("matchType")
    public String getMatchType() {
        return matchType;
    }

    @JsonProperty("matchType")
    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public Result withMatchType(String matchType) {
        this.matchType = matchType;
        return this;
    }

    @JsonProperty("clickTrackInfo")
    public String getClickTrackInfo() {
        return clickTrackInfo;
    }

    @JsonProperty("clickTrackInfo")
    public void setClickTrackInfo(String clickTrackInfo) {
        this.clickTrackInfo = clickTrackInfo;
    }

    public Result withClickTrackInfo(String clickTrackInfo) {
        this.clickTrackInfo = clickTrackInfo;
        return this;
    }

    @JsonProperty("itemDiscount")
    public String getItemDiscount() {
        return itemDiscount;
    }

    @JsonProperty("itemDiscount")
    public void setItemDiscount(String itemDiscount) {
        this.itemDiscount = itemDiscount;
    }

    public Result withItemDiscount(String itemDiscount) {
        this.itemDiscount = itemDiscount;
        return this;
    }

    @JsonProperty("express")
    public Boolean getExpress() {
        return express;
    }

    @JsonProperty("express")
    public void setExpress(Boolean express) {
        this.express = express;
    }

    public Result withExpress(Boolean express) {
        this.express = express;
        return this;
    }

    @JsonProperty("itemWantedCnt")
    public Integer getItemWantedCnt() {
        return itemWantedCnt;
    }

    @JsonProperty("itemWantedCnt")
    public void setItemWantedCnt(Integer itemWantedCnt) {
        this.itemWantedCnt = itemWantedCnt;
    }

    public Result withItemWantedCnt(Integer itemWantedCnt) {
        this.itemWantedCnt = itemWantedCnt;
        return this;
    }

    @JsonProperty("itemRegion")
    public String getItemRegion() {
        return itemRegion;
    }

    @JsonProperty("itemRegion")
    public void setItemRegion(String itemRegion) {
        this.itemRegion = itemRegion;
    }

    public Result withItemRegion(String itemRegion) {
        this.itemRegion = itemRegion;
        return this;
    }

    @JsonProperty("promotionTag")
    public String getPromotionTag() {
        return promotionTag;
    }

    @JsonProperty("promotionTag")
    public void setPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
    }

    public Result withPromotionTag(String promotionTag) {
        this.promotionTag = promotionTag;
        return this;
    }

    @JsonProperty("shopNameLocal")
    public String getShopNameLocal() {
        return shopNameLocal;
    }

    @JsonProperty("shopNameLocal")
    public void setShopNameLocal(String shopNameLocal) {
        this.shopNameLocal = shopNameLocal;
    }

    public Result withShopNameLocal(String shopNameLocal) {
        this.shopNameLocal = shopNameLocal;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Result withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("stockAvailable")
    public String getStockAvailable() {
        return stockAvailable;
    }

    @JsonProperty("stockAvailable")
    public void setStockAvailable(String stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public Result withStockAvailable(String stockAvailable) {
        this.stockAvailable = stockAvailable;
        return this;
    }

    @JsonProperty("itemImg")
    public String getItemImg() {
        return itemImg;
    }

    @JsonProperty("itemImg")
    public void setItemImg(String itemImg) {
        this.itemImg = itemImg;
    }

    public Result withItemImg(String itemImg) {
        this.itemImg = itemImg;
        return this;
    }

    @JsonProperty("sellerId")
    public String getSellerId() {
        return sellerId;
    }

    @JsonProperty("sellerId")
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public Result withSellerId(String sellerId) {
        this.sellerId = sellerId;
        return this;
    }

    @JsonProperty("itemRatingScore")
    public Integer getItemRatingScore() {
        return itemRatingScore;
    }

    @JsonProperty("itemRatingScore")
    public void setItemRatingScore(Integer itemRatingScore) {
        this.itemRatingScore = itemRatingScore;
    }

    public Result withItemRatingScore(Integer itemRatingScore) {
        this.itemRatingScore = itemRatingScore;
        return this;
    }

    @JsonProperty("itemDiscountPrice")
    public String getItemDiscountPrice() {
        return itemDiscountPrice;
    }

    @JsonProperty("itemDiscountPrice")
    public void setItemDiscountPrice(String itemDiscountPrice) {
        this.itemDiscountPrice = itemDiscountPrice;
    }

    public Result withItemDiscountPrice(String itemDiscountPrice) {
        this.itemDiscountPrice = itemDiscountPrice;
        return this;
    }

    @JsonProperty("itemDiscountRaw")
    public Integer getItemDiscountRaw() {
        return itemDiscountRaw;
    }

    @JsonProperty("itemDiscountRaw")
    public void setItemDiscountRaw(Integer itemDiscountRaw) {
        this.itemDiscountRaw = itemDiscountRaw;
    }

    public Result withItemDiscountRaw(Integer itemDiscountRaw) {
        this.itemDiscountRaw = itemDiscountRaw;
        return this;
    }

    @JsonProperty("isGc")
    public Boolean getIsGc() {
        return isGc;
    }

    @JsonProperty("isGc")
    public void setIsGc(Boolean isGc) {
        this.isGc = isGc;
    }

    public Result withIsGc(Boolean isGc) {
        this.isGc = isGc;
        return this;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Result withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @JsonProperty("shopId")
    public Integer getShopId() {
        return shopId;
    }

    @JsonProperty("shopId")
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Result withShopId(Integer shopId) {
        this.shopId = shopId;
        return this;
    }

    @JsonProperty("isOfficialStore")
    public Boolean getIsOfficialStore() {
        return isOfficialStore;
    }

    @JsonProperty("isOfficialStore")
    public void setIsOfficialStore(Boolean isOfficialStore) {
        this.isOfficialStore = isOfficialStore;
    }

    public Result withIsOfficialStore(Boolean isOfficialStore) {
        this.isOfficialStore = isOfficialStore;
        return this;
    }

    @JsonProperty("auctionType")
    public String getAuctionType() {
        return auctionType;
    }

    @JsonProperty("auctionType")
    public void setAuctionType(String auctionType) {
        this.auctionType = auctionType;
    }

    public Result withAuctionType(String auctionType) {
        this.auctionType = auctionType;
        return this;
    }

    @JsonProperty("skuId")
    public String getSkuId() {
        return skuId;
    }

    @JsonProperty("skuId")
    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Result withSkuId(String skuId) {
        this.skuId = skuId;
        return this;
    }

    @JsonProperty("idStr")
    public String getIdStr() {
        return idStr;
    }

    @JsonProperty("idStr")
    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public Result withIdStr(String idStr) {
        this.idStr = idStr;
        return this;
    }

    @JsonProperty("catIdLv1")
    public Integer getCatIdLv1() {
        return catIdLv1;
    }

    @JsonProperty("catIdLv1")
    public void setCatIdLv1(Integer catIdLv1) {
        this.catIdLv1 = catIdLv1;
    }

    public Result withCatIdLv1(Integer catIdLv1) {
        this.catIdLv1 = catIdLv1;
        return this;
    }

    @JsonProperty("shopNameEn")
    public String getShopNameEn() {
        return shopNameEn;
    }

    @JsonProperty("shopNameEn")
    public void setShopNameEn(String shopNameEn) {
        this.shopNameEn = shopNameEn;
    }

    public Result withShopNameEn(String shopNameEn) {
        this.shopNameEn = shopNameEn;
        return this;
    }

    @JsonProperty("trackInfo")
    public String getTrackInfo() {
        return trackInfo;
    }

    @JsonProperty("trackInfo")
    public void setTrackInfo(String trackInfo) {
        this.trackInfo = trackInfo;
    }

    public Result withTrackInfo(String trackInfo) {
        this.trackInfo = trackInfo;
        return this;
    }

    @JsonProperty("isSoldByLazada")
    public Boolean getIsSoldByLazada() {
        return isSoldByLazada;
    }

    @JsonProperty("isSoldByLazada")
    public void setIsSoldByLazada(Boolean isSoldByLazada) {
        this.isSoldByLazada = isSoldByLazada;
    }

    public Result withIsSoldByLazada(Boolean isSoldByLazada) {
        this.isSoldByLazada = isSoldByLazada;
        return this;
    }

    @JsonProperty("isCertified")
    public Boolean getIsCertified() {
        return isCertified;
    }

    @JsonProperty("isCertified")
    public void setIsCertified(Boolean isCertified) {
        this.isCertified = isCertified;
    }

    public Result withIsCertified(Boolean isCertified) {
        this.isCertified = isCertified;
        return this;
    }

    @JsonProperty("shopLogo")
    public String getShopLogo() {
        return shopLogo;
    }

    @JsonProperty("shopLogo")
    public void setShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
    }

    public Result withShopLogo(String shopLogo) {
        this.shopLogo = shopLogo;
        return this;
    }

    @JsonProperty("center")
    public String getCenter() {
        return center;
    }

    @JsonProperty("center")
    public void setCenter(String center) {
        this.center = center;
    }

    public Result withCenter(String center) {
        this.center = center;
        return this;
    }

    @JsonProperty("itemDiscountPriceShow")
    public String getItemDiscountPriceShow() {
        return itemDiscountPriceShow;
    }

    @JsonProperty("itemDiscountPriceShow")
    public void setItemDiscountPriceShow(String itemDiscountPriceShow) {
        this.itemDiscountPriceShow = itemDiscountPriceShow;
    }

    public Result withItemDiscountPriceShow(String itemDiscountPriceShow) {
        this.itemDiscountPriceShow = itemDiscountPriceShow;
        return this;
    }

    @JsonProperty("itemPriceShow")
    public String getItemPriceShow() {
        return itemPriceShow;
    }

    @JsonProperty("itemPriceShow")
    public void setItemPriceShow(String itemPriceShow) {
        this.itemPriceShow = itemPriceShow;
    }

    public Result withItemPriceShow(String itemPriceShow) {
        this.itemPriceShow = itemPriceShow;
        return this;
    }

    @JsonProperty("shopUrl")
    public String getShopUrl() {
        return shopUrl;
    }

    @JsonProperty("shopUrl")
    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public Result withShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
        return this;
    }

    @JsonProperty("itemInstallment")
    public Boolean getItemInstallment() {
        return itemInstallment;
    }

    @JsonProperty("itemInstallment")
    public void setItemInstallment(Boolean itemInstallment) {
        this.itemInstallment = itemInstallment;
    }

    public Result withItemInstallment(Boolean itemInstallment) {
        this.itemInstallment = itemInstallment;
        return this;
    }

    @JsonProperty("itemId")
    public Long getItemId() {
        return itemId;
    }

    @JsonProperty("itemId")
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Result withItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }

    @JsonProperty("catId")
    public Integer getCatId() {
        return catId;
    }

    @JsonProperty("catId")
    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Result withCatId(Integer catId) {
        this.catId = catId;
        return this;
    }

    @JsonProperty("categoryLv3Name")
    public String getCategoryLv3Name() {
        return categoryLv3Name;
    }

    @JsonProperty("categoryLv3Name")
    public void setCategoryLv3Name(String categoryLv3Name) {
        this.categoryLv3Name = categoryLv3Name;
    }

    public Result withCategoryLv3Name(String categoryLv3Name) {
        this.categoryLv3Name = categoryLv3Name;
        return this;
    }

    @JsonProperty("itemReviews")
    public String getItemReviews() {
        return itemReviews;
    }

    @JsonProperty("itemReviews")
    public void setItemReviews(String itemReviews) {
        this.itemReviews = itemReviews;
    }

    public Result withItemReviews(String itemReviews) {
        this.itemReviews = itemReviews;
        return this;
    }

    @JsonProperty("mainTitle")
    public String getMainTitle() {
        return mainTitle;
    }

    @JsonProperty("mainTitle")
    public void setMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
    }

    public Result withMainTitle(String mainTitle) {
        this.mainTitle = mainTitle;
        return this;
    }

    @JsonProperty("brandId")
    public Integer getBrandId() {
        return brandId;
    }

    @JsonProperty("brandId")
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public Result withBrandId(Integer brandId) {
        this.brandId = brandId;
        return this;
    }

    @JsonProperty("getTbc")
    public Boolean getGetTbc() {
        return getTbc;
    }

    @JsonProperty("getTbc")
    public void setGetTbc(Boolean getTbc) {
        this.getTbc = getTbc;
    }

    public Result withGetTbc(Boolean getTbc) {
        this.getTbc = getTbc;
        return this;
    }

    @JsonProperty("currencyFlag")
    public String getCurrencyFlag() {
        return currencyFlag;
    }

    @JsonProperty("currencyFlag")
    public void setCurrencyFlag(String currencyFlag) {
        this.currencyFlag = currencyFlag;
    }

    public Result withCurrencyFlag(String currencyFlag) {
        this.currencyFlag = currencyFlag;
        return this;
    }

    @JsonProperty("itemPrice")
    public String getItemPrice() {
        return itemPrice;
    }

    @JsonProperty("itemPrice")
    public void setItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
    }

    public Result withItemPrice(String itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    public Result withLocation(String location) {
        this.location = location;
        return this;
    }

    @JsonProperty("itemUrl")
    public String getItemUrl() {
        return itemUrl;
    }

    @JsonProperty("itemUrl")
    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
    }

    public Result withItemUrl(String itemUrl) {
        this.itemUrl = itemUrl;
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

    public Result withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Result.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("itemWantedStr");
        sb.append('=');
        sb.append(((this.itemWantedStr == null) ? "<null>" : this.itemWantedStr));
        sb.append(',');
        sb.append("itemTitle");
        sb.append('=');
        sb.append(((this.itemTitle == null) ? "<null>" : this.itemTitle));
        sb.append(',');
        sb.append("itemSoldCnt");
        sb.append('=');
        sb.append(((this.itemSoldCnt == null) ? "<null>" : this.itemSoldCnt));
        sb.append(',');
        sb.append("extendedItemInfo");
        sb.append('=');
        sb.append(((this.extendedItemInfo == null) ? "<null>" : this.extendedItemInfo));
        sb.append(',');
        sb.append("matchType");
        sb.append('=');
        sb.append(((this.matchType == null) ? "<null>" : this.matchType));
        sb.append(',');
        sb.append("clickTrackInfo");
        sb.append('=');
        sb.append(((this.clickTrackInfo == null) ? "<null>" : this.clickTrackInfo));
        sb.append(',');
        sb.append("itemDiscount");
        sb.append('=');
        sb.append(((this.itemDiscount == null) ? "<null>" : this.itemDiscount));
        sb.append(',');
        sb.append("express");
        sb.append('=');
        sb.append(((this.express == null) ? "<null>" : this.express));
        sb.append(',');
        sb.append("itemWantedCnt");
        sb.append('=');
        sb.append(((this.itemWantedCnt == null) ? "<null>" : this.itemWantedCnt));
        sb.append(',');
        sb.append("itemRegion");
        sb.append('=');
        sb.append(((this.itemRegion == null) ? "<null>" : this.itemRegion));
        sb.append(',');
        sb.append("promotionTag");
        sb.append('=');
        sb.append(((this.promotionTag == null) ? "<null>" : this.promotionTag));
        sb.append(',');
        sb.append("shopNameLocal");
        sb.append('=');
        sb.append(((this.shopNameLocal == null) ? "<null>" : this.shopNameLocal));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("stockAvailable");
        sb.append('=');
        sb.append(((this.stockAvailable == null) ? "<null>" : this.stockAvailable));
        sb.append(',');
        sb.append("itemImg");
        sb.append('=');
        sb.append(((this.itemImg == null) ? "<null>" : this.itemImg));
        sb.append(',');
        sb.append("sellerId");
        sb.append('=');
        sb.append(((this.sellerId == null) ? "<null>" : this.sellerId));
        sb.append(',');
        sb.append("itemRatingScore");
        sb.append('=');
        sb.append(((this.itemRatingScore == null) ? "<null>" : this.itemRatingScore));
        sb.append(',');
        sb.append("itemDiscountPrice");
        sb.append('=');
        sb.append(((this.itemDiscountPrice == null) ? "<null>" : this.itemDiscountPrice));
        sb.append(',');
        sb.append("itemDiscountRaw");
        sb.append('=');
        sb.append(((this.itemDiscountRaw == null) ? "<null>" : this.itemDiscountRaw));
        sb.append(',');
        sb.append("isGc");
        sb.append('=');
        sb.append(((this.isGc == null) ? "<null>" : this.isGc));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null) ? "<null>" : this.currency));
        sb.append(',');
        sb.append("shopId");
        sb.append('=');
        sb.append(((this.shopId == null) ? "<null>" : this.shopId));
        sb.append(',');
        sb.append("isOfficialStore");
        sb.append('=');
        sb.append(((this.isOfficialStore == null) ? "<null>" : this.isOfficialStore));
        sb.append(',');
        sb.append("auctionType");
        sb.append('=');
        sb.append(((this.auctionType == null) ? "<null>" : this.auctionType));
        sb.append(',');
        sb.append("skuId");
        sb.append('=');
        sb.append(((this.skuId == null) ? "<null>" : this.skuId));
        sb.append(',');
        sb.append("idStr");
        sb.append('=');
        sb.append(((this.idStr == null) ? "<null>" : this.idStr));
        sb.append(',');
        sb.append("catIdLv1");
        sb.append('=');
        sb.append(((this.catIdLv1 == null) ? "<null>" : this.catIdLv1));
        sb.append(',');
        sb.append("shopNameEn");
        sb.append('=');
        sb.append(((this.shopNameEn == null) ? "<null>" : this.shopNameEn));
        sb.append(',');
        sb.append("trackInfo");
        sb.append('=');
        sb.append(((this.trackInfo == null) ? "<null>" : this.trackInfo));
        sb.append(',');
        sb.append("isSoldByLazada");
        sb.append('=');
        sb.append(((this.isSoldByLazada == null) ? "<null>" : this.isSoldByLazada));
        sb.append(',');
        sb.append("isCertified");
        sb.append('=');
        sb.append(((this.isCertified == null) ? "<null>" : this.isCertified));
        sb.append(',');
        sb.append("shopLogo");
        sb.append('=');
        sb.append(((this.shopLogo == null) ? "<null>" : this.shopLogo));
        sb.append(',');
        sb.append("center");
        sb.append('=');
        sb.append(((this.center == null) ? "<null>" : this.center));
        sb.append(',');
        sb.append("itemDiscountPriceShow");
        sb.append('=');
        sb.append(((this.itemDiscountPriceShow == null) ? "<null>" : this.itemDiscountPriceShow));
        sb.append(',');
        sb.append("itemPriceShow");
        sb.append('=');
        sb.append(((this.itemPriceShow == null) ? "<null>" : this.itemPriceShow));
        sb.append(',');
        sb.append("shopUrl");
        sb.append('=');
        sb.append(((this.shopUrl == null) ? "<null>" : this.shopUrl));
        sb.append(',');
        sb.append("itemInstallment");
        sb.append('=');
        sb.append(((this.itemInstallment == null) ? "<null>" : this.itemInstallment));
        sb.append(',');
        sb.append("itemId");
        sb.append('=');
        sb.append(((this.itemId == null) ? "<null>" : this.itemId));
        sb.append(',');
        sb.append("catId");
        sb.append('=');
        sb.append(((this.catId == null) ? "<null>" : this.catId));
        sb.append(',');
        sb.append("categoryLv3Name");
        sb.append('=');
        sb.append(((this.categoryLv3Name == null) ? "<null>" : this.categoryLv3Name));
        sb.append(',');
        sb.append("itemReviews");
        sb.append('=');
        sb.append(((this.itemReviews == null) ? "<null>" : this.itemReviews));
        sb.append(',');
        sb.append("mainTitle");
        sb.append('=');
        sb.append(((this.mainTitle == null) ? "<null>" : this.mainTitle));
        sb.append(',');
        sb.append("brandId");
        sb.append('=');
        sb.append(((this.brandId == null) ? "<null>" : this.brandId));
        sb.append(',');
        sb.append("getTbc");
        sb.append('=');
        sb.append(((this.getTbc == null) ? "<null>" : this.getTbc));
        sb.append(',');
        sb.append("currencyFlag");
        sb.append('=');
        sb.append(((this.currencyFlag == null) ? "<null>" : this.currencyFlag));
        sb.append(',');
        sb.append("itemPrice");
        sb.append('=');
        sb.append(((this.itemPrice == null) ? "<null>" : this.itemPrice));
        sb.append(',');
        sb.append("location");
        sb.append('=');
        sb.append(((this.location == null) ? "<null>" : this.location));
        sb.append(',');
        sb.append("itemUrl");
        sb.append('=');
        sb.append(((this.itemUrl == null) ? "<null>" : this.itemUrl));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result * 31) + ((this.matchType == null) ? 0 : this.matchType.hashCode()));
        result = ((result * 31) + ((this.clickTrackInfo == null) ? 0 : this.clickTrackInfo.hashCode()));
        result = ((result * 31) + ((this.express == null) ? 0 : this.express.hashCode()));
        result = ((result * 31) + ((this.itemWantedCnt == null) ? 0 : this.itemWantedCnt.hashCode()));
        result = ((result * 31) + ((this.promotionTag == null) ? 0 : this.promotionTag.hashCode()));
        result = ((result * 31) + ((this.shopNameLocal == null) ? 0 : this.shopNameLocal.hashCode()));
        result = ((result * 31) + ((this.type == null) ? 0 : this.type.hashCode()));
        result = ((result * 31) + ((this.stockAvailable == null) ? 0 : this.stockAvailable.hashCode()));
        result = ((result * 31) + ((this.itemImg == null) ? 0 : this.itemImg.hashCode()));
        result = ((result * 31) + ((this.sellerId == null) ? 0 : this.sellerId.hashCode()));
        result = ((result * 31) + ((this.itemDiscountPrice == null) ? 0 : this.itemDiscountPrice.hashCode()));
        result = ((result * 31) + ((this.isGc == null) ? 0 : this.isGc.hashCode()));
        result = ((result * 31) + ((this.shopId == null) ? 0 : this.shopId.hashCode()));
        result = ((result * 31) + ((this.isOfficialStore == null) ? 0 : this.isOfficialStore.hashCode()));
        result = ((result * 31) + ((this.skuId == null) ? 0 : this.skuId.hashCode()));
        result = ((result * 31) + ((this.isSoldByLazada == null) ? 0 : this.isSoldByLazada.hashCode()));
        result = ((result * 31) + ((this.isCertified == null) ? 0 : this.isCertified.hashCode()));
        result = ((result * 31) + ((this.shopLogo == null) ? 0 : this.shopLogo.hashCode()));
        result = ((result * 31) + ((this.itemDiscountPriceShow == null) ? 0 : this.itemDiscountPriceShow.hashCode()));
        result = ((result * 31) + ((this.shopUrl == null) ? 0 : this.shopUrl.hashCode()));
        result = ((result * 31) + ((this.itemId == null) ? 0 : this.itemId.hashCode()));
        result = ((result * 31) + ((this.catId == null) ? 0 : this.catId.hashCode()));
        result = ((result * 31) + ((this.itemReviews == null) ? 0 : this.itemReviews.hashCode()));
        result = ((result * 31) + ((this.brandId == null) ? 0 : this.brandId.hashCode()));
        result = ((result * 31) + ((this.additionalProperties == null) ? 0 : this.additionalProperties.hashCode()));
        result = ((result * 31) + ((this.itemWantedStr == null) ? 0 : this.itemWantedStr.hashCode()));
        result = ((result * 31) + ((this.itemTitle == null) ? 0 : this.itemTitle.hashCode()));
        result = ((result * 31) + ((this.itemSoldCnt == null) ? 0 : this.itemSoldCnt.hashCode()));
        result = ((result * 31) + ((this.extendedItemInfo == null) ? 0 : this.extendedItemInfo.hashCode()));
        result = ((result * 31) + ((this.itemDiscount == null) ? 0 : this.itemDiscount.hashCode()));
        result = ((result * 31) + ((this.itemRegion == null) ? 0 : this.itemRegion.hashCode()));
        result = ((result * 31) + ((this.itemRatingScore == null) ? 0 : this.itemRatingScore.hashCode()));
        result = ((result * 31) + ((this.itemDiscountRaw == null) ? 0 : this.itemDiscountRaw.hashCode()));
        result = ((result * 31) + ((this.currency == null) ? 0 : this.currency.hashCode()));
        result = ((result * 31) + ((this.auctionType == null) ? 0 : this.auctionType.hashCode()));
        result = ((result * 31) + ((this.idStr == null) ? 0 : this.idStr.hashCode()));
        result = ((result * 31) + ((this.catIdLv1 == null) ? 0 : this.catIdLv1.hashCode()));
        result = ((result * 31) + ((this.shopNameEn == null) ? 0 : this.shopNameEn.hashCode()));
        result = ((result * 31) + ((this.trackInfo == null) ? 0 : this.trackInfo.hashCode()));
        result = ((result * 31) + ((this.center == null) ? 0 : this.center.hashCode()));
        result = ((result * 31) + ((this.itemPriceShow == null) ? 0 : this.itemPriceShow.hashCode()));
        result = ((result * 31) + ((this.itemInstallment == null) ? 0 : this.itemInstallment.hashCode()));
        result = ((result * 31) + ((this.categoryLv3Name == null) ? 0 : this.categoryLv3Name.hashCode()));
        result = ((result * 31) + ((this.mainTitle == null) ? 0 : this.mainTitle.hashCode()));
        result = ((result * 31) + ((this.getTbc == null) ? 0 : this.getTbc.hashCode()));
        result = ((result * 31) + ((this.currencyFlag == null) ? 0 : this.currencyFlag.hashCode()));
        result = ((result * 31) + ((this.itemPrice == null) ? 0 : this.itemPrice.hashCode()));
        result = ((result * 31) + ((this.location == null) ? 0 : this.location.hashCode()));
        result = ((result * 31) + ((this.itemUrl == null) ? 0 : this.itemUrl.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Result) == false) {
            return false;
        }
        Result rhs = ((Result) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.matchType == rhs.matchType) || ((this.matchType != null) && this.matchType.equals(rhs.matchType))) && ((this.clickTrackInfo == rhs.clickTrackInfo) || ((this.clickTrackInfo != null) && this.clickTrackInfo.equals(rhs.clickTrackInfo)))) && ((this.express == rhs.express) || ((this.express != null) && this.express.equals(rhs.express)))) && ((this.itemWantedCnt == rhs.itemWantedCnt) || ((this.itemWantedCnt != null) && this.itemWantedCnt.equals(rhs.itemWantedCnt)))) && ((this.promotionTag == rhs.promotionTag) || ((this.promotionTag != null) && this.promotionTag.equals(rhs.promotionTag)))) && ((this.shopNameLocal == rhs.shopNameLocal) || ((this.shopNameLocal != null) && this.shopNameLocal.equals(rhs.shopNameLocal)))) && ((this.type == rhs.type) || ((this.type != null) && this.type.equals(rhs.type)))) && ((this.stockAvailable == rhs.stockAvailable) || ((this.stockAvailable != null) && this.stockAvailable.equals(rhs.stockAvailable)))) && ((this.itemImg == rhs.itemImg) || ((this.itemImg != null) && this.itemImg.equals(rhs.itemImg)))) && ((this.sellerId == rhs.sellerId) || ((this.sellerId != null) && this.sellerId.equals(rhs.sellerId)))) && ((this.itemDiscountPrice == rhs.itemDiscountPrice) || ((this.itemDiscountPrice != null) && this.itemDiscountPrice.equals(rhs.itemDiscountPrice)))) && ((this.isGc == rhs.isGc) || ((this.isGc != null) && this.isGc.equals(rhs.isGc)))) && ((this.shopId == rhs.shopId) || ((this.shopId != null) && this.shopId.equals(rhs.shopId)))) && ((this.isOfficialStore == rhs.isOfficialStore) || ((this.isOfficialStore != null) && this.isOfficialStore.equals(rhs.isOfficialStore)))) && ((this.skuId == rhs.skuId) || ((this.skuId != null) && this.skuId.equals(rhs.skuId)))) && ((this.isSoldByLazada == rhs.isSoldByLazada) || ((this.isSoldByLazada != null) && this.isSoldByLazada.equals(rhs.isSoldByLazada)))) && ((this.isCertified == rhs.isCertified) || ((this.isCertified != null) && this.isCertified.equals(rhs.isCertified)))) && ((this.shopLogo == rhs.shopLogo) || ((this.shopLogo != null) && this.shopLogo.equals(rhs.shopLogo)))) && ((this.itemDiscountPriceShow == rhs.itemDiscountPriceShow) || ((this.itemDiscountPriceShow != null) && this.itemDiscountPriceShow.equals(rhs.itemDiscountPriceShow)))) && ((this.shopUrl == rhs.shopUrl) || ((this.shopUrl != null) && this.shopUrl.equals(rhs.shopUrl)))) && ((this.itemId == rhs.itemId) || ((this.itemId != null) && this.itemId.equals(rhs.itemId)))) && ((this.catId == rhs.catId) || ((this.catId != null) && this.catId.equals(rhs.catId)))) && ((this.itemReviews == rhs.itemReviews) || ((this.itemReviews != null) && this.itemReviews.equals(rhs.itemReviews)))) && ((this.brandId == rhs.brandId) || ((this.brandId != null) && this.brandId.equals(rhs.brandId)))) && ((this.additionalProperties == rhs.additionalProperties) || ((this.additionalProperties != null) && this.additionalProperties.equals(rhs.additionalProperties)))) && ((this.itemWantedStr == rhs.itemWantedStr) || ((this.itemWantedStr != null) && this.itemWantedStr.equals(rhs.itemWantedStr)))) && ((this.itemTitle == rhs.itemTitle) || ((this.itemTitle != null) && this.itemTitle.equals(rhs.itemTitle)))) && ((this.itemSoldCnt == rhs.itemSoldCnt) || ((this.itemSoldCnt != null) && this.itemSoldCnt.equals(rhs.itemSoldCnt)))) && ((this.extendedItemInfo == rhs.extendedItemInfo) || ((this.extendedItemInfo != null) && this.extendedItemInfo.equals(rhs.extendedItemInfo)))) && ((this.itemDiscount == rhs.itemDiscount) || ((this.itemDiscount != null) && this.itemDiscount.equals(rhs.itemDiscount)))) && ((this.itemRegion == rhs.itemRegion) || ((this.itemRegion != null) && this.itemRegion.equals(rhs.itemRegion)))) && ((this.itemRatingScore == rhs.itemRatingScore) || ((this.itemRatingScore != null) && this.itemRatingScore.equals(rhs.itemRatingScore)))) && ((this.itemDiscountRaw == rhs.itemDiscountRaw) || ((this.itemDiscountRaw != null) && this.itemDiscountRaw.equals(rhs.itemDiscountRaw)))) && ((this.currency == rhs.currency) || ((this.currency != null) && this.currency.equals(rhs.currency)))) && ((this.auctionType == rhs.auctionType) || ((this.auctionType != null) && this.auctionType.equals(rhs.auctionType)))) && ((this.idStr == rhs.idStr) || ((this.idStr != null) && this.idStr.equals(rhs.idStr)))) && ((this.catIdLv1 == rhs.catIdLv1) || ((this.catIdLv1 != null) && this.catIdLv1.equals(rhs.catIdLv1)))) && ((this.shopNameEn == rhs.shopNameEn) || ((this.shopNameEn != null) && this.shopNameEn.equals(rhs.shopNameEn)))) && ((this.trackInfo == rhs.trackInfo) || ((this.trackInfo != null) && this.trackInfo.equals(rhs.trackInfo)))) && ((this.center == rhs.center) || ((this.center != null) && this.center.equals(rhs.center)))) && ((this.itemPriceShow == rhs.itemPriceShow) || ((this.itemPriceShow != null) && this.itemPriceShow.equals(rhs.itemPriceShow)))) && ((this.itemInstallment == rhs.itemInstallment) || ((this.itemInstallment != null) && this.itemInstallment.equals(rhs.itemInstallment)))) && ((this.categoryLv3Name == rhs.categoryLv3Name) || ((this.categoryLv3Name != null) && this.categoryLv3Name.equals(rhs.categoryLv3Name)))) && ((this.mainTitle == rhs.mainTitle) || ((this.mainTitle != null) && this.mainTitle.equals(rhs.mainTitle)))) && ((this.getTbc == rhs.getTbc) || ((this.getTbc != null) && this.getTbc.equals(rhs.getTbc)))) && ((this.currencyFlag == rhs.currencyFlag) || ((this.currencyFlag != null) && this.currencyFlag.equals(rhs.currencyFlag)))) && ((this.itemPrice == rhs.itemPrice) || ((this.itemPrice != null) && this.itemPrice.equals(rhs.itemPrice)))) && ((this.location == rhs.location) || ((this.location != null) && this.location.equals(rhs.location)))) && ((this.itemUrl == rhs.itemUrl) || ((this.itemUrl != null) && this.itemUrl.equals(rhs.itemUrl))));
    }

}
