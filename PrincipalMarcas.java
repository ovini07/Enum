package Enum;

public class PrincipalMarcas {

	public static void main(String[] args) {
		Marcas[] marcas = Marcas.values();

		System.out.println("Marcas de Roupas Disponíveis:");
		for (Marcas marca : marcas) {
			System.out.println(marca);

		}
	}
}
