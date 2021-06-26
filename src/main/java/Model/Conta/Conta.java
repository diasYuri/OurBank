package Model.Conta;

import java.util.Date;
import java.math.BigDecimal;

public class Conta {

    private String agencia;
    private String numero;

    private BigDecimal dinheiro;

    private Date dataFiliação;
    private String chavePix;

    public String getAgencia() {
        return agencia;
    }

    public String getNumero() {
        return numero;
    }

    public BigDecimal getDinheiro() {
        return dinheiro;
    }

    public Date getDataFiliação() {
        return dataFiliação;
    }

    public String getChavePix() {
        return chavePix;
    }



}
