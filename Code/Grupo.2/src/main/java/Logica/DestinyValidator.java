package Logica;

import java.util.Scanner;

import Excepciones.InvalidInputException;

public class DestinyValidator {
    
	/**
	 * @return
	 * @throws InvalidInputException
	 */
    public static String validarDestino() throws InvalidInputException { 
        Scanner scanner = new Scanner(System.in);
        String destino;
        try {
            System.out.println("Destino de la vacacion: ");
            destino = scanner.nextLine();
        }catch (Exception e) {
            throw new InvalidInputException("Destino Invalido");
        }
        return destino;
    }

}
