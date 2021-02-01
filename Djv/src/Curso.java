import java.util.ArrayList;
import java.util.List;

public class Curso {
	static String nome;
	static int codCurso;
	List<Disciplina> ementa = new ArrayList<Disciplina>();


	public Curso(String nome, int cod) {
		this.codCurso = cod;
		this.nome = nome;
	}
	

	
	public Curso() {}
	
	public void addDisc(Disciplina nova) {
		ementa.add(nova);
	}
	
	public void remDisc(int retira) {
		ementa.remove(retira);
	}



	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(int codCurso) {
		this.codCurso = codCurso;
	}
	
	public List<Disciplina> getEmenta() {
		return ementa;
	}

	public void setEmenta(List<Disciplina> ementa) {
		this.ementa = ementa;
	}

	
	
	
	
	

}
