package com.example.test0508;
public class StuData {
    private Integer id;
    private String name;
    private String height;
    private String imageURL;

    public StuData(String imageURL, String name, String height) {
        this.name = name;
        this.height = height;
        this.imageURL = imageURL;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getHeight() {

        return height;
    }

    public void setHeight(String height) {

        this.height = height;
    }

    public StuData(Integer id, String name, String height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }
}

