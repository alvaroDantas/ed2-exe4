package exe4;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Main {

    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[8];
        Merge merge = new Merge();

        alunos = lerAlunos(alunos);

        System.out.println("Alunos listados pela média ponderada");
        merge.mergeAscByMedia(alunos, 0, alunos.length - 1);
        listarAlunos(alunos);

        System.out.println(System.getProperty("line.separator"));

        System.out.println("Alunos listados pela N1");
        merge.mergeAscByNota1(alunos, 0, alunos.length - 1);
        listarAlunos(alunos);

        System.out.println(System.getProperty("line.separator"));

        System.out.println("Alunos listados em ordem alfabética");
        merge.mergeAscByNome(alunos, 0, alunos.length - 1);
        listarAlunos(alunos);
        
        System.out.println(System.getProperty("line.separator"));

        System.out.println("Alunos REPROVADOS listados em ordem alfabética");
        merge.mergeAscByNome(alunos, 0, alunos.length - 1);
        listarAlunosReprovados(alunos);

    }

    public static Aluno[] lerAlunos(Aluno[] alunos) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double n1 = 0, n2 = 0;
        for (int i = 0; i < alunos.length; i++) {
            System.out.println((i + 1) + "ºaluno");
            Aluno aux;

            System.out.println("Nome: ");
            nome = scanner.next();
            System.out.println("Nota 1: ");
            n1 = scanner.nextDouble();
            System.out.println("Nota 2: ");
            n2 = scanner.nextDouble();
            System.out.println(System.getProperty("line.separator"));

            aux = new Aluno(nome, n1, n2);
            alunos[i] = aux;
        }

        return alunos;
    }

    public static void listarAlunos(Aluno[] alunos) {
        String situacao = "";
        for (Aluno a : alunos) {
            System.out.println(System.getProperty("line.separator"));
            situacao = a.isAprovado() ? "Aprovado" : "Reprovado";
            System.out.print(a.getNome() + ", N1: " + a.getNota1() + ", N2: " + a.getNota2() + ", Média: " + a.getMedia() + ", "
                    + "Situação: " + situacao);
            System.out.println(System.getProperty("line.separator"));
        }
    }

    public static void listarAlunosReprovados(Aluno[] alunos) {
        String situacao = "";
        for (Aluno a : alunos) {
            if (!a.isAprovado()) {
                System.out.println(System.getProperty("line.separator"));
                situacao = a.isAprovado() ? "Aprovado" : "Reprovado";
                System.out.print(a.getNome() + ", N1: " + a.getNota1() + ", N2: " + a.getNota2() + ", Média: " + a.getMedia() + ", "
                        + "Situação: " + situacao);
                System.out.println(System.getProperty("line.separator"));
            }
        }
    }

}
