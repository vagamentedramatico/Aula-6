package TA3;

public class Calculator {

    private double valor1;
    private double valor2;

    public Calculator(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1(){
        return valor1;
    }

    public double getValor2(){
        return valor2;
    }

    public void setValor1(double valor1){
        this.valor1 = valor1;
    }

    public void setValor2(double valor2){
        this.valor2 = valor2;
    }

    public double getSum() {return valor1 + valor2;}
    public double getSub() {return valor1 - valor2;}
    public double getMult() {return valor1 * valor2;}
    public double getDiv() {return valor1 / valor2;}
    public double getPow() {return Math.pow(valor1, valor2);}

}
