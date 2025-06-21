package br.com.alura.Livro;

public class Livro {
    String titulo;
    boolean emprestado;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void emprestar() {
        emprestado = true;
    }

    public String status() {
        if (emprestado) {
            return "Indisponível";
        }
        return "Disponível";
    }
}

