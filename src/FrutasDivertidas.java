
import java.util.ArrayList;
import java.util.List;

public class FrutasDivertidas {
	public static void main(String[] args) {
		/* Classe Randon() possibilita pegarmos 
		itens de uma lista de forma Aleatória  */
		List <Frutas> frutas = new ArrayList<>();
		frutas.add(new Frutas("Maçã"));
		frutas.add(new Frutas("melancia"));
		frutas.add(new Frutas("abacate"));
		frutas.add(new Frutas("laranja"));
		frutas.add(new Frutas("pitaya"));
		frutas.add(new Frutas("melão"));
		frutas.add(new Frutas("maracujá"));
		
		SorteadorDeFrutas sorteador = new SorteadorDeFrutas(frutas);
        Frutas frutaSorteada = sorteador.sortearFruta();
	      
	        System.out.println("  A fruta sorteada foi:" );
	        System.out.println("  "+ frutaSorteada.getFruta());
	}
}
