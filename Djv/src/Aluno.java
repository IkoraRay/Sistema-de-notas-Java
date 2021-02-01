import java.util.ArrayList;
import java.util.List;
public class Aluno {
	int i;
	String nome;
	static int RA;
	String senha;
	Curso curso;
	List<Disciplina> atuais = new ArrayList <Disciplina>();
	
	public Aluno(String nome, int RA, String senha, Curso curso) {
		this.nome = nome;
		this.RA = RA;
		this.senha = senha;
		this.curso = curso;
	}
	
	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	
	
	public void listarMatriculadas() {
		for (i = 0; i< atuais.size(); i++) {
			System.out.println(atuais.get(i).nome);
		}
	}
	
	public void addDisc(Disciplina nova) {
		atuais.add(nova);
	}
	
	
	public void remDisc(int retira) {
		atuais.remove(retira);
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
