package com.thoughtworks.aceleradora;

public class IdentificadorDeArmstrong {

    public String identificaNumero(int numero) {
        String arr [] = Integer.toString(numero).split("");
        double resultado = 0;

        for(int i=0; i<arr.length; i++){
            resultado += Math.pow(Double.parseDouble(arr[i]), arr.length);
        }

        if(resultado == numero){
            return "Este eh um numero de Armstrong!";
        }

        return "Este nao eh um numero de Armstrong!";
    }
}