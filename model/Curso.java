package model;

public class Curso {
    private int id_curso;
    private int ano;
    private int semestre;
    
    public Curso(int id_curso, int ano, int semestre) {
        this.id_curso = id_curso;
        this.ano = ano;
        this.semestre = semestre;
    }
    
    public int getId_curso() {
        return id_curso;
    }
    
    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }
    
    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getSemestre() {
        return semestre;
    }
    
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void matricular() {
        System.out.println("Matrícula realizada no curso " + id_curso);
    }
}
