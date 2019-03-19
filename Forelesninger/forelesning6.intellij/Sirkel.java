package no.hiof.torama.figurarv;

public class Sirkel extends Figur{
    private double radius;

    public Sirkel(double radius) {
        this.radius = radius;
    }
    @Override
    public double areal(){
        return Math.PI * radius * radius;
    }
    @Override
    public double omkrets(){
        return 2 * Math.PI * radius; 
    }
    public double beregnDiameter()  {
        return radius + radius;
    }
    @Override
    public String toString() {
        return "Sirkel med radius " + radius;
    }
}