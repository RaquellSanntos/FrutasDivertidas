import java.util.List;
import java.util.Random;

public class SorteadorDeFrutas {
	   private List<Frutas> frutas;

	    public SorteadorDeFrutas(List<Frutas> frutas) {
	        this.frutas = frutas;
	    }
	    public Frutas sortearFruta() {
	        Random random = new Random();
	        int frutaAleatorio = random
	        		.nextInt(frutas.size());
	        return frutas.get(frutaAleatorio);
	    }
}
