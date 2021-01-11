package ExD;

public class Aluno {

    private int numero;
    private String nome;
    private String curso;

    public Aluno(int numero, String nome, String curso){
        this.numero = numero;
        this.nome = nome;
        this.curso = curso;
    }

    public int getNumero() {return numero;}
    public String getNome() {return nome;}
    public String getCurso() {return curso;}

    public void setNumero(int newNumero) {
        this.numero = newNumero;
    }
    public void setNome(String newNome) {
        this.nome = newNome;
    }
    public void setCurso(String newCurso) {
        this.curso = newCurso;
    }
}
