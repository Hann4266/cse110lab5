package edu.ucsd.cs110.temperature;

public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {

        float tem = this.getValue();
        float num = ((tem-32)*5)/9;
        Temperature result = new Celsius(num);
        return result;
    }

    @Override
    public Temperature toFahrenheit() {
        float tem = this.getValue();
        Temperature result = new Fahrenheit(tem);
        return result;
    }

    public String toString()
    {
        // TODO: Complete this method
        return ""+super.getValue()+" F";
    }
}
