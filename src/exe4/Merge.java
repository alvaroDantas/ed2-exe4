package exe4;

/**
 *
 * @author DLT1CA
 */
public class Merge{
    public void mergeAscByMedia(Aluno[] alunos, int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAscByMedia(alunos, inicio, meio);
            mergeAscByMedia(alunos, meio + 1, fim);
            intercalaAscByMedia(alunos, inicio, fim, meio);
        }
    }
    public Aluno[] intercalaAscByMedia(Aluno[] alunos, int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Aluno[] aux = new Aluno[alunos.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (alunos[inicioVet1].getMedia()<= alunos[inicioVet2].getMedia()) {
                aux[indiceVetorAux] = alunos[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = alunos[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = alunos[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = alunos[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            alunos[i] = aux[i];
        }

        return aux;
    }
    
    public void mergeAscByNota1(Aluno[] alunos, int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAscByNota1(alunos, inicio, meio);
            mergeAscByNota1(alunos, meio + 1, fim);
            intercalaAscByNota1(alunos, inicio, fim, meio);
        }
    }
    public Aluno[] intercalaAscByNota1(Aluno[] alunos, int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Aluno[] aux = new Aluno[alunos.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (alunos[inicioVet1].getNota1()<= alunos[inicioVet2].getNota1()) {
                aux[indiceVetorAux] = alunos[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = alunos[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = alunos[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = alunos[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            alunos[i] = aux[i];
        }

        return aux;
    }
    
    public void mergeAscByNome(Aluno[] alunos, int inicio, int fim){
        int meio;
        if (inicio < fim) {
            meio = (inicio + fim) / 2;
            mergeAscByNome(alunos, inicio, meio);
            mergeAscByNome(alunos, meio + 1, fim);
            intercalaAscByNome(alunos, inicio, fim, meio);
        }
    }
    public Aluno[] intercalaAscByNome(Aluno[] alunos, int inicio, int fim, int meio) {
        int inicioVet1 = inicio, inicioVet2 = meio + 1, i;
        Aluno[] aux = new Aluno[alunos.length];
        int indiceVetorAux = inicio;

        while (inicioVet1 <= meio && inicioVet2 <= fim) {
            if (alunos[inicioVet1].getNome().compareTo(alunos[inicioVet2].getNome()) <=0) {
                aux[indiceVetorAux] = alunos[inicioVet1];
                inicioVet1++;
            } else {
                aux[indiceVetorAux] = alunos[inicioVet2];
                inicioVet2++;
            }
            indiceVetorAux++;
        }

        for (i = inicioVet1; i <= meio; i++) {
            aux[indiceVetorAux] = alunos[i];
            indiceVetorAux++;
        }

        for (i = inicioVet2; i <= fim; i++) {
            aux[indiceVetorAux] = alunos[i];
            indiceVetorAux++;
        }
        
        for (i = inicio; i <= fim; i++) {
            alunos[i] = aux[i];
        }

        return aux;
    }
}
