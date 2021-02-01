import java.util.ArrayList;
import java.util.List;
public class Professor {
	int i;
	String nome;
	static int RP;
	String senha;
	List<Disciplina> ministradas = new ArrayList <Disciplina>();
	
	
	public Professor(String nome, int cod, String senha) {
		this.nome = nome;
		this.RP = cod;
		this.senha = senha;
		
	}
	
	
	public Professor() {
		// TODO Auto-generated constructor stub
	}


	
	
	public void listarMinistradas() {
		
		for(i = 0; i< ministradas.size(); i++)
			System.out.println(ministradas.get(i).nome);
	}
	
	public void addDisciplina(Disciplina nova) {
		ministradas.add(nova);
	}
	
	public void remDisciplina(int retira) {
		ministradas.remove(retira);
	}
	
	
	
	
	
	
	
	


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRP() {
		return RP;
	}
	public void setRP(int rP) {
		RP = rP;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public List<Disciplina> getMinistradas() {
		return ministradas;
	}
	public void setMinistradas(List<Disciplina> ministradas) {
		this.ministradas = ministradas;
	}
	
	
	
	

}
