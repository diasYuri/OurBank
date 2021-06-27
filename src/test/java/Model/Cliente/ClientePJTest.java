package Model.Cliente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePJTest {

    @Test
    void naoDeveSetarUmCnpjInvalido() {

        ClientePJ cliente = new ClientePJ();

        cliente.setCnpj("cnpjInvalido");

        assertEquals("", cliente.getCnpj());

    }

    @Test
    void DeveSetarUmCnpjValido() {

        ClientePJ cliente = new ClientePJ();

        cliente.setCnpj("42.623.188/0001-74");

        assertEquals("42.623.188/0001-74", cliente.getCnpj());

    }
}