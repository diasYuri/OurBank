package Model.Cliente;

public class ClientePF extends Cliente {


    private String nome;

    private String cpf;

    public ClientePF(String nome, String cpf) {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public ClientePF setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClientePF setCpf(String cpf) {
        if(!cpf.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}")){

            System.out.println("Cpf inválido");
            return this;
        }

        this.cpf = cpf;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


}
