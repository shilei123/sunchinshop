package cn.sqhl.shop.po;

import java.util.Date;

public class AskQuestion {
    private String id;

    private String faqTitle;

    private String faqTypeId;

    private String type;

    private String parentId;

    private String hotQuestion;

    private String faqOrder;

    private Date createTime;

    private String createPeople;

    private String flag;

    private String belong;

    private String faqContent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getFaqTitle() {
        return faqTitle;
    }

    public void setFaqTitle(String faqTitle) {
        this.faqTitle = faqTitle == null ? null : faqTitle.trim();
    }

    public String getFaqTypeId() {
        return faqTypeId;
    }

    public void setFaqTypeId(String faqTypeId) {
        this.faqTypeId = faqTypeId == null ? null : faqTypeId.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getHotQuestion() {
        return hotQuestion;
    }

    public void setHotQuestion(String hotQuestion) {
        this.hotQuestion = hotQuestion == null ? null : hotQuestion.trim();
    }

    public String getFaqOrder() {
        return faqOrder;
    }

    public void setFaqOrder(String faqOrder) {
        this.faqOrder = faqOrder == null ? null : faqOrder.trim();
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong == null ? null : belong.trim();
    }

    public String getFaqContent() {
        return faqContent;
    }

    public void setFaqContent(String faqContent) {
        this.faqContent = faqContent == null ? null : faqContent.trim();
    }
}