package Util;

import java.util.Random;

public class Gerador {

    private static Random random = new Random();

    public static String numeroConta()
    {

        StringBuilder numeroConta = new StringBuilder();

        for(int i=0; i<8; i++){
            int n = random.nextInt() % 10;
            numeroConta.append(Math.abs(n));
        }

        numeroConta.append("-");

        int digito = Math.abs(random.nextInt()%10);
        numeroConta.append(digito);

        return numeroConta.toString();
    }
}
