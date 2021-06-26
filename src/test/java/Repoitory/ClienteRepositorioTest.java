package Repoitory;

import Model.Cliente.ClientePF;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Optional;

public class ClienteRepositorioTest extends TestCase {

    public void testSalvar() {
        var lista = new ArrayList<ClientePF>();
        var repositorio = new ClienteRepositorio(lista);

        var cliente = new ClientePF("Any", "123", 1);
        repositorio.salvar(cliente);

        assertEquals(cliente, lista.get(0));
    }

    public void testGetById() {
        var lista = new ArrayList<ClientePF>();
        var cliente = new ClientePF("Any", "123", 1);
        lista.add(cliente);


        var repositorio = new ClienteRepositorio(lista);
        Optional<ClientePF> resposta = repositorio.getById(1);

        assertEquals(1, resposta.get().getId());
    }

    public void testRemove() {
        var lista = new ArrayList<ClientePF>();
        var cliente = new ClientePF("Any", "123", 1);
        lista.add(cliente);

        var repositorio = new ClienteRepositorio(lista);
        repositorio.remove(1);

        assertEquals(0, lista.size());
    }
}