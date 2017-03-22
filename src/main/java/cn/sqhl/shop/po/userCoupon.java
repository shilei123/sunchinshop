package cn.sqhl.shop.po;

import java.math.BigDecimal;
import java.util.Date;

public class userCoupon {
    private String id;

    private String userId;

    private String couponId;

    private String couponName;

    private BigDecimal couponBlance;

    private BigDecimal couponXfBalance;

    private Date couponCreatdate;

    private Date couponExpirydate;

    private String orderSn;

    private String couponStatus;

    private Date optionTime;

    private String optionAdminid;

    private String optionRemark;

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

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId == null ? null : couponId.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public BigDecimal getCouponBlance() {
        return couponBlance;
    }

    public void setCouponBlance(BigDecimal couponBlance) {
        this.couponBlance = couponBlance;
    }

    public BigDecimal getCouponXfBalance() {
        return couponXfBalance;
    }

    public void setCouponXfBalance(BigDecimal couponXfBalance) {
        this.couponXfBalance = couponXfBalance;
    }

    public Date getCouponCreatdate() {
        return couponCreatdate;
    }

    public void setCouponCreatdate(Date couponCreatdate) {
        this.couponCreatdate = couponCreatdate;
    }

    public Date getCouponExpirydate() {
        return couponExpirydate;
    }

    public void setCouponExpirydate(Date couponExpirydate) {
        this.couponExpirydate = couponExpirydate;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus == null ? null : couponStatus.trim();
    }

    public Date getOptionTime() {
        return optionTime;
    }

    public void setOptionTime(Date optionTime) {
        this.optionTime = optionTime;
    }

    public String getOptionAdminid() {
        return optionAdminid;
    }

    public void setOptionAdminid(String optionAdminid) {
        this.optionAdminid = optionAdminid == null ? null : optionAdminid.trim();
    }

    public String getOptionRemark() {
        return optionRemark;
    }

    public void setOptionRemark(String optionRemark) {
        this.optionRemark = optionRemark == null ? null : optionRemark.trim();
    }
}