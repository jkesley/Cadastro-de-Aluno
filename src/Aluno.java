import java.awt.Image;

public class Aluno {
    
    private String nome;
    private int matricula;
    private String turma;
    private Image foto;

    public Aluno(String nome, int matricula, String turma, Image foto) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
        this.foto = foto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }
}
    

