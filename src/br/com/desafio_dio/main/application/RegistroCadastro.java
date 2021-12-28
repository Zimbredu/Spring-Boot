package br.com.desafio_dio.main.application;

import java.util.ArrayList;
import java.util.List;

public class RegistroCadastro {

    public String registraCadastro(String cadastro) {
        while (cadastro != null) {
            List<String> registro = new ArrayList<>();
            registro.add(cadastro);
            return "{Usuário registrado " + registro + "}";

        }
        return "Registro não confirmado. ";
    }
}