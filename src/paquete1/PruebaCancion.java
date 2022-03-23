package paquete1;

/**Clase Principal PruebaCancion donde estan creados los objetos cancion y los metodo de reproduccion.
 * 
 * @author Xavier Andres
 *@see Cancion#MismaCancion(Cancion)
 */
public class PruebaCancion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("Show must go on","Freddy Mercury",300,false);
		Cancion quintaCancion = new Cancion("Somewhere only we know","Keane",310,false);
		
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

/**
 * Metodo Mostrar siguiente cancion: Muestra la cancion en la posicion siguiente de array Canciones
 * @param miCancion
 * @param canciones
 * @see Cancion#SiguienteCancion(Cancion[], String)
 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

/** Metodo mostrar cancion mas larga imprimiendo el metodo mayorduracion de la clase cancion.
 * 
 * @param canciones
 * @see Cancion#MayorDuracion(Cancion[])
 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}

/** Metodo mostrar cancion y autor: muestra una lista con todas canciones y sus respectivos autores.
 * 
 * @param canciones
 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}	
		
		
	}

}
