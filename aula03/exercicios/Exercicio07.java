package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double mediaAluno, mediaTurma, mediaGeral;
        final int NUMERO_ALUNOS = 2;
        final int NUMERO_TURMAS = 2;

        mediaGeral = 0;

        for(int turma = 1; turma <= NUMERO_TURMAS; turma++) {
            System.out.println("Turma: " + turma);
            mediaTurma = 0;

            for(int aluno = 1; aluno <= NUMERO_ALUNOS; aluno++) {
                System.out.print("Digite a média do aluno " + aluno + ": ");
                mediaAluno = entrada.nextDouble();
                mediaTurma = mediaTurma + mediaAluno;
            }

            mediaTurma = mediaTurma / NUMERO_ALUNOS;
            System.out.println("Média da turma: " + mediaTurma);

            mediaGeral = mediaGeral + mediaTurma;
        }

        mediaGeral = mediaGeral / NUMERO_TURMAS;
        System.out.println("A média das turmas é: " + mediaGeral);

        entrada.close();
    }
}
