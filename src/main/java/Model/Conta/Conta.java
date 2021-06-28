package Model.Conta;

import Util.Gerador;

import java.util.Date;
import java.math.BigDecimal;

public class Conta {

    private String agencia;
    private String numero;
    private BigDecimal saldo;
    private Date dataFiliação;
    private String chavePix;

    public Conta(Gerador gerador, String agencia, Date dataFiliação) {
        this.agencia = agencia;
        this.numero = gerador.numeroConta();
        this.dataFiliação = dataFiliação;
        this.saldo = new BigDecimal(0);
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public Date getDataFiliação() {
        return dataFiliação;
    }

    public String getChavePix() {
        return chavePix;
    }

    public Boolean retirarDinheiro(BigDecimal valor){
        if(valor == null){
            System.out.println("Valor não pode ser null");
            return false;
        }

        if(valor.compareTo(new BigDecimal(0)) != 1){
            System.out.println("Valor da retirada não pode ser menor ou igual a 0");
            return false;
        }

        if(valor.compareTo(this.saldo) == 1){
            System.out.println("Saldo indisponivel");
            return false;
        }

        this.saldo = this.saldo.subtract(valor);
        return true;
    }

    public Boolean depositarDinheiro(BigDecimal valor){
        if(valor == null){
            System.out.println("Valor não pode ser null");
            return false;
        }

        if(valor.compareTo(new BigDecimal(0)) != 1){
            System.out.println("Valor do deposito inválido");
            return false;
        }

        this.saldo = this.saldo.add(valor);
        return true;
    }

}
