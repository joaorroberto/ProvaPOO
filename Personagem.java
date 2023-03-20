package prova;

public class Personagem {
	
	private int idade;
	private IEstadoPersonagem estado;
	
	public Personagem(int idade) {
		this.setIdade(idade);
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
		if (idade <= 15) {
			this.estado = new Crianca();
		}
		else if(idade > 15 && idade <= 30) {
			this.estado = new Jovem();
		}
		else if(idade > 30) {
			this.estado = new Adulto();
		}
	}
	
	public void andar() {
		this.estado.Andar(this);
	}
	
	
}
