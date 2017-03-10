package cn.sqhl.shop.vo;

import java.util.Date;

public class advertise {
    private String vId;

    private String vName;

    private String vMemo;

    private String vLinkkind;

    private String vImglink;

    private String vOrdernumb;

    private String vType;

    private String vIsuse;

    private String vKind;

    private Date vStartTime;

    private Date vEndTime;

    private Date vCreateTime;

    private Date vUpdateTime;

    private String vFlag;

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId == null ? null : vId.trim();
    }

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public String getvMemo() {
        return vMemo;
    }

    public void setvMemo(String vMemo) {
        this.vMemo = vMemo == null ? null : vMemo.trim();
    }

    public String getvLinkkind() {
        return vLinkkind;
    }

    public void setvLinkkind(String vLinkkind) {
        this.vLinkkind = vLinkkind == null ? null : vLinkkind.trim();
    }

    public String getvImglink() {
        return vImglink;
    }

    public void setvImglink(String vImglink) {
        this.vImglink = vImglink == null ? null : vImglink.trim();
    }

    public String getvOrdernumb() {
        return vOrdernumb;
    }

    public void setvOrdernumb(String vOrdernumb) {
        this.vOrdernumb = vOrdernumb == null ? null : vOrdernumb.trim();
    }

    public String getvType() {
        return vType;
    }

    public void setvType(String vType) {
        this.vType = vType == null ? null : vType.trim();
    }

    public String getvIsuse() {
        return vIsuse;
    }

    public void setvIsuse(String vIsuse) {
        this.vIsuse = vIsuse == null ? null : vIsuse.trim();
    }

    public String getvKind() {
        return vKind;
    }

    public void setvKind(String vKind) {
        this.vKind = vKind == null ? null : vKind.trim();
    }

    public Date getvStartTime() {
        return vStartTime;
    }

    public void setvStartTime(Date vStartTime) {
        this.vStartTime = vStartTime;
    }

    public Date getvEndTime() {
        return vEndTime;
    }

    public void setvEndTime(Date vEndTime) {
        this.vEndTime = vEndTime;
    }

    public Date getvCreateTime() {
        return vCreateTime;
    }

    public void setvCreateTime(Date vCreateTime) {
        this.vCreateTime = vCreateTime;
    }

    public Date getvUpdateTime() {
        return vUpdateTime;
    }

    public void setvUpdateTime(Date vUpdateTime) {
        this.vUpdateTime = vUpdateTime;
    }

    public String getvFlag() {
        return vFlag;
    }

    public void setvFlag(String vFlag) {
        this.vFlag = vFlag == null ? null : vFlag.trim();
    }
}