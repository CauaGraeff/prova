package br.com.alura.questoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TarefaComparable implements  Comparable<TarefaComparable> {
    String titulo;

    public TarefaComparable(String titulo) {
        this.titulo = titulo;
    }

    public int compareTo(TarefaComparable outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    // O toString foi adicionado por causa que quando eu queria ver a lista com
    // o sout, dava dando erro, aí com o toString aparece apenas o tiulo na lista
    // sem o erro
    @Override
    public String toString() {
        return titulo;
    }

    public static void main(String[] args) {
        List<TarefaComparable> tarefas = new ArrayList<>();
        tarefas.add(new TarefaComparable("Estudar"));
        tarefas.add(new TarefaComparable("Almoçar"));
        tarefas.add(new TarefaComparable("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);
    }
}
