package model;

import java.util.Date;

public class Realiza {
    private float nota;
    private Date dataRealizacao;
    private String status;
    
    public Realiza(float nota, Date dataRealizacao, String status) {
        this.nota = nota;
        this.dataRealizacao = dataRealizacao;
        this.status = status;
    }
    
    public float getNota() {
        return nota;
    }
    
    public void setNota(float nota) {
        this.nota = nota;
    }
    
    public Date getDataRealizacao() {
        return dataRealizacao;
    }
    
    public void setDataRealizacao(Date dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public void registrarNota() {
        System.out.println("Nota " + nota + " registrada!");
    }
    
    public void consultarNota() {
        System.out.println("Nota: " + nota + " - Status: " + status);
    }
    
    public void atualizarStatus() {
        System.out.println("Status atualizado para: " + status);
    }
}
