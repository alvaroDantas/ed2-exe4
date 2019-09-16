package exe4;

import java.util.Scanner;

/**
 *
 * @author DLT1CA
 */
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private boolean aprovado;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1 * 2;
        this.nota2 = nota2 * 3;
        this.media = (this.nota1 + this.nota2) / 5;
        aprovado = false;
        if (this.media >= 7) {
            aprovado = true;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1/2;
    }

    public double getNota2() {
        return nota2/3;
    }

    public double getMedia() {
        return media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    

}
