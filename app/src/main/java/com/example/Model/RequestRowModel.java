package com.example.Model;

public class RequestRowModel {

    String name;
    String message;
    int image;

    public RequestRowModel(String name, String message, int image) {
        this.name = name;
        this.message = message;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
