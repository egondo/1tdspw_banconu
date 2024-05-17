package br.com.fiap.model;

public class ContaPoupanca extends Conta {

    public void rendimento(double percentual) {
        double novoSaldo = this.getSaldo() * (1 + percentual);
        this.setSaldo(novoSaldo);
    }

}
