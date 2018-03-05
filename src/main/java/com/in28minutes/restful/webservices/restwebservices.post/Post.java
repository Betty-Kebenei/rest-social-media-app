package com.in28minutes.restful.webservices.restwebservices.post;

import java.util.Date;

public class Post {

    private Integer id;

    protected Integer userId;

    private String title;

    private String details;

    private Date postDate;

    public Post(){

    }

    public Post(Integer id, Integer userId, String title, String details, Date postDate) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.details = details;
        this.postDate = postDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                ", postDate=" + postDate +
                '}';
    }
}
