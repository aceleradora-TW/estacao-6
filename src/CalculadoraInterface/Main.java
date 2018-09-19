package CalculadoraInterface;

public class Main {


    public static void main(String[] args) {
        Calculadora calc1 = new Calculadora();
        System.out.println(calc1.soma(1,2));

        Calculadora calc2= new Calculadora();
        System.out.println(calc2.subtracao(55,5));

        Calculadora calc3= new Calculadora();
        System.out.println(calc3.divisao(22,8));

        Calculadora calc4= new Calculadora();
        System.out.println(calc4.multiplicacao(4,7));


    }
}