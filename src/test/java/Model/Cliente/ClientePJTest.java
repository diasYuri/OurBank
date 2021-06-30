package Model.Cliente;

import Model.Conta.Conta;
import Util.Gerador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePJTest {

    @Test
    void naoDeveSetarUmCnpjInvalido() {

        ClientePJ cliente = new ClientePJ("qualquer", "invalido");

        assertEquals(null, cliente.getCnpj());

    }

    @Test
    void deveSetarUmCnpjValido() {

        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");


        assertEquals("42.623.188/0001-74", cliente.getCnpj());

    }

    @Test
    void deveRetornarRazãoSocial(){
        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");


        assertEquals("qualquer", cliente.getRazaoSocial());
    }

    @Test
    void getRazaoSocial() {
        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");

        assertEquals(true, cliente.getRazaoSocial().equals("qualquer"));
    }


    /// Classe abss

    @Test
    void TestGetId(){
        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");

        assertEquals(true, cliente.getId().equals("42.623.188/0001-74"));
    }

    @Test
    void TestGetConta(){
        ClientePJ cliente = new ClientePJ("qualquer", "42.623.188/0001-74");

        var conta = new Conta(new Gerador(), "", "00/00/0000");
        cliente.setConta(conta);

        assertEquals(true, cliente.getConta().equals(conta));
    }
}