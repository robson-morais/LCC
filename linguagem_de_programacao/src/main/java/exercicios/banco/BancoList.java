package exercicios.banco;

import java.util.ArrayList;

public class BancoList {

    private String nome;
    private String cnpj;
    private ArrayList<Conta> contas;

    public BancoList(String nome, String cnpj, ArrayList<Conta> contas) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.contas = contas != null ? contas : new ArrayList<>();
    }

    public BancoList() {
        this("", "", new ArrayList<>());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }
/*
    + Banco List()
    + Getters and Setters
    + toString()
    + abrirConta
    + transferir
    + consultarSaldoDeConta
    + contasNegativas
    +
    */

    public String toString() {
        return "Banco " + this.nome;
    }

    public void abrirConta(String cpfTitular, String numConta, String numAgencia, double saldoInicial) {
        Conta c = new Conta(cpfTitular, numConta, numAgencia, saldoInicial);
        contas.add(c);
    }

    public void transferir(String numContaO, String numAgenciaO, String numContaD, String numAgenciaD, double valor) {
        Conta contaOrigem = null;
        Conta contaDestino = null;
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numContaO) && c.getNumeroAgencia().equals(numAgenciaO)) {
                contaOrigem = c;
            }
            if (c.getNumeroConta().equals(numContaD) && c.getNumeroAgencia().equals(numAgenciaD)) {
                contaDestino = c;
            }
        }

        if (contaOrigem == null || contaDestino == null){
            System.out.println("Conta não encontrada");
        }

        if (contaOrigem.getSaldo() < valor) {
            System.out.println("O saldo da conta é insuficiente para realizar a transferência.");
        }
        double newSaldoOrigem = contaOrigem.getSaldo()-valor;
        contaOrigem.setSaldo(newSaldoOrigem);
        double newSaldoDestino = contaDestino.getSaldo()+valor;
        contaDestino.setSaldo(newSaldoDestino);
        System.out.println("Tranferência realizada com sucesso.");
    }

    public double consultarSaldoDeConta(String numConta, String numAgencia) {
        Conta conta = null;
        for (Conta c : contas) {
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                conta = c;
                return conta.getSaldo();
            }
        }
        return 0;
    }
    public ArrayList<Conta> pesquisarContasComSaldoNegativo(){
        ArrayList<Conta> contasNegativas = new ArrayList<>();
        for (Conta c: this.contas){
            if (c.getSaldo() < 0){
                contasNegativas.add(c);
            }
        }
        return contasNegativas;
    }

    public double sacarDeConta(String numConta, String numAgencia, double valor){
        double saque = 0;
        for (Conta c: contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                    saque = c.getSaldo() - valor;
                    c.setSaldo(saque);
                }
        } return saque;
    }
    public double depositarEmConta(String numConta, String numAgencia, double valor){
        double deposito = 0;
        for (Conta c: contas){
            if (c.getNumeroConta().equals(numConta) && c.getNumeroAgencia().equals(numAgencia)){
                deposito = c.creditar(valor);
            }
        }
        return deposito;
    }
}