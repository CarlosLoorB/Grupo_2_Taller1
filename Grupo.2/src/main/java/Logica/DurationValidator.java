package Logica;

import java.util.Scanner;

import Excepciones.InvalidInputException;

public class DurationValidator {
	
	public static Integer validarDuracion() throws InvalidInputException {
		Scanner scanner = new Scanner(System.in);
		Integer Duracion;
		try {
			System.out.println("Caunta dias durara su vacacion: ");
			Duracion = scanner.nextInt();
			scanner.nextLine();
		}
		catch (Exception e) {
			throw new InvalidInputException("No es una duracion valida");
		}
		return Duracion;
	}

}
