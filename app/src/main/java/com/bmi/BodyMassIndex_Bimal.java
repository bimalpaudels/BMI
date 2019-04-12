package com.bmi;

public class BodyMassIndex_Bimal {
    private double mass, height, heightinM;

    public BodyMassIndex_Bimal(double mass, double height)
    {
        this.height = height;
        this.mass = mass;
    }

    public double BMI()
    {
        heightinM = height/100;
        return mass/(heightinM*heightinM);
    }

}