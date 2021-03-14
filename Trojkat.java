package com.company;

public class Trojkat implements Figura
{
    private int podstawa;
    private int ramie;
    private int ramie2;
    private int wysokosc;
    private int pole;
    private int obwod;

    @Override
    public void obliczPole()
    {
        int podstawa = 3;
        int wysokosc = 4;
        int pole = (podstawa * wysokosc) / 2;
        System.out.println("Pole = " + pole);
    }

    @Override
    public void obliczObwod()
    {
        int podstawa = 3;
        int ramie = 3;
        int ramie2 = 4;
        int obwod = podstawa + ramie + ramie2;
        System.out.println("Obwod = " + obwod);
    }
}