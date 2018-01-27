package com.example.androidplayground.dogs;

import java.util.List;

public class BreedsListResponse {
    private List<String> message;

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "BreedsListResponse{" +
                "message=" + message +
                '}';
    }
}
