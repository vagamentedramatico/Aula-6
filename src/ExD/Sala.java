package ExD;

public class Sala {

    private int capacidade;
    private String bloco;
    private int numSala;
    private Aluno[] listaAlunos;

    public Sala(int capacidade, String bloco, int numSala){
        this.capacidade = capacidade;
        this.bloco = bloco;
        this.numSala = numSala;
        listaAlunos = new Aluno[capacidade];
    }

    public void listarAlunos() {
        for(int i=0; i<listaAlunos.length; i++) {
            System.out.println(listaAlunos[i]);
        }
    }

    public void addAluno(Aluno aluno) {
        for(int i=0; i<listaAlunos.length; i++) {
            if(listaAlunos[i] == null){
                listaAlunos[i] = null;
                break;
            }
        }
    }

    public boolean removeAluno(int numero){
        for(int i=0; i<listaAlunos.length; i++) {
            if(listaAlunos[i].getNumero() == numero){
                listaAlunos[i] = null;
                return true;
            }
        }
        return false;
    }

    public int getCapacidade() {return capacidade;}
    public String getBloco() {return bloco;}
    public int getNumSala() {return numSala;}
    public Aluno[] getListaAlunos() {return listaAlunos;}



}


