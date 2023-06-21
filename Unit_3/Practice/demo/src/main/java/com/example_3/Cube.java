package com.example_3;

import lombok.*;

public class Cube {
    private Integer sumSize;

    public Cube(Integer sumSize, String colors, String material) {
        this.sumSize = sumSize;
        this.colors = colors;
        this.material = material;
    }

    private String colors;
    private String material;

    public Integer volumeCube() {
        return sumSize * sumSize * sumSize;
    }

    public Integer getSumSize() {
        return sumSize;
    }

    public void setSumSize(Integer sumSize) {
        this.sumSize = sumSize;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cube [sumSize=" + sumSize + ", colors=" + colors + ", material=" + material + "]";
    }
}