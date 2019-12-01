package com.summaryofbooks.backend.domain;

public class Book {

    private String title;
    private String author;
    private String image;
    private String summary;

    public Book(String title, String author, String image, String summary) {
        this.title = title;
        this.author = author;
        this.image = image;
        this.summary = summary;
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
