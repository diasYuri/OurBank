package Model.Conta;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    @Test
    void deveRetornarFalsoCasoValorDeDepositoSejaNegativoOuZero(){
        Conta conta = new Conta(new BigDecimal(0));


        assertEquals(false, conta.depositarDinheiro(new BigDecimal(-1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }

    @Test
    void deveRetornarTrueCasoValorDeDepositoSejaValido(){
        Conta conta = new Conta(new BigDecimal(0));
        var valor = new BigDecimal(1);


        assertEquals(true, conta.depositarDinheiro(valor));
        assertEquals(valor, conta.getSaldo());
    }


    @Test
    void deveRetornarFalseQuandoValorDaRetiradaEMenorOuIgualAZero() {
        Conta conta = new Conta(new BigDecimal(0));

        assertEquals(false, conta.retirarDinheiro(new BigDecimal(-1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }

    @Test
    void deveRetornarFalsoQuandoValorDaRetiradaEMaiorQueOSaldo() {
        Conta conta = new Conta(new BigDecimal(0));

        assertEquals(false, conta.retirarDinheiro(new BigDecimal(1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }

    @Test
    void deveRetornarTrueQuandoValorDaRetiradaEMenorOuIgualQueOSaldo() {
        Conta conta = new Conta(new BigDecimal(1));

        assertEquals(true, conta.retirarDinheiro(new BigDecimal(1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }
}