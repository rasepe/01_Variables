
public class Fase1 {
	public static void main(String[] args) {
		/*Crea tres variables string e inicialitzales amb les dades pertinents (nom, cognom1, cognom2).
		Crea tres variables int e inicialitzales amb les dades pertinents (dia, mes, any).
		Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
		Mostra per pantalla les variables int concatenant-les amb “/” entre cada una d’elles.*/
		
		String nom = "Rafel";
		String cognom1 = "Serra";
		String cognom2 = "Perez";
		int dia = 1;
		int mes = 11;
		int any = 1976;
		
		System.out.println(cognom1 + " " + cognom2 + ", " + nom);
		System.out.println(dia + "/" + mes + "/" + any);
		
    }
}
