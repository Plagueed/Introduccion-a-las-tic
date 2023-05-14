/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CONTEO.java."

import java.io.*;

public class conteo {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int num;
		double resultado;
		System.out.println("Digite un numero natural");
		num = Integer.parseInt(bufEntrada.readLine());
		if (num<10) {
			resultado = 10-num;
			System.out.println("A tu numero le falta"+resultado+"para ser de 2 cifras");
		} else {
			resultado = 100-num;
			System.out.println("A tu numero le falta"+resultado+"para ser de 3 cifras");
		}
	}


}

