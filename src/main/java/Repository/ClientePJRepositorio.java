package Repository;


import Model.Cliente.ClientePJ;

import java.util.List;
import java.util.Optional;

public class ClientePJRepositorio {

    private List<ClientePJ> lista;

    public ClientePJRepositorio(List<ClientePJ> lista){
        this.lista = lista;
    }

    public boolean salvar(ClientePJ cliente){
        Optional<ClientePJ> resultado = this.getByCnpj(cliente.getCnpj());
        if (!resultado.isEmpty()){
            System.out.println("O usuário já existe");
            return false;
        }

        this.lista.add(cliente);
        return true;
    }

    public Optional<ClientePJ> getByCnpj(String cnpj){
        return this.lista
                .stream()
                .filter(c -> c.getCnpj().equals(cnpj))
                .findFirst();

    }

    public boolean remove(String cnpj){
        return this.lista.removeIf(c -> c.getCnpj().equals(cnpj));
    }


    public boolean atualizar(ClientePJ cliente){
        Optional<ClientePJ> resultado = this.getByCnpj(cliente.getCnpj());
        if (resultado.isEmpty()){
            System.out.println("O usuário não existe");
            return false;
        }

        this.remove(cliente.getCnpj());
        this.salvar(cliente);
        return true;
    }
}
