
public class Fase2 {
	

	
	
	public static void main(String[] args) {
		/*Sabent que l’any 1948 es un any de traspàs:
● Creeu una constant amb el valor de l’any (1948).
● Creeu una variable que guardi cada quan hi ha un any de traspàs.
● Calculeu quants anys de traspàs hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
resultant en una variable.
● Mostreu per pantalla el resultat del càlcul.*/
		
		final int ANY = 1948;
		int interval = 4;
		int numAnys = (1976 - ANY) / interval ;
		
		System.out.println(numAnys);
		
		
    }
}