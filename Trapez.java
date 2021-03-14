package com.company;

public class Trapez implements Figura
{
    private int podstawa;
    private int podstawa2;
    private int wysokosc;
    private int bok;
    private int bok2;
    private int pole;
    private int obwod;

    @Override
    public void obliczPole()
    {
        int bok = 2;
        int bok2 = 2;
        int wysokosc = 3;
        int pole = ((bok + bok2) * wysokosc) / 2;
        System.out.println("Pole = " + pole);
    }

    @Override
    public void obliczObwod()
    {
        int bok = 2;
        int bok2 = 2;
        int podstawa = 4;
        int podstawa2 = 6;
        int obwod = bok + bok2 + podstawa + podstawa2;
        System.out.println("Obwod = " + obwod);
    }
}