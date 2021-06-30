package Repository;

import Model.Cliente.ClientePF;
import Model.Cliente.ClientePJ;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ClientePJRepositorioTest {

    List<ClientePJ> lista;

    @BeforeEach
    void init(){
        lista = new ArrayList<ClientePJ>();
    }

    @Test
    public void deveSalvaUmClienteNaLista() {
        var repositorio = new ClientePJRepositorio(lista);

        var cliente = new ClientePJ("qualquer", "42.623.188/0001-74");

        assertEquals(true, repositorio.salvar(cliente));
        assertEquals(cliente, lista.get(0));
    }

    @Test
    public void deveRetornarFalseAoTentarSalvarUmClienteJaExistenteNaLista() {
        var cliente = new ClientePJ("qualquer", "42.623.188/0001-74");
        lista.add(cliente);

        var repositorio = new ClientePJRepositorio(lista);


        assertEquals(false, repositorio.salvar(cliente));
        assertEquals(1, lista.size());
    }

    @Test
    public void testGetByCnpj() {
        var cliente = new ClientePJ("qualquer", "42.623.188/0001-74");

        lista.add(cliente);

        var Repositorio = new ClientePJRepositorio(lista);
        Optional<ClientePJ> resposta = Repositorio.getByCnpj("42.623.188/0001-74");

        assertEquals("42.623.188/0001-74", resposta.get().getCnpj());
    }

    @Test
    public void deveRetornarTrueERemoveUmObjetoExistente() { ;
        var cliente = new ClientePJ("qualquer", "42.623.188/0001-74");

        lista.add(cliente);

        var repositorio = new ClientePJRepositorio(lista);

        assertEquals(true, repositorio.remove("42.623.188/0001-74"));
        assertEquals(0, lista.size());
    }

    @Test
    public void deveRetornarFalseAoTentarRemoveUmObjetoInexistente() {
        var repositorio = new ClientePJRepositorio(lista);

        assertEquals(false, repositorio.remove("42.623.188/0001-74"));
    }

    @Test
    public void deveRetornarFalseAoTentarAtualizarClienteInexistente(){
        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");
        ClientePJRepositorio repo = new ClientePJRepositorio(lista);

        assertEquals(false, repo.atualizar(cliente));
    }

    @Test
    public void deveRetornarTrueAoAtualizarClienteExistente(){
        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");
        lista.add(cliente);

        ClientePJRepositorio repo = new ClientePJRepositorio(lista);

        assertEquals(true, repo.atualizar(cliente));
    }

}