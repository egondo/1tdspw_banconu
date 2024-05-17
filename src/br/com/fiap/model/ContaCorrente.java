package br.com.fiap.model;

public class ContaCorrente extends Conta {

    private double valorLimitePadrao = 3000;
    private double limite = valorLimitePadrao;

    public void depositar(double valor) {
        if (limite == valorLimitePadrao) {
            super.depositar(valor);
        }
        else {
            if (limite + valor <= valorLimitePadrao) {
                limite = limite + valor;
            }
            else {
                double diferenca = limite + valor - valorLimitePadrao;
                limite = valorLimitePadrao;
                super.depositar(diferenca);
            }
        }
    }

    public boolean sacar(double valor) {
        if (valor > this.getSaldo() + limite) {
            return false;
        }
        double diferenca = this.getSaldo() - valor;
        if (diferenca > 0) {
            this.setSaldo(diferenca);
        }
        else {
            this.setSaldo(0);
            limite = limite - diferenca;
        }
        return true;
    }
}
