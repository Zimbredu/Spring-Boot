package br.com.desafio_dio.main;

import br.com.desafio_dio.main.application.CadastroPessoal;
import br.com.desafio_dio.main.application.RegistroCadastro;
import br.com.desafio_dio.main.store.Imprime;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CadastroPessoal id = new CadastroPessoal();
        RegistroCadastro cadastro = new RegistroCadastro();
        Imprime imprimeCadastro = new Imprime();


        String s = "N";
        String resposta = " ";

        while (true) {
            if (s.equals(resposta)) {
                System.out.println(imprimeCadastro);
                break;
            }
            System.out.println("Digite nome e cpf");
            String confere = id.verificaCadastro(teclado.next(), teclado.next());

            if (confere != null) {
                System.out.println("Usuário cadastrado com sucesso. ");
            } else {
                System.out.println("Usuário não cadastrado. ");
            }

            System.out.println("Quer continuar cadastrando usu?rio? Y/N");
            resposta = teclado.next().toUpperCase();

            String confirmaRegistro = cadastro.registraCadastro(confere);
            imprimeCadastro.imprimeCadastro(confirmaRegistro);
        }
        teclado.close();


    }
}