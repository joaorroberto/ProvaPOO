package prova;

public class Principal {

	public static void main(String[] args) {
		Personagem manoel = new Personagem(7);
		manoel.andar();
		manoel.setIdade(18);
		manoel.andar();
		manoel.setIdade(33);
		manoel.andar();
		manoel.setIdade(12);
		manoel.andar();

	}

}


 /*1 -  O comportamento mudou no momento de andar quando alteramos a idade. Respeitou as condiçõesfeitas na classe Personagem.*/
 /*2- Ele andou de formas diferentes. Num momento andou como criança, noutro como jovem e, por fim, como adulto.*/
 /* 3 - Foi utilizado o polimorfismo. A forma de andar mudou porque tem formas diferentes declaradas em suas classes.*/
 