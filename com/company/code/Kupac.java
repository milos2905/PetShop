package com.company.code;

public class Kupac extends Osobe{
    Korpa korpa = new Korpa();
    String nacinPlacanja;

    public void ubaciUKorpuZivotinje(Zivotinje[] odabraneZivotinje){
        this.korpa.izabraniLjubimac = odabraneZivotinje;
        for (Zivotinje zivotinja:odabraneZivotinje) {
            korpa.ukupanIznos += zivotinja.cena;
        }
        System.out.println("Ukupna cena je: " + korpa.ukupanIznos);
    }

    public void ubaciUKorpuHranu(Hrana[] odabranaHrana){
        this.korpa.izabranaHrana = odabranaHrana;
        for (Hrana hrana:odabranaHrana) {
            korpa.ukupanIznos += hrana.cena;
        }
        System.out.println("Ukupna cena je: " + korpa.ukupanIznos);
    }
}
