package cn.sqhl.shop.vo;

import java.math.BigDecimal;
import java.util.Date;

public class GoodsChildPrice {

    private String brandId;

    private String title;

    private String subTitle;

    private String goodsName;

    private Date stopTime;

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

    private Date publishTime;

    private String goodsSts;

    private String auditSts;

    private String cateId;

    private BigDecimal goodsMprice;

    private BigDecimal goodsSprice;

    private BigDecimal goodsPprice;

    private BigDecimal gcSprice;

    private BigDecimal gcMprice;

    private BigDecimal gcPprice;

    private BigDecimal gcMaxSprice;

    private BigDecimal gcMinSprice;

    private BigDecimal gcMaxMprice;

    private BigDecimal gcMinMprice;

    private BigDecimal gcMaxPprice;

    private BigDecimal gcMinPprice;

    private String childgoodsid;


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

    public Date getStopTime() {
        return stopTime;
    }

    public void setStopTime(Date stopTime) {
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

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
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

    public BigDecimal getGoodsMprice() {
        return goodsMprice;
    }

    public void setGoodsMprice(BigDecimal goodsMprice) {
        this.goodsMprice = goodsMprice;
    }

    public BigDecimal getGoodsSprice() {
        return goodsSprice;
    }

    public void setGoodsSprice(BigDecimal goodsSprice) {
        this.goodsSprice = goodsSprice;
    }

    public BigDecimal getGoodsPprice() {
        return goodsPprice;
    }

    public void setGoodsPprice(BigDecimal goodsPprice) {
        this.goodsPprice = goodsPprice;
    }

    public BigDecimal getGcSprice() {
        return gcSprice;
    }

    public void setGcSprice(BigDecimal gcSprice) {
        this.gcSprice = gcSprice;
    }

    public BigDecimal getGcMprice() {
        return gcMprice;
    }

    public void setGcMprice(BigDecimal gcMprice) {
        this.gcMprice = gcMprice;
    }

    public BigDecimal getGcPprice() {
        return gcPprice;
    }

    public void setGcPprice(BigDecimal gcPprice) {
        this.gcPprice = gcPprice;
    }

    public BigDecimal getGcMaxSprice() {
        return gcMaxSprice;
    }

    public void setGcMaxSprice(BigDecimal gcMaxSprice) {
        this.gcMaxSprice = gcMaxSprice;
    }

    public BigDecimal getGcMinSprice() {
        return gcMinSprice;
    }

    public void setGcMinSprice(BigDecimal gcMinSprice) {
        this.gcMinSprice = gcMinSprice;
    }

    public BigDecimal getGcMaxMprice() {
        return gcMaxMprice;
    }

    public void setGcMaxMprice(BigDecimal gcMaxMprice) {
        this.gcMaxMprice = gcMaxMprice;
    }

    public BigDecimal getGcMinMprice() {
        return gcMinMprice;
    }

    public void setGcMinMprice(BigDecimal gcMinMprice) {
        this.gcMinMprice = gcMinMprice;
    }

    public BigDecimal getGcMaxPprice() {
        return gcMaxPprice;
    }

    public void setGcMaxPprice(BigDecimal gcMaxPprice) {
        this.gcMaxPprice = gcMaxPprice;
    }

    public BigDecimal getGcMinPprice() {
        return gcMinPprice;
    }

    public void setGcMinPprice(BigDecimal gcMinPprice) {
        this.gcMinPprice = gcMinPprice;
    }

	public String getChildgoodsid() {
		return childgoodsid;
	}

	public void setChildgoodsid(String childgoodsid) {
		this.childgoodsid = childgoodsid;
	}

}