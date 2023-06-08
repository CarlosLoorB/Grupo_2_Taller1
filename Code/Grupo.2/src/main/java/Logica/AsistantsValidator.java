package Logica;

import java.util.Scanner;

import Excepciones.InvalidInputException;

public final class AsistantsValidator {
	
    private AsistantsValidator() {
    	
    }

    private static final int LIMITEASISTENTES = 80;


	/**
	 * @return
	 * @throws InvalidInputException
	 */
    public static Integer validarAsistentes() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        Integer asistentes;
        try {
            System.out.println("Cuanta gente asistira vacacion: ");
            asistentes = scanner.nextInt();
            scanner.nextLine();
            validarCantidadAsistentes(asistentes);
        }catch (Exception e) {
            throw new InvalidInputException("Numero Invalido");
        }
        return asistentes;
    }

	/**
	 * @param cantidad
	 * @throws InvalidInputException
	 */
    public static void validarCantidadAsistentes(final Integer cantidad) throws InvalidInputException {
        if (cantidad >= LIMITEASISTENTES) {
            throw new InvalidInputException("Exceso Asistentes");
        }
    }

}
