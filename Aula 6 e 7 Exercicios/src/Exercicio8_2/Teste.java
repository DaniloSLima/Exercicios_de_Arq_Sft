package Exercicio8_2;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Danilo", noticiario);
	noticiario.notificaNoticia("Prova do ENEM sera dia 04/11", 1, 2, "Topico:Educação");
	new Consumidor("Bossini", noticiario);
	noticiario.notificaNoticia("Nova temporada de Vikings", 2, 2, "Topico:Entreterimento");
	
	
	}
}
