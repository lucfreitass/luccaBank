package br.com.luccabank.model;

import br.com.luccabank.pessoa.model.Pessoa;

public class Corrente extends Conta{

    private double limite;


    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Corrente() {
    }

    public Corrente(Agencia agencia, double saldo, Pessoa titular, double limite) {
        super(agencia, saldo, titular);
        this.limite = limite;
    }
}
