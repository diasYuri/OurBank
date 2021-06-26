package Model.Cliente;

import java.util.List;

public abstract class Cliente {

    protected int id;

    protected List<String> Contas;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<String> getContas() {
        return Contas;
    }

    public void setContas(List<String> contas) {
        Contas = contas;
    }
}
