package Repoitory;

import Model.Cliente.ClientePF;

import java.util.List;
import java.util.Optional;

public class ClienteRepositorio {

    private List<ClientePF> lista;

    public ClienteRepositorio(List<ClientePF> lista){
        this.lista = lista;
    }

    void salvar(ClientePF cliente){
        this.lista.add(cliente);
    }

    Optional<ClientePF> getById(int id){
        return this.lista
                .stream()
                .filter(c -> c.getId() == id)
                .findFirst();

    }

    void remove(int id){
        this.lista.removeIf(c -> c.getId() == id);
    }

}
