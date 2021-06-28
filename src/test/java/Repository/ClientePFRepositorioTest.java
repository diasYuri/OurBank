package Repository;

import Model.Cliente.ClientePF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClientePFRepositorioTest {

    private List<ClientePF> lista;

    @BeforeEach
    void init(){
        lista = new ArrayList<ClientePF>();
    }

    public ClientePF criarCliente(){
       return new ClientePF("Any", "029.126.110-83");
    }

    @Test
    public void DeveRetornarFalseAoTentarSalvarUmClienteJaExistente() {
        var cliente = criarCliente();
        lista.add(cliente);

        var repositorio = new ClientePFRepositorio(lista);


        assertEquals(false, repositorio.salvar(cliente));
    }

    @Test
    public void deveSalvarCliente() {
        var repositorio = new ClientePFRepositorio(lista);

        var cliente = criarCliente();
        repositorio.salvar(cliente);


        assertEquals(cliente, lista.get(0));
    }

    @Test
    public void testGetById() {
        var cliente = criarCliente();
        lista.add(cliente);


        var repositorio = new ClientePFRepositorio(lista);
        Optional<ClientePF> resposta = repositorio.getByCpf("029.126.110-83");

        assertEquals("029.126.110-83", resposta.get().getCpf());
    }

    @Test
    public void testRemove() {
        var cliente = criarCliente();
        lista.add(cliente);

        var repositorio = new ClientePFRepositorio(lista);
        repositorio.remove("029.126.110-83");

        assertEquals(0, lista.size());
    }

    @Test
    public void deveRetornarFalseAoTentarAtualizarClienteInexistente(){
        ClientePF cliente = criarCliente();
        ClientePFRepositorio repo = new ClientePFRepositorio(new ArrayList<>());

        assertEquals(false, repo.atualizar(cliente));
    }

    @Test
    public void deveRetornarTrueAoAtualizarClienteExistente(){
        ClientePF cliente = criarCliente();
        lista.add(cliente);

        ClientePFRepositorio repo = new ClientePFRepositorio(lista);

        assertEquals(true, repo.atualizar(cliente));
    }

}