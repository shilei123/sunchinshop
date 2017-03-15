package cn.sqhl.shop.po;

import java.util.Date;

public class property {
    private String id;

    private String propCode;

    private String propName;

    private String propOrder;

    private String flag;

    private Date createTime;

    private String createPeople;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPropCode() {
        return propCode;
    }

    public void setPropCode(String propCode) {
        this.propCode = propCode == null ? null : propCode.trim();
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName == null ? null : propName.trim();
    }

    public String getPropOrder() {
        return propOrder;
    }

    public void setPropOrder(String propOrder) {
        this.propOrder = propOrder == null ? null : propOrder.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatePeople() {
        return createPeople;
    }

    public void setCreatePeople(String createPeople) {
        this.createPeople = createPeople == null ? null : createPeople.trim();
    }
}