package br.com.jkalango.dto;

public class NovoJogador {
    private String nome;

    public NovoJogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean nomeContemJava() {
        return nome.toLowerCase().contains("java");
    }
}
