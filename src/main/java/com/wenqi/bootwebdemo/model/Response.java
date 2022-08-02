
package com.wenqi.bootwebdemo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "result",
    "preloadStartItem",
    "pageTotal",
    "pvid",
    "maxUploadCount",
    "priceDisplayType",
    "scm",
    "version",
    "tpp_trace",
    "preloadStartPixel"
})
@Generated("jsonschema2pojo")
public class Response {

    @JsonProperty("result")
    private List<Result> result = new ArrayList<Result>();
    @JsonProperty("preloadStartItem")
    private Integer preloadStartItem;
    @JsonProperty("pageTotal")
    private Integer pageTotal;
    @JsonProperty("pvid")
    private String pvid;
    @JsonProperty("maxUploadCount")
    private Integer maxUploadCount;
    @JsonProperty("priceDisplayType")
    private String priceDisplayType;
    @JsonProperty("scm")
    private String scm;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("tpp_trace")
    private String tppTrace;
    @JsonProperty("preloadStartPixel")
    private Integer preloadStartPixel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result")
    public List<Result> getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Response withResult(List<Result> result) {
        this.result = result;
        return this;
    }

    @JsonProperty("preloadStartItem")
    public Integer getPreloadStartItem() {
        return preloadStartItem;
    }

    @JsonProperty("preloadStartItem")
    public void setPreloadStartItem(Integer preloadStartItem) {
        this.preloadStartItem = preloadStartItem;
    }

    public Response withPreloadStartItem(Integer preloadStartItem) {
        this.preloadStartItem = preloadStartItem;
        return this;
    }

    @JsonProperty("pageTotal")
    public Integer getPageTotal() {
        return pageTotal;
    }

