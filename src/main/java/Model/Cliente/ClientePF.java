package Model.Cliente;

public class ClientePF extends Cliente {

    public ClientePF(String nome, String cpf, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.id = id;
    }

    private String nome;

    private String cpf;

    public ClientePF setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public ClientePF setCpf(String cpf) {
        if(!cpf.matches("/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/")){
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
