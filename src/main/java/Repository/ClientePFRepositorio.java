package Repository;

import Model.Cliente.ClientePF;

import java.util.List;
import java.util.Optional;

public class ClientePFRepositorio {

    private List<ClientePF> lista;

    public ClientePFRepositorio(List<ClientePF> lista){
        this.lista = lista;
    }

    boolean salvar(ClientePF cliente){
        Optional<ClientePF> resultado = this.getByCpf(cliente.getCpf());
        if (!resultado.isEmpty()){
            System.out.println("O usuário já existe");
            return false;
        }

        this.lista.add(cliente);
        return true;
    }

    Optional<ClientePF> getByCpf(String cpf){
        return this.lista
                .stream()
                .filter(c -> c.getCpf() == cpf)
                .findFirst();

    }

    void remove(String cpf){
        this.lista.removeIf(c -> c.getCpf() == cpf);
    }

    boolean atualizar(ClientePF cliente){
        Optional<ClientePF> resultado = this.getByCpf(cliente.getCpf());
        if (resultado.isEmpty()){
            System.out.println("O usuário não existe");
            return false;
        }

        this.remove(cliente.getCpf());
        this.salvar(cliente);
        return true;
    }


}
