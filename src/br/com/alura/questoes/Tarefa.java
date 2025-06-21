package br.com.alura.questoes;

public class Tarefa {
    public static void main(String[] args) {
        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7) {
            System.out.println("br.com.alura.questoes.Tarefa crítica");
        } else if(prioridade > 3 || urgencia > 7) {
            System.out.println("br.com.alura.questoes.Tarefa importante");
        } else {
            System.out.println("br.com.alura.questoes.Tarefa comum");
        }
    }
}
