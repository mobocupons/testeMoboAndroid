package com.example.catjava;

import com.google.gson.annotations.SerializedName;

public class Post {
    private String name;
    private String id;
    @SerializedName("temperament")
    private String temperament;

    public String getNome() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getTemperament() {
        return temperament;
    }
}
