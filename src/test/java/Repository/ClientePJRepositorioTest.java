package Repository;

import Model.Cliente.ClientePJ;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClientePJRepositorioTest {

    @Test
    public void testSalvar() {
        var lista = new ArrayList<ClientePJ>();
        var repositorio = new ClientePJRepositorio(lista);

        var cliente = new ClientePJ("OurBank", "10.80");
        repositorio.salvar(cliente);

        assertEquals(cliente, lista.get(0));
    }

    @Test
    public void testGetByCnpj() {
        var lista = new ArrayList<ClientePJ>();
        var cliente = new ClientePJ("Ourbank", "10.80");
        lista.add(cliente);

        var Repositorio = new ClientePJRepositorio(lista);
        Optional<ClientePJ> resposta = Repositorio.getByCnpj("10.80");

        assertEquals("10.80", resposta.get().getCnpj());
    }

    @Test
    public void testRemove() {
        var lista = new ArrayList<ClientePJ>();
        var cliente = new ClientePJ("OurBank", "10.80");
        lista.add(cliente);

        var repositorio = new ClientePJRepositorio(lista);
        repositorio.remove("10.80");

        assertEquals(0, lista.size());
    }

}