package cn.sqhl.shop.po;

import java.math.BigDecimal;

public class EventsGoods {
    private String id;

    private String eventsId;

    private String goodsId;

    private String goodsChildId;

    private BigDecimal eventsMoney;

    private String scope;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getEventsId() {
        return eventsId;
    }

    public void setEventsId(String eventsId) {
        this.eventsId = eventsId == null ? null : eventsId.trim();
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsChildId() {
        return goodsChildId;
    }

    public void setGoodsChildId(String goodsChildId) {
        this.goodsChildId = goodsChildId == null ? null : goodsChildId.trim();
    }

    public BigDecimal getEventsMoney() {
        return eventsMoney;
    }

    public void setEventsMoney(BigDecimal eventsMoney) {
        this.eventsMoney = eventsMoney;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }
}