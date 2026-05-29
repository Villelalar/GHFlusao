package model;

public class Disciplina {
    private int id_disciplina;
    private String nome;
    private String codigo;
    private int cargaHoraria;
    
    public Disciplina(int id_disciplina, String nome, String codigo, int cargaHoraria) {
        this.id_disciplina = id_disciplina;
        this.nome = nome;
        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }
    
    public int getId_disciplina() {
        return id_disciplina;
    }
    
    public void setId_disciplina(int id_disciplina) {
        this.id_disciplina = id_disciplina;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    public void adicionarProfessor() {
        System.out.println("Professor adicionado à disciplina " + nome);
    }
    
    public void listarProfessores() {
        System.out.println("Listando professores da disciplina " + nome);
    }
    
    public void listarProvas() {
        System.out.println("Listando provas da disciplina " + nome);
    }
}
