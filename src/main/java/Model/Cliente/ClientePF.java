package Model.Cliente;

public class ClientePF extends Cliente {

    public ClientePF(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    private String nome;

    private String cpf;


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


}
