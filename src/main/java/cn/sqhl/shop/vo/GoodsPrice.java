package cn.sqhl.shop.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class GoodsPrice {

    private String brandId;

    private String title;

    private String subTitle;

    private String goodsName;

    private String stopTime;

    private String goodsCode;

    private String isuse;

    private String emptyStore;

    private String putaway;

    private String virtual;

    private BigDecimal purchasePrice;

    private String goodsNo;
    
    private String flag;

    private String belong;

    private String freightType;

    private String freightId;

    private String publishType;

    private String publishTime;

    private String goodsSts;

    private String auditSts;

    private String cateId;

    private String goodsMprice;

    private String goodsSprice;

    private String goodsPprice;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getIsuse() {
        return isuse;
    }

    public void setIsuse(String isuse) {
        this.isuse = isuse == null ? null : isuse.trim();
    }

    public String getEmptyStore() {
        return emptyStore;
    }

    public void setEmptyStore(String emptyStore) {
        this.emptyStore = emptyStore == null ? null : emptyStore.trim();
    }

    public String getPutaway() {
        return putaway;
    }

    public void setPutaway(String putaway) {
        this.putaway = putaway == null ? null : putaway.trim();
    }

    public String getVirtual() {
        return virtual;
    }

    public void setVirtual(String virtual) {
        this.virtual = virtual == null ? null : virtual.trim();
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }

    public String getFreightType() {
        return freightType;
    }

    public void setFreightType(String freightType) {
        this.freightType = freightType == null ? null : freightType.trim();
    }

    public String getFreightId() {
        return freightId;
    }

    public void setFreightId(String freightId) {
        this.freightId = freightId == null ? null : freightId.trim();
    }

    public String getPublishType() {
        return publishType;
    }

    public void setPublishType(String publishType) {
        this.publishType = publishType == null ? null : publishType.trim();
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public String getGoodsSts() {
        return goodsSts;
    }

    public void setGoodsSts(String goodsSts) {
        this.goodsSts = goodsSts == null ? null : goodsSts.trim();
    }

    public String getAuditSts() {
        return auditSts;
    }

    public void setAuditSts(String auditSts) {
        this.auditSts = auditSts == null ? null : auditSts.trim();
    }

    public String getCateId() {
        return cateId;
    }

    public void setCateId(String cateId) {
        this.cateId = cateId == null ? null : cateId.trim();
    }

    public String getGoodsMprice() {
        return goodsMprice;
    }

    public void setGoodsMprice(String goodsMprice) {
        this.goodsMprice = goodsMprice;
    }

    public String getGoodsSprice() {
        return goodsSprice;
    }

    public void setGoodsSprice(String goodsSprice) {
        this.goodsSprice = goodsSprice;
    }

    public String getGoodsPprice() {
        return goodsPprice;
    }

    public void setGoodsPprice(String goodsPprice) {
        this.goodsPprice = goodsPprice;
    }

}