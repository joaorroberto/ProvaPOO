package prova;

public class Jovem extends  EstadoPersonagem implements IEstadoPersonagem{

	@Override
	public void Andar(Personagem p) {
		System.out.println("O jovem de " + p.getIdade() + " anos de idade está andando");
		
	}

}
