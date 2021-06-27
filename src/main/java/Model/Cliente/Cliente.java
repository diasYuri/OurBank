package Model.Cliente;

import Model.Conta.Conta;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    protected List<Conta> contas;

    public Cliente(){
        contas = new ArrayList<Conta>();
    }

    public List<Conta> getContas() {
        return this.contas;
    }
}
