package cn.sqhl.shop.vo;

import java.math.BigDecimal;
import java.util.Date;

public class Faq {
    private String id;

    private String faqTitle;

    private String faqTypeId;

    private String category;

    private String parentFaqId;

    private String hotQuestion;

    private BigDecimal order;

    private String createTime;

    private String createUserId;

    private String flag;

    private String belong;

    private String faqType;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getParentFaqId() {
        return parentFaqId;
    }

    public void setParentFaqId(String parentFaqId) {
        this.parentFaqId = parentFaqId == null ? null : parentFaqId.trim();
    }

    public String getHotQuestion() {
        return hotQuestion;
    }

    public void setHotQuestion(String hotQuestion) {
        this.hotQuestion = hotQuestion == null ? null : hotQuestion.trim();
    }

    public BigDecimal getOrder() {
        return order;
    }

    public void setOrder(BigDecimal order) {
        this.order = order;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId == null ? null : createUserId.trim();
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

    public String getFaqType() {
        return faqType;
    }

    public void setFaqType(String faqType) {
        this.faqType = faqType == null ? null : faqType.trim();
    }

    public String getFaqContent() {
        return faqContent;
    }

    public void setFaqContent(String faqContent) {
        this.faqContent = faqContent == null ? null : faqContent.trim();
    }
}