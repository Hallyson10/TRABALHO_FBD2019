package entity;

public class Colaboradores extends Usuarios{
	private String curso;
	private int semestre;
	
	public Colaboradores(String nome,String email,int matricula,String curso,int semestre) {
		super(nome,email,matricula);
		this.setCurso(curso);
		this.semestre = semestre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getSemestre() {
		//Ao passar 6 meses, incrementa mais um.
		return semestre;
	}

}
