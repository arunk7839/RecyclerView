package com.example.recyclerview;

import java.io.Serializable;

public class Book implements Serializable {
    String authorName;
    String bookName;
    int imageResource;
    String description;

    public Book(String authorName, String bookName, int imageResource, String description) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.imageResource = imageResource;
        this.description = description;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
