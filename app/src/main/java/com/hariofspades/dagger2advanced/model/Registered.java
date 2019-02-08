package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.SerializedName;

public class Registered {
    @SerializedName("date")
    private String date;

    @SerializedName("age")
    private Integer age;

    private void setDate(String date) { this.date = date; }

    private String getDate() { return this.date; }

    private void setAge(Integer age) { this.age = age; }

    private Integer getAge() { return this.age; }
}
