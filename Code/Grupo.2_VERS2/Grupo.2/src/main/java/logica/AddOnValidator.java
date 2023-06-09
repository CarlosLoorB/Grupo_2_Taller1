package logica;

import java.util.Scanner;

import excepciones.InvalidInputException;

import java.util.ArrayList;

public final class AddOnValidator {

    private AddOnValidator() {
    }

    /**
     * @return
     * @throws InvalidInputException
     */
    public static Integer validarAddOn() throws InvalidInputException {
        Scanner scanner = new Scanner(System.in);
        Integer opcion;
        try {
            System.out.println("Paquetes: \n1. All Inclusive \n2. Adventure Activities \n3. Spa and Wellness \nEscoja el paquete:");
            opcion = scanner.nextInt();
            scanner.nextLine();

        } catch (Exception e) {
            throw new InvalidInputException("Opcion Invalida");
        }
        return opcion;
    }

}