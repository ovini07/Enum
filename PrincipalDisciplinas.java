package Enum;

public class PrincipalDisciplinas {

	public static void main(String[] args) {
		for(Disciplinas mat : Disciplinas.values()){
			System.out.println("-----------");
			System.out.println(mat);
		}
	}
}
