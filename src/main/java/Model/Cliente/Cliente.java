package Model.Cliente;

import Model.Conta.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    protected String Id;
    protected Conta conta;

    public Cliente(){

    }

    public Conta getConta() {
        return this.conta;
    }

    public String getId() {
        return Id;
    }

    public Cliente setConta(Conta conta) {
        this.conta = conta;
        return this;
    }

    public Cliente setId(String id) {
        Id = id;
        return this;
    }
}
