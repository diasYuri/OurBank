package Repository;

import Model.Cliente.ClientePJ;

import java.util.List;
import java.util.Optional;

public class ClientePJRepositorio {

    private List<ClientePJ> lista;

    public ClientePJRepositorio(List<ClientePJ> lista){
        this.lista = lista;
    }

    void salvar(ClientePJ cliente){
        this.lista.add(cliente);
    }

    Optional<ClientePJ> getByCnpj(String cnpj){
        return this.lista
                .stream()
                .filter(c -> (c.getCnpj().equals(cnpj)))
                .findFirst();

    }

    void remove(String cnpj){
        this.lista.removeIf(c -> equals(c.getCnpj().equals(cnpj)));
    }
}
