package com.railway.info.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "news", schema = "taiwan_railway_api_info", catalog = "")
public class NewsEntity {
    private String newsId;
    private int language;
    private String title;
    private int newsCategory;
    private String description;
    private String newsUrl;
    private String attachmentUrl;
    private Timestamp startTime;
    private Timestamp endTime;
    private Timestamp publishTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "news_id")
    public String getNewsId() {
        return newsId;
    }

    public void setNewsId(String newsId) {
        this.newsId = newsId;
    }

    @Basic
    @Column(name = "language")
    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "news_category")
    public int getNewsCategory() {
        return newsCategory;
    }

    public void setNewsCategory(int newsCategory) {
        this.newsCategory = newsCategory;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "news_url")
    public String getNewsUrl() {
        return newsUrl;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }

    @Basic
    @Column(name = "attachment_url")
    public String getAttachmentUrl() {
        return attachmentUrl;
    }

    public void setAttachmentUrl(String attachmentUrl) {
        this.attachmentUrl = attachmentUrl;
    }

    @Basic
    @Column(name = "start_time")
    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "publish_time")
    public Timestamp getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Timestamp publishTime) {
        this.publishTime = publishTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsEntity that = (NewsEntity) o;
        return language == that.language &&
                newsCategory == that.newsCategory &&
                Objects.equals(newsId, that.newsId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(newsUrl, that.newsUrl) &&
                Objects.equals(attachmentUrl, that.attachmentUrl) &&
                Objects.equals(startTime, that.startTime) &&
                Objects.equals(endTime, that.endTime) &&
                Objects.equals(publishTime, that.publishTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, language, title, newsCategory, description, newsUrl, attachmentUrl, startTime, endTime, publishTime, updateTime);
    }
}
