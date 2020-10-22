package com.railway.info.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class News {
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
        News news = (News) o;
        return language == news.language &&
                newsCategory == news.newsCategory &&
                Objects.equals(newsId, news.newsId) &&
                Objects.equals(title, news.title) &&
                Objects.equals(description, news.description) &&
                Objects.equals(newsUrl, news.newsUrl) &&
                Objects.equals(attachmentUrl, news.attachmentUrl) &&
                Objects.equals(startTime, news.startTime) &&
                Objects.equals(endTime, news.endTime) &&
                Objects.equals(publishTime, news.publishTime) &&
                Objects.equals(updateTime, news.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(newsId, language, title, newsCategory, description, newsUrl, attachmentUrl, startTime, endTime, publishTime, updateTime);
    }
}
