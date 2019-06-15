package entity;
import java.util.ArrayList;

public class Participantes {
	private String nome;
	private int matricula;
	private int semestre;
	private String curso;
	private String email;
	private int total_horas_complementares;
	private ArrayList<Celulas> celulas;
	
	public Participantes(String nome,String email, int matricula,int semestre, String curso) {
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
		this.semestre = semestre;
		this.curso = curso;
		this.total_horas_complementares = 0;
		this.celulas = new ArrayList<Celulas>();
	}

	@Override
	public String toString() {
		return "Participantes [nome=" + nome + ", semestre=" + semestre + ", curso=" + curso + ", email=" + email
				+ ", total_horas_complementares=" + total_horas_complementares + ", celulas=" + celulas + "]";
	}
	
}
