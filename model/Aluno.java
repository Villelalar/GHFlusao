package model;

import java.util.Date;

public class Aluno {
    private int id_aluno;
    private String nome;
    private String cpf;
    private String matricula;
    private String telefone;
    private Date dataNascimento;
    
    public Aluno(int id_aluno, String nome, String cpf, String matricula, String telefone, Date dataNascimento) {
        this.id_aluno = id_aluno;
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }
    
    public int getId_aluno() {
        return id_aluno;
    }
    
    public void setId_aluno(int id_aluno) {
        this.id_aluno = id_aluno;
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
    
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public Date getDataNascimento() {
        return dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void cadastrarAluno() {
        System.out.println("Aluno " + nome + " cadastrado com sucesso!");
    }
    
    public void atualizarCadastro() {
        System.out.println("Cadastro do aluno " + nome + " atualizado!");
    }
    
    public void verificarSituacao() {
        System.out.println("Verificando situação do aluno " + nome);
    }
    
    public void obterHistorico() {
        System.out.println("Histórico do aluno " + nome);
    }
}
