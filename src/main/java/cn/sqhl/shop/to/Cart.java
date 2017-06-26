package cn.sqhl.shop.to;

import java.math.BigDecimal;
import java.util.Date;

public class Cart {
    private String id;

    private String userId;

    private String goodsId;

    private String childGoodsId;

    private BigDecimal cartCount;

    private Date createTime;

    private BigDecimal addPrice;
    
    private String title;
    
    private String subtitle;
    
    private String goodsname;
    
    private String stoptime;
    
    private String goodscode;
    
    private String isuse;
    
    private String emptystore;
    
    private String putaway;
    
    private String virtual;
    
    private BigDecimal purchaseprice;
    
    private BigDecimal marketprice;
    
    private BigDecimal saleprice;
    
    private BigDecimal promotionprice;
    
    private String goodsno;
    
    private String flag;
    
    private String freighttype;
    
    private String freightid;
    
    private String publishtype;
    
    private String publishtime;
    
    private String goodssts;
    
    private String auditsts;
    
    private String cateid;
    
    private String childcode;
    
    private String childname;
    
    private BigDecimal cpurchaseprice;
    
    private BigDecimal cmarketprice;
    
    private BigDecimal csaleprice;
    
    private BigDecimal cpromotionprice;
    
    private String childno;
    
    private String cflag;
    
    private String pvname;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getChildGoodsId() {
        return childGoodsId;
    }

    public void setChildGoodsId(String childGoodsId) {
        this.childGoodsId = childGoodsId == null ? null : childGoodsId.trim();
    }

    public BigDecimal getCartCount() {
        return cartCount;
    }

    public void setCartCount(BigDecimal cartCount) {
        this.cartCount = cartCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getAddPrice() {
        return addPrice;
    }

    public void setAddPrice(BigDecimal addPrice) {
        this.addPrice = addPrice;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public String getStoptime() {
		return stoptime;
	}

	public void setStoptime(String stoptime) {
		this.stoptime = stoptime;
	}

	public String getGoodscode() {
		return goodscode;
	}

	public void setGoodscode(String goodscode) {
		this.goodscode = goodscode;
	}

	public String getIsuse() {
		return isuse;
	}

	public void setIsuse(String isuse) {
		this.isuse = isuse;
	}

	public String getEmptystore() {
		return emptystore;
	}

	public void setEmptystore(String emptystore) {
		this.emptystore = emptystore;
	}

	public String getPutaway() {
		return putaway;
	}

	public void setPutaway(String putaway) {
		this.putaway = putaway;
	}

	public String getVirtual() {
		return virtual;
	}

	public void setVirtual(String virtual) {
		this.virtual = virtual;
	}

	public BigDecimal getPurchaseprice() {
		return purchaseprice;
	}

	public void setPurchaseprice(BigDecimal purchaseprice) {
		this.purchaseprice = purchaseprice;
	}

	public BigDecimal getMarketprice() {
		return marketprice;
	}

	public void setMarketprice(BigDecimal marketprice) {
		this.marketprice = marketprice;
	}

	public BigDecimal getSaleprice() {
		return saleprice;
	}

	public void setSaleprice(BigDecimal saleprice) {
		this.saleprice = saleprice;
	}

	public BigDecimal getPromotionprice() {
		return promotionprice;
	}

	public void setPromotionprice(BigDecimal promotionprice) {
		this.promotionprice = promotionprice;
	}

	public String getGoodsno() {
		return goodsno;
	}

	public void setGoodsno(String goodsno) {
		this.goodsno = goodsno;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getFreighttype() {
		return freighttype;
	}

	public void setFreighttype(String freighttype) {
		this.freighttype = freighttype;
	}

	public String getFreightid() {
		return freightid;
	}

	public void setFreightid(String freightid) {
		this.freightid = freightid;
	}

	public String getPublishtype() {
		return publishtype;
	}

	public void setPublishtype(String publishtype) {
		this.publishtype = publishtype;
	}

	public String getPublishtime() {
		return publishtime;
	}

	public void setPublishtime(String publishtime) {
		this.publishtime = publishtime;
	}

	public String getGoodssts() {
		return goodssts;
	}

	public void setGoodssts(String goodssts) {
		this.goodssts = goodssts;
	}

	public String getAuditsts() {
		return auditsts;
	}

	public void setAuditsts(String auditsts) {
		this.auditsts = auditsts;
	}

	public String getCateid() {
		return cateid;
	}

	public void setCateid(String cateid) {
		this.cateid = cateid;
	}

	public String getChildcode() {
		return childcode;
	}

	public void setChildcode(String childcode) {
		this.childcode = childcode;
	}

	public String getChildname() {
		return childname;
	}

	public void setChildname(String childname) {
		this.childname = childname;
	}

	public BigDecimal getCpurchaseprice() {
		return cpurchaseprice;
	}

	public void setCpurchaseprice(BigDecimal cpurchaseprice) {
		this.cpurchaseprice = cpurchaseprice;
	}

	public BigDecimal getCmarketprice() {
		return cmarketprice;
	}

	public void setCmarketprice(BigDecimal cmarketprice) {
		this.cmarketprice = cmarketprice;
	}

	public BigDecimal getCsaleprice() {
		return csaleprice;
	}

	public void setCsaleprice(BigDecimal csaleprice) {
		this.csaleprice = csaleprice;
	}

	public BigDecimal getCpromotionprice() {
		return cpromotionprice;
	}

	public void setCpromotionprice(BigDecimal cpromotionprice) {
		this.cpromotionprice = cpromotionprice;
	}

	public String getChildno() {
		return childno;
	}

	public void setChildno(String childno) {
		this.childno = childno;
	}

	public String getCflag() {
		return cflag;
	}

	public void setCflag(String cflag) {
		this.cflag = cflag;
	}

	public String getPvname() {
		return pvname;
	}

	public void setPvname(String pvname) {
		this.pvname = pvname;
	}
}