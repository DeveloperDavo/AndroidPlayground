package com.example.androidplayground.dogs.model;

import java.util.List;

public class BreedsListObject {
    private List<String> message;

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BreedsListObject{" +
                "message=" + message +
                '}';
    }
}
