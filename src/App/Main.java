package App;

import Entites.Conta;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta(123,1000.00);
        boolean testeSenha = conta.setSenha(123,11);
        if (testeSenha==true) {
            conta.deposito(500);
            System.out.println("SALDO ALTUAL: " + conta.getSaldo());
            conta.sacar(1000);
            System.out.println();
            System.out.println("SALDO ALTUAL: " + conta.getSaldo());
        }

    }
}