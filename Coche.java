package anidadoCoche;

import java.util.Arrays;
import java.util.Scanner;

public class Coche {

	private String matricula;
	private String marca;
	private float velocidadMaxima;
	private float potencia;

	/**
	 * Esta línea indica que cada vez que se crea un nuevo objeto Coche, también se
	 * crea una nueva instancia de PartesCoche, que está asociada a ese objeto Coche.
	 * PartesCoche es un componente del objeto Coche que encapsula la información
	 * sobre las partes internas del coche.
	 * 
	 */

	private PartesCoche partesCoche;

	public Coche() {

	}

	public void ingresarDatosCoche() {
		/**
		 * Inicializamos el Objeto Scanner al que tendrán acceso las clases inernas a la
		 * hora de introducir los datos por parámetro en sus respectivos métodos de
		 * inserción de datos.
		 */

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Ingrese la  matrícula del coche. ");
		this.matricula = keyboard.nextLine();

		System.out.println("Introduzca la marca del coche. ");
		this.marca = keyboard.nextLine();

		System.out.println("Introduzca la velocidad máxima del coche. ");
		this.velocidadMaxima = Float.parseFloat(keyboard.nextLine());
		System.out.println();

		System.out.println("Introduzca la potencia del coche. ");
		this.potencia = Float.parseFloat(keyboard.nextLine());

		/**
		 * Creación de una instancia de la clase interna PartesCoche
		 */
		this.partesCoche = new PartesCoche();
		/**
		 * Invocación del método con la instancia/Objeto partesCoche creado de la clase PartesCoche  
		 *  para ingresar datos de las partes del coche desde la consola.
		 */
		this.partesCoche.ingresarDatosPartesCoche(keyboard);

	}

	/**
	 * Metodo toString para representar el Objeto en forma de cadena.
	 */
	@Override
	public String toString() {

		return "Coche. '\''" + " Matricula = " + matricula + "'\''" + " Marca = " + marca + "'\''" + " Potencia = "
				+ potencia + "'\''" + " VelocidadMaxima = " + velocidadMaxima + "'\''" + "	PartesCoche = "
				+ partesCoche + "'\''";

	}

	class PartesCoche {

		/**
		 * Estas declaraciones DE ATRIBUTOS establecen las relaciones de composición
		 * entre la clase PartesCoche y las clases Chasis y Rueda. Cada instancia de
		 * PartesCoche puede tener un chasis y un conjunto de ruedas, y estas partes
		 * están  encapsuladas dentro del objeto partesCoche creado en la Clase Coche.
		 * 
		 */

		/**
		 *  Declaración del atributo chasis como instancia de la clase Chasis.
		 *  private Chasis chasis;: Esta línea declara un atributo llamado chasis de tipo Chasis. 
		 *  Esto significa que cada instancia de la clase PartesCoche tiene una referencia a un objeto 
		 *  de la clase Chasis. La relación entre PartesCoche y Chasis se establece de manera que 
		 *  PartesCoche tiene un componente llamado chasis, que es una instancia específica de 
		 *  la clase Chasis. Esta relación de composición implica que la existencia y 
		 *  el ciclo de vida de chasis están vinculados al objeto que contiene esta instancia de PartesCoche. 
		 */
		private Chasis chasis;
		
		// Declaración del atributo ruedas como un arreglo de instancias de la clase Rueda.
		
		
		private Rueda[] ruedas;
	
		
		// Constructor vacío de la clase PartesCoche.
		public PartesCoche() {

		}
		
		/**
		 * Método para ingresar datos de las partes del coche desde la consola, se le indica que será así
		 * por parámetros, dentro de paréntesis.
		 * El Objeto Scanner ha sido inicializado anteriormente, de ahí que funcione sin hacerlo aquí.
		 * @param keyboard
		 */

		public void ingresarDatosPartesCoche(Scanner keyboard) {

			/**
			 * Creamos Chasis
			 * Creación de una instancia/Objeto  de la clase Chasis
			 */
			
			this.chasis = new Chasis();
			
			// Invocación del método para ingresar datos del chasis desde la consola
			chasis.ingresarDatosChasis(keyboard);

			/**
			 * Crear Ruedas.
			 * Creación de un arreglo de 4 instancias de la clase Rueda
			 * Esto garantiza que el array esté listo para ser utilizado y que sus elementos no sean null.
			 * De hecho sin crearlo en este punto, me dió este pronblema y me lo daba como null.
			 */
			
			this.ruedas = new Rueda[4];
			
			// Bucle para ingresar datos de cada rueda

			for (int i = 0; i < 4; i++) {
				
				// Creación de una instancia de la clase Rueda, mientras el número de posición i sea inferior
				// a 4, se creará un Objeto/instancia de la clase Rueda conteniendo todos los atributos que
				// incluye el método que construye cada Objeto Rueda, no lo hace el constructor en este caso,
				// lo conforma el método ingresarDatosRueda.
				this.ruedas[i] = new Rueda();
				
				System.out.println("Rueda Nº. " + (i + 1));
				
				// Invocación del método para ingresar datos de la rueda desde la consola

				this.ruedas[i].ingresarDatosRuedas(keyboard);

			}
		}

		@Override
		public String toString() {
			return " Chasis = " + chasis + " Ruedas = " + Arrays.toString(ruedas) + "\n";
		}

	}

	class Rueda {

		private float medida;
		private String tipo;
		private String marca;
		private String modelo;

		public Rueda() {

		}

		public void ingresarDatosRuedas(Scanner keyboard) {

			System.out.println("Introduzca la medida de la rueda. ");
			this.medida = Float.parseFloat(keyboard.nextLine());
			System.out.println("Introduzca el tipo de rueda, lluvia o seco. ");
			this.tipo = keyboard.nextLine();
			System.out.println("Introduce el modelo de la rueda . ");
			this.modelo = keyboard.nextLine();
			System.out.println("Introduce la marca de la rueda.");
			this.marca = keyboard.nextLine();
			System.out.println();

		}

		@Override
		public String toString() {
			return "Rueda " + " Medida de Rueda =" + medida + " Tipo de rueda =" + tipo + " Marca=" + marca + " Modelo="
					+ modelo + "\n";
		}

	}

	public class Chasis {

		private String material;
		private float peso;

		public Chasis() {
			this.material = material;
			this.peso = peso;

		}

		public void ingresarDatosChasis(Scanner keyboard) {

			System.out.println("Introducir datos del Chasis. ");

			System.out.println("Introduzca el material del chasis. ");
			material = keyboard.nextLine();

			System.out.println("Introduzca el peso del chasis. ");
			peso = Float.parseFloat(keyboard.nextLine());
			System.out.println();
		}

		@Override
		public String toString() {
			return " Material = " + material + " Peso = " + peso + "'\''";
		}
	}
}
