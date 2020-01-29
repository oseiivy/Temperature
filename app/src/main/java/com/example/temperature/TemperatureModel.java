package com.example.temperature;

public class TemperatureModel
{
    private String temperature;

    public TemperatureModel(String x)
    {
        this.temperature = x;
    }

    public String convertToC()
    {
        double F = Double.parseDouble(this.temperature);
        double C = 5*(F-32)/9;
        String conversion = String.format("%.0f", C);
        return conversion;
    }

    public String convertToF()
    {
        double C = Double.parseDouble(this.temperature);
        double F = 32 + (9*C)/5 ;
        String conversion = String.format("%.0f", F);
        return conversion;
    }

    public String clear()
    {
        String clear = " ";
        return clear;
    }
}
