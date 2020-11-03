package edu.ucsd.cs110.temperature;

public class Celsius extends Temperature {
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float tem = this.getValue();
        Temperature result = new Celsius(tem);
        return result;
    }

    @Override
    public Temperature toFahrenheit() {
       float tem = this.getValue();
       float num = ((tem*9)/5)+32;
       Temperature result = new Fahrenheit(num);
       return result;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+super.getValue()+" C";
    }
}
