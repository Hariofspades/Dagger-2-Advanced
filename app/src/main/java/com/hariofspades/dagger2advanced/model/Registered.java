package com.hariofspades.dagger2advanced.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Registered
{
    @SerializedName( "date" )
    @Expose
    private String date;

    @SerializedName( "age" )
    @Expose
    private int age;

    public String getDate()
    {
        return date;
    }

    public void setDate( String date )
    {
        this.date = date;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge( int age )
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return new ToStringBuilder( this ).append( "date", date ).append( "age", age ).toString();
    }
}
