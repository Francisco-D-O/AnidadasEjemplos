package anidadoCoche;

import java.util.Scanner;

public class Coche {
	
	

	public class CocheAnidadaInterna {

		private String matricula = " ";
		private String marca = " ";
		private String velocidadMaxima =" ";
		private float potencia = 0;
		
		
		
		public CocheAnidadaInterna(String matricula,String marca, String velocidadMaxima, float potencia) {
			this.marca = marca;
			this.matricula = matricula;
			this.potencia = 0;
			this.velocidadMaxima = velocidadMaxima;
			
			
			
		}

		@Override
		public String toString() {
			return " Matricula = " + matricula + " Marca = " + marca + " Potencia = " + potencia + " VelocidadMaxima = "
					+ velocidadMaxima + " ";
		}

		public void agregarCoche() {

			Scanner keyboard = new Scanner(System.in);

			System.out.println("Ingrese matrícula. ");
			this.matricula = keyboard.nextLine();

			System.out.println("Introduzca la marca. ");
			this.marca = keyboard.nextLine();

			

			System.out.println("Introduzca la velocidad máxima. ");
			this.velocidadMaxima = keyboard.nextLine();
			System.out.println();
			
			System.out.println("Introduzca la potencia. ");
			this.potencia = Float.parseFloat(keyboard.nextLine());
			
			
			
		}

		public String getMatricula() {
			return matricula;
		}

		public String getMarca() {
			return marca;
		}

		public float getPotencia() {
			return potencia;
		}

		public String getVelocidadMaxima() {
			return velocidadMaxima;
		}

	}

	public class Ruedas {

		private float medida;
		private String tipo = " ";
		private String marca = " ";
		private String modelo = " ";

		public Ruedas(float medidas, String tipo,String marca,String modelo) {

			this.medida = medida;
			this.tipo = tipo;
			this.marca = marca;
			this.modelo = modelo;

			// TODO Apéndice de constructor generado automáticamente
		}

		public void agregarRuedas() {

			Scanner keyboard = new Scanner(System.in);

			System.out.println("Introduzca la medida de la rueda. ");
			this.medida = Float.parseFloat(keyboard.nextLine());
			System.out.println("Introduzca el tipo de rueda, lluvia o seco. ");
			this.tipo = keyboard.nextLine();
			System.out.println("Introduce el modelo de la rueda . ");
			this.modelo = keyboard.nextLine();
			System.out.println("Introduce la marca de la rueda.");
			this.marca= keyboard.nextLine();
			System.out.println();
		}

		public float getMedida() {
			return medida;
		}

		public String getTipo() {
			return tipo;
		}

		public String getMarca() {
			return marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setMedida(float medida) {
			this.medida = medida;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		@Override
		public String toString() {
			return " \n  Característica de las Ruedas Medida = " + medida + " Tipo de Ruedas = " + tipo + " Marca= " + marca + " Modelo= " + modelo + "]";
		}

		public void introDatRuedas() {

		}

	}

	public class Chasis {

		private String material ;
		private float peso ;

		public  Chasis(String material, float peso) {
			this.material = material;
			this.peso = peso;

		}

		public void agregarChasis() {

			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Introducir datos del Chasis. ");

			System.out.println("Introduzca el material del chasis. ");
			this.material = keyboard.nextLine();

			System.out.println("Introduzca el peso del chasis. ");
			this.peso = Float.parseFloat(keyboard.nextLine());
			System.out.println();
		}

		public String getMaterial() {
			return material;
		}

		public float getPeso() {
			return peso;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public void setPeso(float peso) {
			this.peso = peso;
		}

		@Override
		public String toString() {
			return "\n  Características del Chasis: Material = " + material + " Peso = " + peso + " ";
		}

	}

	
}

