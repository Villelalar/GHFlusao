package model;

import java.util.Date;

public class Turma {
    private int id_turma;
    private String turno;
    private Date hora_inicio;
    private Date hora_fim;
    
    public Turma(int id_turma, String turno, Date hora_inicio, Date hora_fim) {
        this.id_turma = id_turma;
        this.turno = turno;
        this.hora_inicio = hora_inicio;
        this.hora_fim = hora_fim;
    }
    
    public int getId_turma() {
        return id_turma;
    }
    
    public void setId_turma(int id_turma) {
        this.id_turma = id_turma;
    }
    
    public String getTurno() {
        return turno;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public Date getHora_inicio() {
        return hora_inicio;
    }
    
    public void setHora_inicio(Date hora_inicio) {
        this.hora_inicio = hora_inicio;
    }
    
    public Date getHora_fim() {
        return hora_fim;
    }
    
    public void setHora_fim(Date hora_fim) {
        this.hora_fim = hora_fim;
    }
    
    public void cadastrar() {
        System.out.println("Turma " + id_turma + " cadastrada!");
    }
    
    public void associarDisciplina() {
        System.out.println("Disciplina associada à turma " + id_turma);
    }
    
    public void consultarAlunos() {
        System.out.println("Consultando alunos da turma " + id_turma);
    }
    
    public void consultarProvas() {
        System.out.println("Consultando provas da turma " + id_turma);
    }
}
