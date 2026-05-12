import java.util.ArrayList;
import java.util.List;

public class TestSanduiche {
	public static void main(String args[]) {
		// instancia um sanduiche de 5 reais
		Sanduiche simples = new Sanduiche("Simples",5.00);
		simples.addIngrediente("Presunto");
		simples.addIngrediente("Queijo");
		simples.addIngrediente("Ovo");
		simples.setVegetariano(false);
		simples.printSanduiche(0);
		
		// instancia um sanduiche com o construtor completo
		Sanduiche bmt = new Sanduiche("BMT",new ArrayList<>(List.of("Salame","Calabresa","Presunto","Queijo","Alface","Tomate")),12.00,245.8,false);
		bmt.setPaoIntegral(true);
		bmt.removeIngrediente("Queijo");
		bmt.printSanduiche(5);
	}
}
