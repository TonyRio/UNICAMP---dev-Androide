package com.example.helloworld;

public class Operacoes {
    private float a;
    private float b;

    public Operacoes (float a , float b) {
        this.a = a;
        this.b = b;

    }
    public float  soma(){
        return a +b ;
    }
    public float subtracao() {
        return  a - b;
    }
    public float multiplicacao(){
        return  a*b ;
    }
    public float divisao(){
        return  a/b ;

    }
public static void  main(String[] args){
        float number1 = 6;
        float number2 = 4;
        Operacoes operacoes = new Operacoes(number1, number2);
        System.out.println(operacoes.soma());
        System.out.println(operacoes.subtracao());
        System.out.println(operacoes.multiplicacao());
        System.out.println(operacoes.divisao());
}

}

