package com.example.a5lesson;

public class Planet {

    private String name;
    private String planetDescription;
    private int planetRes;

    public Planet(String name, String planetDescription, int planetRes) {
        this.name = name;
        this.planetDescription = planetDescription;
        this.planetRes = planetRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanetDescription() {
        return planetDescription;
    }

    public void setPlanetDescription(String planetDescription) {
        this.planetDescription = planetDescription;
    }

    public int getPlanetRes() {
        return planetRes;
    }

    public void setPlanetRes(int planetRes) {
        this.planetRes = planetRes;
    }
}
