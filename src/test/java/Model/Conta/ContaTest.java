package Model.Conta;

import Util.Gerador;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {

    Conta criaConta(){
        return new Conta(new Gerador(), "", new Date());
    }

    @Test
    void deveRetornarFalsoCasoValorDeDepositoSejaNegativoOuZero(){
        Conta conta = criaConta();

        assertEquals(false, conta.depositarDinheiro(new BigDecimal(-1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }

    @Test
    void deveRetornarTrueCasoValorDeDepositoSejaValido(){
        Conta conta = criaConta();
        var valor = new BigDecimal(1);


        assertEquals(true, conta.depositarDinheiro(valor));
        assertEquals(valor, conta.getSaldo());
    }

    @Test
    void deveRetornarFalseCasoValorDeDepositarSejaNull(){
        Conta conta = criaConta();

        assertEquals(false, conta.depositarDinheiro(null));
    }

    @Test
    void deveRetornarFalseCasoValorDeRetiradaSejaNull(){
        Conta conta = criaConta();

        assertEquals(false, conta.retirarDinheiro(null));
    }


    @Test
    void deveRetornarFalseQuandoValorDaRetiradaEMenorOuIgualAZero() {
        Conta conta = criaConta();

        assertEquals(false, conta.retirarDinheiro(new BigDecimal(-1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }

    @Test
    void deveRetornarFalsoQuandoValorDaRetiradaEMaiorQueOSaldo() {
        Conta conta = criaConta();

        assertEquals(false, conta.retirarDinheiro(new BigDecimal(1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }

    @Test
    void deveRetornarTrueQuandoValorDaRetiradaEMenorOuIgualQueOSaldo() {
        Conta conta = criaConta();
        conta.depositarDinheiro(new BigDecimal(1));

        assertEquals(true, conta.retirarDinheiro(new BigDecimal(1)));
        assertEquals(new BigDecimal(0), conta.getSaldo());
    }
}