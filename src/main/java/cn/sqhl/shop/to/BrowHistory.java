package cn.sqhl.shop.to;


public class BrowHistory extends GoodsChildPrice{
    
    private String userId;

    private String goodsId;

    private String childGoodsId;

    private String createTime;

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

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}