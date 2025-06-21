package br.com.alura.questoes;

import br.com.alura.Livro.Livro;

public class VerificacaoEmprestimoLivro {
    public static void main(String[] args) {
        Livro l = new Livro();
        l.setTitulo("Java para Iniciantes");
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());
    }
}
