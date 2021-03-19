package Testes;
import Calculadora.Calculadora;
import org.junit.Assert;
import org.junit.Test;


public class CalculadoraTest {

    @Test
    public void deveSomarCorretamente(){


        double valorUm = 2;
        double valorDois = 8;
        double resultadoEsperado = 10;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.soma(valorUm, valorDois);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);

    }

    @Test
    public void deveSubtrairCorretamente(){

        double valorUm = 10;
        double valorDois = 5;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.subtrair(valorUm, valorDois);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);

    }

    @Test
    public void deveMultiplicarCorretamente(){

        double valorUm = 4;
        double valorDois = 4;
        double resultadoEsperado = 16;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplicar(valorUm, valorDois);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);

    }

    @Test
    public void deveDividirCorretamentePontosFlutuantes(){

        double valorUm = 7;
        double valorDois = 2;
        double resultadoEsperado = 3.5;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.dividir(valorUm, valorDois);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteInteiros(){

        double valorUm = 6;
        double valorDois = 2;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.dividir(valorUm, valorDois);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveRealizarRaizDeNumerosInteiros(){

        double valorUm = 225;
        double resultadoEsperado = 15;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.raizQuadrada(valorUm);


        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveRealizarPotenciaDeNumerosInteiros(){

        double valorUm = 7;
        double valorDois = 2;
        double resultadoEsperado = 49;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.potencia(valorUm, valorDois);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

}
