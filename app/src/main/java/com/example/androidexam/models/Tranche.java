package com.example.androidexam.models;

public class Tranche {
    private int minVlaue;
    private  int maxValue;

    public Tranche(int minVlaue, int maxValue) {
        this.minVlaue = minVlaue;
        this.maxValue = maxValue;
    }

    //will do this for the last one ( >20) because it has no max value :)
    public Tranche(int minVlaue) {
        this.minVlaue = minVlaue;
    }

    public int getMinVlaue() {
        return minVlaue;
    }

    public void setMinVlaue(int minVlaue) {
        this.minVlaue = minVlaue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}
