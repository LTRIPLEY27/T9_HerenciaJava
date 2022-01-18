public class espectador {      
	//valores          
	protected String nombre;     
	protected double edad;     
	protected double dinero;          
	//Constructor con parametros     
	public espectador(String nombre, double edad, double dinero) {
		super();         
		this.nombre = nombre;         
		this.edad = edad;         
		this.dinero = dinero;     
		}      
	public String toString() {         
		return "espectador [nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + "]";    
		}                     
}