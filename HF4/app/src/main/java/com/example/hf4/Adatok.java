package com.example.hf4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Adatok implements Serializable {

    private  Integer zaszlok;
    private  String  symbol;
    private String symbolname;
     private double cumpara;
    private double vinde;


    public Adatok(Integer zaszlok, String symbol, String symbolname, double cumpara, double vinde) {
        this.zaszlok = zaszlok;
        this.symbol = symbol;
        this.symbolname = symbolname;
        this.cumpara = cumpara;
        this.vinde = vinde;
    }

    public Integer getZaszlok() {
        return zaszlok;
    }

    public void setZaszlok(Integer zaszlok) {
        this.zaszlok = zaszlok;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbolname() {
        return symbolname;
    }

    public void setSymbolname(String symbolname) {
        this.symbolname = symbolname;
    }

    public double getCumpara() {
        return cumpara;
    }

    public void setCumpara(double cumpara) {
        this.cumpara = cumpara;
    }

    public double getVinde() {
        return vinde;
    }

    public void setVinde(double vinde) {
        this.vinde = vinde;
    }

    public static List<Adatok> getContacts() {
        List<Adatok> contacts = new ArrayList<>();
        contacts.add(new Adatok(R.drawable.da , "DA","DADADA",5.00,4.99));
        contacts.add(new Adatok(R.drawable.eu , "EUR","EURO",15.00,42.99));
        contacts.add(new Adatok(R.drawable.magyar , "ma","magyar",51.00,41.99));
        contacts.add(new Adatok(R.drawable.szekely , "szek","szekely",511.00,41.99));
        contacts.add(new Adatok(R.drawable.uk , "uk","UK",511.00,411.99));


        return contacts;
    }

}
