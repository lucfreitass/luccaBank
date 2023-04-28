package br.com.luccabank.model;

import br.com.luccabank.pessoa.model.Pessoa;

public abstract class Conta {

    private Agencia agencia;

    private double saldo;

    private Pessoa titular;

    public Conta() {
    }

    public Conta(Agencia agencia, double saldo, Pessoa titular) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.titular = titular;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }
}
