package br.com.fiap.model;

public class Conta {

    private String numero;
    private String agencia;
    private double saldo;
    private String cliente;

    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        }
        else {
            saldo = saldo - valor;
            return true;
        }
    }

    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    public boolean transferir(Conta destino, double valor) {
        if (valor > saldo) {
            return false;
        }
        saldo = saldo - valor;
        destino.depositar(valor);
        return true;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}
