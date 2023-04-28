package br.com.luccabank.model;

import br.com.luccabank.pessoa.model.Pessoa;

public class Poupanca extends Conta {
    private String aniversario;


    public String getAniversario() {
        return aniversario;
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public Poupanca() {
    }

    public Poupanca(Agencia agencia, double saldo, Pessoa titular, String aniversario) {
        super(agencia, saldo, titular);
        this.aniversario = aniversario;
    }
}
