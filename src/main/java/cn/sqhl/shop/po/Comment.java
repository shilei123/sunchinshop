package cn.sqhl.shop.po;

import java.util.Date;

public class Comment {
    private String id;

    private String type;

    private String content;

    private Date contentTime;

    private Short score;

    private String ishidden;

    private String parentId;

    private String commentPeople;

    private String flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getContentTime() {
        return contentTime;
    }

    public void setContentTime(Date contentTime) {
        this.contentTime = contentTime;
    }

    public Short getScore() {
        return score;
    }

    public void setScore(Short score) {
        this.score = score;
    }

    public String getIshidden() {
        return ishidden;
    }

    public void setIshidden(String ishidden) {
        this.ishidden = ishidden == null ? null : ishidden.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getCommentPeople() {
        return commentPeople;
    }

    public void setCommentPeople(String commentPeople) {
        this.commentPeople = commentPeople == null ? null : commentPeople.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}