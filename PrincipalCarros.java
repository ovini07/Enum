package Enum;

public class PrincipalCarros {

	public static void main(String[] args) {
		 Carros[] marcas = Carros.values();
	        
	        System.out.println("Marcas de Carros Disponíveis:");
	        for (Carros marca : marcas) {
	            System.out.println(marca);
	        }
	}

}
