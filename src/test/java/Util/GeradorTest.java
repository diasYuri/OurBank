package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeradorTest
{

    @Test
    void numeroConta()
    {
        Gerador gerador = new Gerador();

        System.out.println(gerador.numeroConta());

        assertEquals(10, gerador.numeroConta().length());
    }
}