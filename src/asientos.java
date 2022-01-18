/**
 * 
 * @author Eloy, Isabel, Victor
 *
 */
public class asientos {
	protected String[][] asiento;
	public asientos() {
		this.asiento=asiento;
		this.asiento = new String [8][9];
	}
	
	public static void recorridoAsientos(String asiento[][]) {
		int x = 9;
		int y = 64;
		for(int i=0;i<asiento.length;i++) {
			x--;
			//Vovlemos a devolver 64 (A en ASCII) para que a la siguiente fila empiece por A
			y = 64;
			//Convertimos la variable x en string para insertarlo en el array
			String silla=String.valueOf(x);
				for (int j=0;j<asiento.length+1;j++) {
					//Vamos sumando la y + 1 para cambiar de letras
					y++;
					//Convertimos el numero en char para ver la letra en ASCII
					char sillaNum= (char)y;
					//Convertimos char a string para aplicarlo al array
					String sillaString=String.valueOf(sillaNum);
					//Asignamos el numero del asiento, empezara por 8, acabara en 1
					asiento[i][j]=silla;
					System.out.print(asiento[i][j]+" ");
					//Asignamos la letra en la posicion exacta de la silla, empieza por A, acaba en I
					asiento[i][j]= sillaString;
					System.out.print(asiento[i][j]+" ");
				}
			System.out.println("\n");
		}
	}
	
	public static boolean asientosCogidos(String asiento[][]) {
		boolean asd = true;
		return asd;
	}
	
}
