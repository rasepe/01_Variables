
public class Fase3 {
	/*Partint de l�any 1948 heu de fer un bucle for i mostrar els anys de trasp�s fins arriba al vostre any de naixement. (0,75 punts)
	ATENCIO! Haureu de canviar el tipus de variable de l�any 1948 per poder modificar-la. 
	Creeu una variable bool que sera certa si l�any de naixement �s de trasp�s o falsa si no ho �s.(0,75 punts)
	En cas de que la variable bool sigui certa, heu de mostrar per consola una frase on ho digui, 
	en cas de ser falsa mostrareu la frase pertinent. Creeu dues variables string per guardar les frases. (1,5 punts)*/
	public static void main(String[] args) {
		int any;
		final int INTERVAL = 4;
		final int ANY_NAIXEMENT = 1976;
		boolean traspas = false;
		String fraseTrue = "�s un any de trasp�s";
		String fraseFalse = "no �s un any de trasp�s";
		for (any = 1948; any <= ANY_NAIXEMENT; any++) {
			if (any % INTERVAL == 0) {
				traspas = true;
				System.out.println(any + " " + fraseTrue);
			} else {
				traspas = false;
				System.out.println(any + " " + fraseFalse);
			}
		}
	}
}
