package Logica;

import java.util.Scanner;

import Excepciones.InvalidInputException;

public class AsistantsValidator {
	
	public static Integer validarAsistentes() throws InvalidInputException {
		Scanner scanner = new Scanner(System.in);
		Integer Asistentes;
		try {
			System.out.println("Caunta gente asistira vacacion: ");
			Asistentes = scanner.nextInt();
			scanner.nextLine();
			ValidarCantidadAsistentes(Asistentes);
		}
		catch (Exception e) {
			throw new InvalidInputException("No es un numero valido");
		}
		return Asistentes;
	}
	
	public static void ValidarCantidadAsistentes(Integer cantidad) throws InvalidInputException {
		if (cantidad >= 80) {
			throw new InvalidInputException("Demasiados Asistentes");
		}
	}

}
