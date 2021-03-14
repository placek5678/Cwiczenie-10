package com.company;

public class Romb implements Figura
{
    private double przekatna;
    private double przekatna2;
    private int bok;
    private int pole;
    private int obwod;

    @Override
    public void obliczPole()
    {
        int przekatna = 3;
        int przekatna2 = 4;
        int pole = (przekatna * przekatna2) / 2;
        System.out.println("Pole = "+ pole);
    }

    @Override
    public void obliczObwod()
    {
        int bok = 3;
        int obwod = bok + bok + bok + bok;
        System.out.println("Obwod = "+ obwod);
    }
}