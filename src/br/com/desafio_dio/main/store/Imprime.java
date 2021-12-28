package br.com.desafio_dio.main.store;

public class Imprime {

    String imprime;

    public String imprimeCadastro(String imprimeCadastro) {

        return this.imprime = imprimeCadastro;

    }

    @Override
    public String toString() {
        StringBuffer armazenaCadastro = new StringBuffer();
        armazenaCadastro.append(imprime);
        return armazenaCadastro.toString();
    }
}
