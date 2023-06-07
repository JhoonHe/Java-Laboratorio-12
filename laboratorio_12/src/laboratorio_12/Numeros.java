package laboratorio_12;

import javax.swing.JOptionPane;

class Numeros {

	// Declaramos las variables con alcance global.
	int numer;
	int i, neg = 0, par = 0;
	
	public void entrada() {
		
		// Creamos un ciclo que itere hasta 5 veces
		for (i = 0 ; i < 5 ; i++) {
			// Pedimos el número por iteración por medio del método ingresarDatos, este nos retorna el valor y se almacena
			// directamente en la varibale
			numer = ingresarDatos("Digite 1 numero");
			
			// Comprobamos si el número es par o negativo
			if (numer % 2 == 0) {
				par++;
			}
			if (numer < 0) {
				neg++;
			}
		}
		JOptionPane.showMessageDialog(null, "el numero de numeros pares es: "+par+"\n"+" y el numero de numeros negativos es: "+neg);
	}

	
	public static int ingresarDatos(String mensaje) {
		
		// Declaramos las variables a nivel local
		String cadena;
		int valor;
		
		// Pedimos los datos
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Integer.parseInt(cadena);
		
		// Retornamos el valor
		return valor;
	}
}
