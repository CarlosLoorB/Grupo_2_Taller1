package logica;

import excepciones.InvalidInputException;

public class AddOnCharge {
    private static final int ALLINCLUSIVE = 200;
    private static final int ADVENTURE = 150;
    private static final int SPAWELLNESS = 100;
	  
    /**
     * @param option
     * @param asistants
     * @return
     * @throws InvalidInputException
     */
    public static Integer addedPackage(Integer option, Integer asistants) throws InvalidInputException{
        if (option==1) {
            return asistants * ALLINCLUSIVE;
        } else if (option==2) {
            return asistants * ADVENTURE;
        } else if (option==3) {
            return asistants * SPAWELLNESS;
        } else {
            throw new InvalidInputException("Opcion Invalida");
        }
    }
}