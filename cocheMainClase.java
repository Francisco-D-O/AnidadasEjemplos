package anidadoCoche;

public class cocheMainClase {

	public static void main(String[] args) {
		
		
		Coche coche = new Coche();
		Coche.CocheAnidadaInterna cocheUno = coche.new CocheAnidadaInterna("Matrícula Init","Marca init,","Velocidad Init",0);
		
		Coche cocheR = new Coche();
		Coche.Ruedas cocheUnoRuedas = cocheR.new Ruedas(0, "TIPO INIT", "MARCA INIT", "MODELO INIT");
		
		Coche cocheCh = new  Coche();
		Coche.Chasis cocheUnoChasis = cocheCh.new Chasis("Material init", 0);
		
			
		cocheUno.agregarCoche();
		cocheUnoRuedas.agregarRuedas();
		cocheUnoChasis.agregarChasis();
		
	
	
		System.out.println( "Los datos del coche son: \n " + cocheUno.toString()+cocheUnoRuedas.toString()+cocheUnoChasis.toString());

	}
}