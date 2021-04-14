package com.example.androidexam.models;

import java.lang.reflect.Array;
import java.util.List;

public class Ville {
    private String villeName;
    private List<Tranche> tranches;

    public Ville(String villeName, List<Tranche> tranches) {
        this.villeName = villeName;
        this.tranches = tranches;
    }

    public String getVilleName() {
        return villeName;
    }

    public void setVilleName(String villeName) {
        this.villeName = villeName;
    }

    public List<Tranche> getTranches() {
        return tranches;
    }

    public void setTranches(List<Tranche> tranches) {
        this.tranches = tranches;
    }
}
