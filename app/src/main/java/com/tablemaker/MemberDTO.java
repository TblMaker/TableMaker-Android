package com.tablemaker;

public class MemberDTO {

    private int image;
    private double heartRating;
    private double distance;
    private String name;

    public MemberDTO(int image, String name, double heartRating, double distance) {
        this.image = image;
        this.heartRating = heartRating;
        this.distance = distance;
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public double getHeartRating() {
        return heartRating;
    }

    public void setHeartRating(double heartRating) {
        this.heartRating = heartRating;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
