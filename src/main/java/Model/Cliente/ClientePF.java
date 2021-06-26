package Model.Cliente;

import java.util.Date;

public class ClientePF extends Cliente {

    private String nome;

    private String cpf;

    private Date dataNascimento;

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
}
