package Repository;

import Model.Cliente.ClientePF;

import java.util.List;
import java.util.Optional;

public class ClientePFRepositorio {

    private List<ClientePF> lista;

    public ClientePFRepositorio(List<ClientePF> lista){
        this.lista = lista;
    }

    void salvar(ClientePF cliente){
        this.lista.add(cliente);
    }

    Optional<ClientePF> getById(String cpf){
        return this.lista
                .stream()
                .filter(c -> c.getCpf() == cpf)
                .findFirst();

    }

    void remove(String cpf){
        this.lista.removeIf(c -> c.getCpf() == cpf);
    }

}
