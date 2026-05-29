package controller;
import model.*;
import java.util.Date;

public class CtrlPrograma {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA ACADEMICO ===\n");
        
        // Criando alunos
        Aluno aluno1 = new Aluno(1, "Joao Silva", "123.456.789-00", "2024001", "(11) 98765-4321", new Date());
        Aluno aluno2 = new Aluno(2, "Maria Santos", "987.654.321-00", "2024002", "(11) 91234-5678", new Date());
        
        aluno1.cadastrarAluno();
        aluno2.cadastrarAluno();
        aluno1.verificarSituacao();
        aluno1.obterHistorico();
        
        // Criando professores
        Professor prof1 = new Professor(1, "Dr. Carlos", "111.222.333-44", "Engenharia de Software", "carlos@email.com");
        Professor prof2 = new Professor(2, "Dra. Ana", "555.666.777-88", "Banco de Dados", "ana@email.com");
        
        prof1.registrar();
        prof2.registrar();
        prof1.associarTurma();
        prof1.listarDisciplinas();
        
        // Criando disciplinas
        Disciplina disc1 = new Disciplina(1, "Programacao Java", "POO001", 80);
        Disciplina disc2 = new Disciplina(2, "Banco de Dados", "BD001", 60);
        
        System.out.println("Disciplina: " + disc1.getNome() + " - Codigo: " + disc1.getCodigo());
        disc1.adicionarProfessor();
        disc1.listarProvas();
        
        // Criando turmas
        Turma turma1 = new Turma(1, "Manha", new Date(), new Date());
        Turma turma2 = new Turma(2, "Noite", new Date(), new Date());
        
        turma1.cadastrar();
        turma2.cadastrar();
        turma1.associarDisciplina();
        turma1.consultarAlunos();
        
        // Criando cursos
        Curso curso1 = new Curso(1, 2024, 1);
        System.out.println("Curso: " + curso1.getId_curso() + " - Ano: " + curso1.getAno());
        curso1.matricular();
        
        // Criando provas
        Prova prova1 = new Prova(1, "Prova de POO", new Date());
        prova1.registrar();
        prova1.associarTurma();
        prova1.exibirNotasTurma();
        
        // Criando notas
        Realiza nota1 = new Realiza(8.5f, new Date(), "Aprovado");
        Realiza nota2 = new Realiza(9.0f, new Date(), "Aprovado");
        
        nota1.registrarNota();
        nota1.consultarNota();
        nota2.registrarNota();
        nota2.consultarNota();
        
        // Associacao Professor-Turma
        Ministra ministra1 = new Ministra(prof1, turma1);
        System.out.println("Professor " + ministra1.getProfessor().getNome() + " ministra na turma " + ministra1.getTurma().getId_turma());
        
        System.out.println("\n=== FIM ===");
    }
}
