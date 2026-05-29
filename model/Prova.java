package model;

import java.util.Date;

public class Prova {
    private int id_prova;
    private String descricao;
    private Date horario_fim;
    
    public Prova(int id_prova, String descricao, Date horario_fim) {
        this.id_prova = id_prova;
        this.descricao = descricao;
        this.horario_fim = horario_fim;
    }
    
    public int getId_prova() {
        return id_prova;
    }
    
    public void setId_prova(int id_prova) {
        this.id_prova = id_prova;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public Date getHorario_fim() {
        return horario_fim;
    }
    
    public void setHorario_fim(Date horario_fim) {
        this.horario_fim = horario_fim;
    }
    
    public void registrar() {
        System.out.println("Prova " + id_prova + " registrada!");
    }
    
    public void associarTurma() {
        System.out.println("Turma associada à prova " + id_prova);
    }
    
    public void exibirNotasTurma() {
        System.out.println("Exibindo notas da turma para prova " + id_prova);
    }
}
