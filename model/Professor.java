package model;

public class Professor {
    private int id_professor;
    private String nome;
    private String cpf;
    private String especializacao;
    private String email;
    
    public Professor(int id_professor, String nome, String cpf, String especializacao, String email) {
        this.id_professor = id_professor;
        this.nome = nome;
        this.cpf = cpf;
        this.especializacao = especializacao;
        this.email = email;
    }
    
    public int getId_professor() {
        return id_professor;
    }
    
    public void setId_professor(int id_professor) {
        this.id_professor = id_professor;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getEspecializacao() {
        return especializacao;
    }
    
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void registrar() {
        System.out.println("Professor " + nome + " registrado!");
    }
    
    public void associarTurma() {
        System.out.println("Turma associada ao professor " + nome);
    }
    
    public void listarDisciplinas() {
        System.out.println("Listando disciplinas do professor " + nome);
    }
    
    public void adicionarDisciplina() {
        System.out.println("Disciplina adicionada ao professor " + nome);
    }
}
