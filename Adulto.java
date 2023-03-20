package prova;

public class Adulto extends EstadoPersonagem implements IEstadoPersonagem{

	@Override
	public void Andar(Personagem p) {
		System.out.println("A adulto de " + p.getIdade() + " anos de idade está andando");
		
	}

}
