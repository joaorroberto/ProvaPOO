package prova;

public class Crianca extends EstadoPersonagem implements IEstadoPersonagem{

	@Override
	public void Andar(Personagem p) {
		System.out.println("A criança de " + p.getIdade() + " anos de idade está andando");
	}

}
