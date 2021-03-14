package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Romb: ");
        Romb romb = new Romb();
        romb.obliczPole();
        romb.obliczObwod();
        System.out.println();
        System.out.println("Trojkat: ");
        Trojkat trojkat = new Trojkat();
        trojkat.obliczPole();
        trojkat.obliczObwod();
        System.out.println();
        System.out.println("Trapez: ");
        Trapez trapez = new Trapez();
        trapez .obliczPole();
        trapez.obliczObwod();
        System.out.println();
    }
}
