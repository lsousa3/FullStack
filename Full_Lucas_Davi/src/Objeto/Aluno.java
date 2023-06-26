package Objeto;
public class Aluno {
     //Atributos
private String nome, turma;
private int id, matricula;
private byte[] foto;
     //Construtor

    public Aluno() {
        this.nome = nome;
        this.turma = turma;
        this.foto = foto;
        this.matricula = matricula;
        this.id = id;
    }
    //Getter & Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

 
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    

}
