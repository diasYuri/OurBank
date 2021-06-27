package Repository;

import Model.Cliente.ClientePF;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClientePFRepositorioTest {

    @Test
    public void testSalvar() {
        var lista = new ArrayList<ClientePF>();
        var repositorio = new ClientePFRepositorio(lista);

        var cliente = new ClientePF("Any", "029.126.110-83");
        repositorio.salvar(cliente);


        assertEquals(cliente, lista.get(0));
    }

    @Test
    public void testGetById() {
        var lista = new ArrayList<ClientePF>();
        var cliente = new ClientePF("Any", "029.126.110-83");
        lista.add(cliente);


        var repositorio = new ClientePFRepositorio(lista);
        Optional<ClientePF> resposta = repositorio.getById("029.126.110-83");

        assertEquals(1, resposta.get().getId());
    }

    @Test
    public void testRemove() {
        var lista = new ArrayList<ClientePF>();
        var cliente = new ClientePF("Any", "029.126.110-83");
        lista.add(cliente);

        var repositorio = new ClientePFRepositorio(lista);
        repositorio.remove("029.126.110-83");

        assertEquals(0, lista.size());
    }

}