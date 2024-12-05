package exercicios.banco;

import java.util.ArrayList;

public class BancoTesta {

    public static void main(String[] args) {
        BancoList banco = new BancoList("Exemplo's Bank","12345.67",new ArrayList<Conta>());

        // abrirConta:
        banco.abrirConta("123.456.789-01","1111-11","222-2",100);
        banco.abrirConta("123.456.789-01","2222-22","111-1",-100);
        System.out.println(banco.toString());

        // transferir:
        banco.transferir("2222-22", "111-1","1111-11","222-2",50);

        // sacar:
        banco.sacarDeConta("1111-11","222-2",10);

        // depositar
        banco.depositarEmConta("1111-11","222-2",1000);

        // consultar saldo:
        banco.consultarSaldoDeConta("2222-22","111-1");
    }
}
