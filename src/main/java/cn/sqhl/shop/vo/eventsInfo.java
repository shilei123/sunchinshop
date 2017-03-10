package cn.sqhl.shop.vo;

import java.util.Date;

public class eventsInfo {
    private String vId;

    private String vName;

    private String vIsuse;

    private String vMemo;

    private Date vStarttime;

    private Date vEndtime;

    private Date vCreatetime;

    private Date vUpdatetime;

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

    public String getvIsuse() {
        return vIsuse;
    }

    public void setvIsuse(String vIsuse) {
        this.vIsuse = vIsuse == null ? null : vIsuse.trim();
    }

    public String getvMemo() {
        return vMemo;
    }

    public void setvMemo(String vMemo) {
        this.vMemo = vMemo == null ? null : vMemo.trim();
    }

    public Date getvStarttime() {
        return vStarttime;
    }

    public void setvStarttime(Date vStarttime) {
        this.vStarttime = vStarttime;
    }

    public Date getvEndtime() {
        return vEndtime;
    }

    public void setvEndtime(Date vEndtime) {
        this.vEndtime = vEndtime;
    }

    public Date getvCreatetime() {
        return vCreatetime;
    }

    public void setvCreatetime(Date vCreatetime) {
        this.vCreatetime = vCreatetime;
    }

    public Date getvUpdatetime() {
        return vUpdatetime;
    }

    public void setvUpdatetime(Date vUpdatetime) {
        this.vUpdatetime = vUpdatetime;
    }

    public String getvFlag() {
        return vFlag;
    }

    public void setvFlag(String vFlag) {
        this.vFlag = vFlag == null ? null : vFlag.trim();
    }
}