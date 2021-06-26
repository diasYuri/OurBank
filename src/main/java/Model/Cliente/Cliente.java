package Model.Cliente;

import java.util.List;

public abstract class Cliente {

    private Long ID;

    List<String> Contas;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public List<String> getContas() {
        return Contas;
    }

    public void setContas(List<String> contas) {
        Contas = contas;
    }
}
