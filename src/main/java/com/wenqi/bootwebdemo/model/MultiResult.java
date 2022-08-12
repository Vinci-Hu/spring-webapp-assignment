package com.wenqi.bootwebdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class MultiResult {
    private String itemWantedStr;
    private String itemTitle;
    private Integer itemSoldCnt;
    private MultiExtendedItemInfo extendedItemInfo;
    private String matchType;
    private String clickTrackInfo;
    private String itemDiscount;
    private Boolean express;
    private Integer itemWantedCnt;
    private String itemRegion;
    private String promotionTag;
    private String shopNameLocal;
    private String type;
    private String stockAvailable;
    private String itemImg;
    private String sellerId;
    private Integer itemRatingScore;
    private String itemDiscountPrice;
    private Integer itemDiscountRaw;
    private Boolean isGc;
    private String currency;
    private Integer shopId;
    private Boolean isOfficialStore;
    private String auctionType;
    private String skuId;
    private String idStr;
    private Integer catIdLv1;
    private String shopNameEn;
    private String trackInfo;
    private Boolean isSoldByLazada;
    private Boolean isCertified;
    private String shopLogo;
    private String center;
    private String itemDiscountPriceShow;
    private String itemPriceShow;
    private String shopUrl;
    private Boolean itemInstallment;
    private Long itemId;
    private Integer catId;
    private String categoryLv3Name;
    private String itemReviews;
    private String mainTitle;
    private Integer brandId;
    private Boolean getTbc;
    private String currencyFlag;
    private String itemPrice;
    private String location;
    private String itemUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

}
