package br.com.desafio_dio.main.application;

public class CadastroPessoal extends  Cadastro {

    private String cadastroNome;
    private String cadastroCpf;

    public String getCadastroNome() {
        return cadastroNome;
    }

    public void setCadastroNome(String cadastroNome) {
        this.cadastroNome = cadastroNome;
    }

    public String getCadastroCpf() {
        return cadastroCpf;
    }

    public void setCadastroCpf(String cadastroCpf) {
        this.cadastroCpf = cadastroCpf;
    }

    @Override
    public String verificaCadastro(String nome, String cpf) {
//        nome = null;
//        cpf  = null;
        if((nome != null) & (cpf != null)){
            this.setCadastroNome(nome);
            this.setCadastroCpf(cpf);
            return "Nome "+ getCadastroNome() + " "+ "número do cpf "+ getCadastroCpf();
        }
        return null;
    }
}
