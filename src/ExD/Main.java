package ExD;

import ExD.Aluno;
import ExD.Sala;

public class Main {

    public static void main(String[] args) {
        Aluno primeiro = new Aluno(1, "João", "Turismo");
        Aluno segundo = new Aluno(2, "Filipe", "Turismo");
        Aluno terceiro = new Aluno(3, "Diogo", "Gestão");
        Aluno quarto = new Aluno(4, "Mafalfa", "Turismo");

        Sala tangerine = new Sala(3, "A", 13);

        tangerine.listarAlunos();

    }

    public static void printVector(int[] vet) {
        System.out.print(vet[0]);
        for(int i = 1; i < vet.length; i++){
            System.out.print("," + vet[i]);
        }
        System.out.println();
    }
}
