package cn.sqhl.shop.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Purse {
    private String id;

    private String tradeType;

    private BigDecimal tradeAmount;

    private String tradeSn;

    private String tradeState;

    private String orderId;

    private String userId;

    private BigDecimal userAmount;

    private String purseType;

    private String payAccount;

    private String payOpenBank;

    private String createTime;

    private String optionTime;

    private String optionAdminid;

    private String optionAdminname;

    private String optionRemark;

    private String optionType;

    private String belong;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }

    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    public String getTradeSn() {
        return tradeSn;
    }

    public void setTradeSn(String tradeSn) {
        this.tradeSn = tradeSn == null ? null : tradeSn.trim();
    }

    public String getTradeState() {
        return tradeState;
    }

    public void setTradeState(String tradeState) {
        this.tradeState = tradeState == null ? null : tradeState.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public BigDecimal getUserAmount() {
        return userAmount;
    }

    public void setUserAmount(BigDecimal userAmount) {
        this.userAmount = userAmount;
    }

    public String getPurseType() {
        return purseType;
    }

    public void setPurseType(String purseType) {
        this.purseType = purseType == null ? null : purseType.trim();
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    public String getPayOpenBank() {
        return payOpenBank;
    }

    public void setPayOpenBank(String payOpenBank) {
        this.payOpenBank = payOpenBank == null ? null : payOpenBank.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getOptionTime() {
        return optionTime;
    }

    public void setOptionTime(String optionTime) {
        this.optionTime = optionTime;
    }

    public String getOptionAdminid() {
        return optionAdminid;
    }

    public void setOptionAdminid(String optionAdminid) {
        this.optionAdminid = optionAdminid == null ? null : optionAdminid.trim();
    }

    public String getOptionAdminname() {
        return optionAdminname;
    }

    public void setOptionAdminname(String optionAdminname) {
        this.optionAdminname = optionAdminname == null ? null : optionAdminname.trim();
    }

    public String getOptionRemark() {
        return optionRemark;
    }

    public void setOptionRemark(String optionRemark) {
        this.optionRemark = optionRemark == null ? null : optionRemark.trim();
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType == null ? null : optionType.trim();
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }
}