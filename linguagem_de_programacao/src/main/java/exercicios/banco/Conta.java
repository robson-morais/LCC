package exercicios.banco;

public class Conta {

    private String cpfTitular;
    private String numeroConta;
    private String numeroAgencia;
    private double saldo;

    public Conta (String cpfTitular, String numeroConta, String numeroAgencia, double saldo){
        this.cpfTitular = cpfTitular;
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.saldo = saldo;
    }

    public Conta (){
        this("","","",0.0);
    }

    public String getCpfTitular(){
        return cpfTitular;
    }

    public void setCpfTitular(String newCpf){
        this.cpfTitular = newCpf;
    }

    public String getNumeroConta (){
        return this.numeroConta;
    }

    public void setNumeroConta(String newNumeroConta){
        this.numeroConta = newNumeroConta;
    }

    public String getNumeroAgencia(){
        return this.numeroAgencia;
    }

    public void setNumeroAgencia(String newNumeroAgencia){
        this.numeroAgencia = newNumeroAgencia;
    }
    
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double newSaldo){
        this.saldo = newSaldo;
    }

    public double creditar(double valor){
        this.saldo += valor;
        return saldo;
    }

    public double debitar(double valor){
        this.saldo -= valor;
        return this.saldo;
    }

    public String toString(){
        return "\n===============\n \nDADOS DA CONTA:\n \nNúmero da conta: "+this.numeroConta+"\nAgência: "
        +this.numeroAgencia+"\nSaldo atual: "+this.saldo+"\n \n===============\n";
    }

    public String toSting(){
        return "Conta número "+this.numeroConta+" do cliente de CPF "+this.cpfTitular;
    }

}