package ru.itmo.potatocoder228.tpo.task1;

public class Secans implements Function {
    public Secans(){

    }

    public double function(double x){
        return 1.F/Math.cos(x);
    }
    public double derivative(double x, double accuracy){
        if(accuracy >= 1 || accuracy <= 0){
            return 0;
        }
        double dx = accuracy;
        return (function(x+dx) - function(x-dx))/(2*dx);
    }

    public double powerSeries(double x0, double x, long power){
        if(power <= 0 || x0>=x) return 0;
        double result = 0;
        for (long i = 0; i<=power; i++){
            if(i == 0) result += function(x0);
            else result += (derivative(x0, 1/Math.pow(10, power))*Math.pow(x-x0,i)/fact(i));
        }
        return result;
    }

    private long fact(long x){
        if(x <= 0) return 1;
        long result = 1;
        for(int i = 1; i<=x; i++){
            result *= i;
        } 
        return result;
    } 
}
