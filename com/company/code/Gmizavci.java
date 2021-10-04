package com.company.code;

public class Gmizavci extends Zivotinje{

    double temperatura;

    public Gmizavci(int godine,String ishrana, double cena, double temperatura){
        super(godine, cena, ishrana);
        this.temperatura = temperatura;
    }
}
