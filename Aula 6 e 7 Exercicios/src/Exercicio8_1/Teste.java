package Exercicio8_1;

public class Teste {
	public static void main(String[] args) {
		
	NoticiarioAssina noticiario = new NoticiarioAssina();
	new Consumidor("Danilo", noticiario);
	noticiario.notificaNoticia("Uma nova noticia", 1, 2, "Topicos interessantes!");
	new Consumidor("Bonato", noticiario);
	noticiario.notificaNoticia("Uma noticia mais nova ainda", 2, 2, "Topico ruim");
	
	
	}
}
