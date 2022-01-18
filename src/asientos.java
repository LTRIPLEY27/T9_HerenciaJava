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
			String silla=String.valueOf(x);
			for (int j=0;j<asiento.length+1;j++) {
				y++;
				char sillaNum= (char)y;
				String sillaString=String.valueOf(sillaNum);
				asiento[i][j]=silla;
				System.out.print(asiento[i][j]+" ");
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
