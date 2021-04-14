package com.example.androidexam.dao;

import com.example.androidexam.models.Tranche;
import com.example.androidexam.models.Ville;

import java.util.List;

public class MemoryVilleDao implements VilleDao{
    private List<Ville> villes;
    private List<Tranche> tranches;

    public MemoryVilleDao(List<Ville> villes) {
        this.villes = villes;

        tranches.add(new Tranche(0,6));
        tranches.add(new Tranche(6,12));
        tranches.add(new Tranche(12,20));
        tranches.add(new Tranche(20));


        villes.add(new Ville("Rabat", tranches));
        villes.add(new Ville("Casablanca", tranches));
        villes.add(new Ville("Fes", tranches));
        villes.add(new Ville("Autre", tranches));
    }

    @Override
    public int Coffeicient(Ville ville, int coeff) {
        return 0;
    }

//    @Override
//    public int Coffeicient(Ville v, int coeff){
//        int quantity = 0;
//        switch(v.getVilleName()) {
//            case "Rabat":
//                for (int i = 0; i < coeff ; i++) {
//                    if(coeff>20){
//                        quantity += coeff * tranches[4]
//                    }
//                }
//                break;
//            case "Casablnca":
//                // code block
//                break;
//            case "Fes":
//
//                break;
//            default:
//                // code block
//        }
//
//        return quantity;
//    }
}
