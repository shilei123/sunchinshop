package cn.sqhl.shop.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Collected extends GoodsChildPrice{
    private String id;

    private String userId;

    private String goodsId;

    private String childGoodsId;

    private Date createTime;

    private BigDecimal addPrice;

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
}