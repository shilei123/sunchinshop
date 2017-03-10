package cn.sqhl.shop.vo;

import java.math.BigDecimal;
import java.util.Date;

public class coupon {
    private String id;

    private String couponName;

    private String couponType;

    private BigDecimal couponZsBalance;

    private BigDecimal couponBlance;

    private BigDecimal couponXfBalance;

    private BigDecimal couponExpiryDate;

    private String couponRemark;

    private String couponStatus;

    private String couponFlag;

    private Date createTime;

    private String optionAdminid;

    private Date optionTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType == null ? null : couponType.trim();
    }

    public BigDecimal getCouponZsBalance() {
        return couponZsBalance;
    }

    public void setCouponZsBalance(BigDecimal couponZsBalance) {
        this.couponZsBalance = couponZsBalance;
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

    public BigDecimal getCouponExpiryDate() {
        return couponExpiryDate;
    }

    public void setCouponExpiryDate(BigDecimal couponExpiryDate) {
        this.couponExpiryDate = couponExpiryDate;
    }

    public String getCouponRemark() {
        return couponRemark;
    }

    public void setCouponRemark(String couponRemark) {
        this.couponRemark = couponRemark == null ? null : couponRemark.trim();
    }

    public String getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(String couponStatus) {
        this.couponStatus = couponStatus == null ? null : couponStatus.trim();
    }

    public String getCouponFlag() {
        return couponFlag;
    }

    public void setCouponFlag(String couponFlag) {
        this.couponFlag = couponFlag == null ? null : couponFlag.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOptionAdminid() {
        return optionAdminid;
    }

    public void setOptionAdminid(String optionAdminid) {
        this.optionAdminid = optionAdminid == null ? null : optionAdminid.trim();
    }

    public Date getOptionTime() {
        return optionTime;
    }

    public void setOptionTime(Date optionTime) {
        this.optionTime = optionTime;
    }
}