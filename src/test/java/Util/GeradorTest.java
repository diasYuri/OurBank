package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeradorTest
{

    @Test
    void deveRetornarONumeroDaContaNoPadraoCorreto()
    {
        assertEquals(true, Gerador.numeroConta().matches("[0-9]{8}-[0-9]{1}"));
    }
}