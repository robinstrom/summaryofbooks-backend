package com.summaryofbooks.backend.domain;

public class Book {

    private Long id;
    private String title;
    private String author;
    private String image;
    private String summary;

    public Book(Long id, String title, String author, String image, String summary) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.image = image;
        this.summary = summary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
