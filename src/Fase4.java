
public class Fase4 {
	/*
	 * Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i
	 * un altre on juntareu la data de naixement separada per �/� (tot en una
	 * variable). Mostreu per consola les variables del nom complet, la data de
	 * naixement i si l�any de naixement es de trasp�s o no. Exemple de sortida per
	 * consola: El meu nom �s Juan Perez Gonzalez Vaig n�ixer el 01/01/1979 El meu
	 * any de naixement �s de trasp�s.
	 */
	public static void main(String[] args) {
		String nom = "Rafel";
		String cognom1 = "Serra";
		String cognom2 = "Perez";
		int dia = 1;
		int mes = 11;
		int any = 1976;
		
		String nomComplet = nom + " " + cognom1 + " " +cognom2;
		
		String diaCaracters;
		String mesCaracters;
		
		if (dia<10) {
			diaCaracters = "0" + String.valueOf(dia);
		} else {
			diaCaracters = String.valueOf(dia);
		}
		
		if (mes<10) {
			mesCaracters = "0" + String.valueOf(mes);
		} else {
			mesCaracters = String.valueOf(mes);
		}
		
		String dataCompleta = diaCaracters + "/" + mesCaracters + "/" + String.valueOf(any);
		
		String fraseTraspas = "";
		
		final int INTERVAL = 4;

		if (any % INTERVAL == 0) {
			fraseTraspas = "El meu any de naixement �s de trasp�s.";		
		} else {
			fraseTraspas = "El meu any de naixement no �s de trasp�s.";		
		}
		
		
		System.out.println("El meu nom �s " + nomComplet);
		System.out.println("Vaig n�ixer el " + dataCompleta);
		System.out.println(fraseTraspas);
			
	}
}
