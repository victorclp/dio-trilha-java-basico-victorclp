public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(String message){
        super(message);
    }

    static void validarEntrada(int num1, int num2) throws ParametrosInvalidosException{

        if (num1 > num2){

            throw new ParametrosInvalidosException("O primeiro número deve ser menor que segundo!");
        }

    }


}