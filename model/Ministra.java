package model;

public class Ministra {
    private Professor professor;
    private Turma turma;
    
    public Ministra(Professor professor, Turma turma) {
        this.professor = professor;
        this.turma = turma;
    }
    
    public Professor getProfessor() {
        return professor;
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public Turma getTurma() {
        return turma;
    }
    
    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
