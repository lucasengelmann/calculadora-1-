package Calculadora;

public class Calculadora {

    public double soma(double valorUm, double valorDois){
        return (valorUm + valorDois);
    }
    public double subtrair(double valorUm, double valorDois){
        return (valorUm - valorDois);
    }
    public double multiplicar(double valorUm, double valorDois){
        return (valorUm * valorDois);
    }
    public double dividir(double valorUm, double valorDois){
        return (valorUm / valorDois);
    }
    public double raizQuadrada(double valorUm) {
        return (Math.sqrt(valorUm));
    }
    public double potencia(double valorUm, double valorDois){
        return (Math.pow(valorUm, valorDois));
    }
}
