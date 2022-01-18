/**
 *  
 * @author Eloy, Isabel, Víctor
 *
 */
public class peliculas {           //valores     
	protected String titulo;     
	protected double duracion;     
	protected String director;          
	//Constructor con parametros     
	public peliculas(String titulo, double duracion, String director) {
		super();         
		this.titulo = titulo;         
		this.duracion = duracion;         
		this.director = director;     
		}      
	public String toString() {         
		return "peliculas [titulo=" + titulo + ", duracion=" + duracion + ", director=" + director + "]";    
		}               
	}