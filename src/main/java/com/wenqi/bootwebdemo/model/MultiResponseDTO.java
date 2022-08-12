package com.wenqi.bootwebdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class MultiResponseDTO {
    private List<MultiResult> result = new ArrayList<>();
    private Integer preloadStartItem;
    private Integer pageTotal;
    private String pvid;
    private Integer maxUploadCount;
    private String priceDisplayType;
    private String scm;
    private Integer version;
    @JsonProperty("tpp_trace")
    private String tppTrace;
    private Integer preloadStartPixel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
}
