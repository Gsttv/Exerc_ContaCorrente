package Entites;

public class Conta {

    private int senha;
    private double saldo;

    public Conta(int senha, double valor) {
        this.senha = senha;
        this.saldo = deposito(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public boolean setSenha(int senha,int usuario) {
        if (usuario==10) {
            this.senha = senha;
            return true;
        }else {
            System.out.println("Usuario invalido");
            return false;
        }
    }

    public double sacar(double valor){
        return this.saldo -= valor;
    }
    public double deposito(double valor){
        return this.saldo += valor;
    }
}
