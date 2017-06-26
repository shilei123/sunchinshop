package cn.sqhl.shop.po;

import java.util.Date;

public class BrowHistory {
    private String id;

    private String userId;

    private String goodsId;

    private String childGoodsId;

    private Date createTime;

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
}