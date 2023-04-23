package ar.edu.unlam.pb;

public class PruebaAlumno {

	public static void main(String[] args) {
		
		Alumno alumno1, alumno2, alumno3;
		
		alumno1 = new Alumno();
		do {
			System.out.println("Ingrese su DNI");
			alumno1.setDni(40143300);
			System.out.println("Ingrese la nota del primer parcial");
			alumno1.setNotaPrimerParcial(2);
			System.out.println("Ingrese la nota del segundo parcial");
			alumno1.setNotaSegundoParcial(4);
			System.out.println("Ingrese cantidad de asistencias");
			alumno1.setCantidadAsistencias(25);
			if(alumno1.aprobo()) {
				System.out.println("Aprobaste");
			} else {
				System.out.println("No aprobaste");
			}
		} while (true);

	}

}