    @JsonProperty("pageTotal")
    public void setPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
    }

    public Response withPageTotal(Integer pageTotal) {
        this.pageTotal = pageTotal;
        return this;
    }

    @JsonProperty("pvid")
    public String getPvid() {
        return pvid;
    }

    @JsonProperty("pvid")
    public void setPvid(String pvid) {
        this.pvid = pvid;
    }

    public Response withPvid(String pvid) {
        this.pvid = pvid;
        return this;
    }

    @JsonProperty("maxUploadCount")
    public Integer getMaxUploadCount() {
        return maxUploadCount;
    }

    @JsonProperty("maxUploadCount")
    public void setMaxUploadCount(Integer maxUploadCount) {
        this.maxUploadCount = maxUploadCount;
    }

    public Response withMaxUploadCount(Integer maxUploadCount) {
        this.maxUploadCount = maxUploadCount;
        return this;
    }

    @JsonProperty("priceDisplayType")
    public String getPriceDisplayType() {
        return priceDisplayType;
    }

    @JsonProperty("priceDisplayType")
    public void setPriceDisplayType(String priceDisplayType) {
        this.priceDisplayType = priceDisplayType;
    }

    public Response withPriceDisplayType(String priceDisplayType) {
        this.priceDisplayType = priceDisplayType;
        return this;
    }

    @JsonProperty("scm")
    public String getScm() {
        return scm;
    }

    @JsonProperty("scm")
    public void setScm(String scm) {
        this.scm = scm;
    }

    public Response withScm(String scm) {
        this.scm = scm;
        return this;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    public Response withVersion(Integer version) {
        this.version = version;
        return this;
    }

    @JsonProperty("tpp_trace")
    public String getTppTrace() {
        return tppTrace;
    }

    @JsonProperty("tpp_trace")
    public void setTppTrace(String tppTrace) {
        this.tppTrace = tppTrace;
    }

    public Response withTppTrace(String tppTrace) {
        this.tppTrace = tppTrace;
        return this;
    }

    @JsonProperty("preloadStartPixel")
    public Integer getPreloadStartPixel() {
        return preloadStartPixel;
    }

    @JsonProperty("preloadStartPixel")
    public void setPreloadStartPixel(Integer preloadStartPixel) {
        this.preloadStartPixel = preloadStartPixel;
    }

    public Response withPreloadStartPixel(Integer preloadStartPixel) {
        this.preloadStartPixel = preloadStartPixel;
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

    public Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Response.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("result");
        sb.append('=');
        sb.append(((this.result == null)?"<null>":this.result));
        sb.append(',');
        sb.append("preloadStartItem");
        sb.append('=');
        sb.append(((this.preloadStartItem == null)?"<null>":this.preloadStartItem));
        sb.append(',');
        sb.append("pageTotal");
        sb.append('=');
        sb.append(((this.pageTotal == null)?"<null>":this.pageTotal));
        sb.append(',');
        sb.append("pvid");
        sb.append('=');
        sb.append(((this.pvid == null)?"<null>":this.pvid));
        sb.append(',');
        sb.append("maxUploadCount");
        sb.append('=');
        sb.append(((this.maxUploadCount == null)?"<null>":this.maxUploadCount));
        sb.append(',');
        sb.append("priceDisplayType");
        sb.append('=');
        sb.append(((this.priceDisplayType == null)?"<null>":this.priceDisplayType));
        sb.append(',');
        sb.append("scm");
        sb.append('=');
        sb.append(((this.scm == null)?"<null>":this.scm));
        sb.append(',');
        sb.append("version");
        sb.append('=');
        sb.append(((this.version == null)?"<null>":this.version));
        sb.append(',');
        sb.append("tppTrace");
        sb.append('=');
        sb.append(((this.tppTrace == null)?"<null>":this.tppTrace));
        sb.append(',');
        sb.append("preloadStartPixel");
        sb.append('=');
        sb.append(((this.preloadStartPixel == null)?"<null>":this.preloadStartPixel));
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
        result = ((result* 31)+((this.result == null)? 0 :this.result.hashCode()));
        result = ((result* 31)+((this.preloadStartItem == null)? 0 :this.preloadStartItem.hashCode()));
        result = ((result* 31)+((this.pageTotal == null)? 0 :this.pageTotal.hashCode()));
        result = ((result* 31)+((this.pvid == null)? 0 :this.pvid.hashCode()));
        result = ((result* 31)+((this.tppTrace == null)? 0 :this.tppTrace.hashCode()));
        result = ((result* 31)+((this.maxUploadCount == null)? 0 :this.maxUploadCount.hashCode()));
        result = ((result* 31)+((this.priceDisplayType == null)? 0 :this.priceDisplayType.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.scm == null)? 0 :this.scm.hashCode()));
        result = ((result* 31)+((this.version == null)? 0 :this.version.hashCode()));
        result = ((result* 31)+((this.preloadStartPixel == null)? 0 :this.preloadStartPixel.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Response) == false) {
            return false;
        }
        Response rhs = ((Response) other);
        return ((((((((((((this.result == rhs.result)||((this.result!= null)&&this.result.equals(rhs.result)))&&((this.preloadStartItem == rhs.preloadStartItem)||((this.preloadStartItem!= null)&&this.preloadStartItem.equals(rhs.preloadStartItem))))&&((this.pageTotal == rhs.pageTotal)||((this.pageTotal!= null)&&this.pageTotal.equals(rhs.pageTotal))))&&((this.pvid == rhs.pvid)||((this.pvid!= null)&&this.pvid.equals(rhs.pvid))))&&((this.tppTrace == rhs.tppTrace)||((this.tppTrace!= null)&&this.tppTrace.equals(rhs.tppTrace))))&&((this.maxUploadCount == rhs.maxUploadCount)||((this.maxUploadCount!= null)&&this.maxUploadCount.equals(rhs.maxUploadCount))))&&((this.priceDisplayType == rhs.priceDisplayType)||((this.priceDisplayType!= null)&&this.priceDisplayType.equals(rhs.priceDisplayType))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.scm == rhs.scm)||((this.scm!= null)&&this.scm.equals(rhs.scm))))&&((this.version == rhs.version)||((this.version!= null)&&this.version.equals(rhs.version))))&&((this.preloadStartPixel == rhs.preloadStartPixel)||((this.preloadStartPixel!= null)&&this.preloadStartPixel.equals(rhs.preloadStartPixel))));
    }

}
