package CalculadoraInterface;

public class Calculadora implements operacoesInterface {


    public float soma(float valorA, float valorB){
        return valorA + valorB;

    }

    public float subtracao(float valorA, float valorB){
        return valorA - valorB;

    }

    public float divisao(float valorA, float valorB){
        return valorA / valorB;
    }
    public float multiplicacao(float valorA, float valorB){
        return valorA * valorB;
    }
}
