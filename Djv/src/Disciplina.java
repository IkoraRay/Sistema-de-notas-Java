
public class Disciplina {
	String nome;
	static int disCode;
	int cargaHoraria;
	
	
	
	public Disciplina(String nome,int cod,  int cargaHoraria) {
		
		this.nome = nome;
		this.disCode = cod;
		this.cargaHoraria = cargaHoraria;
	}



	public Disciplina() {
		super();
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public static int getDisCode() {
		return disCode;
	}



	public static void setDisCode(int disCode) {
		Disciplina.disCode = disCode;
	}



	public int getCargaHoraria() {
		return cargaHoraria;
	}



	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	

}
