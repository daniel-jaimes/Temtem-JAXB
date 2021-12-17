package Exceptions;

import java.util.Arrays;
import java.util.List;

public class LogicException extends Exception{
    public static final int TEMTEM_DONT_STORED = 0;
    public static final int PLAYER_DONT_STORED = 1;
    public static final int PARAMETERS_NUMBER_INCORRECT = 2;
    public static final int SHUT_DOWN = 3;
    private final int value;
    List<String> message = Arrays.asList(
            "<< NO SE HA ENCONTRADO EL TEMTEM SELECCIONADO >>",
            "<< NO SE HA ENCONTRADO EL JUGADOR SELECCIONADO >>",
            "<< NUMERO DE PARAMETROS INCORRRECTO >>",
            "<< SE ACABA EL PROGRAMA >>"
    );
    public LogicException(int value){
        this.value = value;
    }

    @Override
    public String getMessage() {
        return "ERRROR: " + message.get(value);
    }
}
