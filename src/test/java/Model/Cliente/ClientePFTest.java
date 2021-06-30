package Model.Cliente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientePFTest {

    @Test
    void naoDeveSetarUmCpfInvalido() {
        ClientePF cliente = new ClientePF("qualquerNome", "cpfInvalido");

        assertEquals(null, cliente.getCpf());
    }

    @Test
    void deveSetarUmCpfValido() {
        ClientePF cliente = new ClientePF("qualquerNome", "029.126.110-83");

        assertEquals("029.126.110-83", cliente.getCpf());
    }

    @Test
    void deveRetornarNome() {
        ClientePF cliente = new ClientePF("qualquerNome", "029.126.110-83");

        assertEquals("qualquerNome", cliente.getNome());
    }
}