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

        var cliente = new ClientePJ();
        repositorio.salvar(cliente);

        assertEquals(cliente, lista.get(0));
    }

    @Test
    public void testGetByCnpj() {
        var lista = new ArrayList<ClientePJ>();
        var cliente = new ClientePJ();
        cliente.setCnpj("42.623.188/0001-74");

        lista.add(cliente);

        var Repositorio = new ClientePJRepositorio(lista);
        Optional<ClientePJ> resposta = Repositorio.getByCnpj("42.623.188/0001-74");

        assertEquals("42.623.188/0001-74", resposta.get().getCnpj());
    }

    @Test
    public void testRemove() {
        var lista = new ArrayList<ClientePJ>();
        var cliente = new ClientePJ();
        cliente.setCnpj("42.623.188/0001-74");

        lista.add(cliente);

        var repositorio = new ClientePJRepositorio(lista);
        repositorio.remove("42.623.188/0001-74");

        assertEquals(0, lista.size());
    }

}