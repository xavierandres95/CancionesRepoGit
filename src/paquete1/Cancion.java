package paquete1;
/**
 * Clase Cancion
 * @author Xavier Andres
 *@version 2021
 */
public class Cancion {

	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores
/**constructor cancion que no tiene parametros establecidos
 * 
 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
/**
 * Constructor que crea una cancion con duracion establecido
 * @param titulo
 * @param duracion
 */
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
/**
 * constructor que crea una cancion que tiene una duracion y puede estar sonando o no.
 * @param titulo
 * @param grupo
 * @param duracion
 * @param sonando
 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}

	/**Metodo reproducirCancion
	 * Metodo booleano que permite ver si el booleano sonando es true se reproduzca.
	 * @return
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
/**Metodo pararCancion metodo que te devuelve el booleando sonando si es false
 * 
 * @return
 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	/**
	 * Getter que devuelve el objeto titulo
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	/**MismaCancion
	 * Método booleano que permite obtener si el tituto y el grupo es igual lo devuelve "false"
	 * @param cancion
	 * @return
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	/**
	 * MayorDuracion
	 * El método utiliza la lectura del String Cancion y si el valor de i es el mayor se imprime en el titulo
	 * @param canciones
	 * @return
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
/**Metodo Siguiente cancion despues de contar las posiciones del array canciones se añade una posicion mas al array por lo que determina el titulo de la cancion siguiente.
 * 
 * @param canciones
 * @param titulo
 * @return
 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Datos de la cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}	
	
	
}
