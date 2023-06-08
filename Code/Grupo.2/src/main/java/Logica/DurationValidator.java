package Logica;

import java.util.Scanner;

import excepciones.InvalidInputException;

public final class DurationValidator {

    private DurationValidator() {
    }

    /**
     * @return
     * @throws InvalidInputException
     */
    public static Integer validarDuracion() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        Integer duracion;
        try {
            System.out.println("Cuantos dias durara su vacacion: ");
            duracion = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            throw new InvalidInputException("Duracion Invalida");
        }
        return duracion;
    }

}
