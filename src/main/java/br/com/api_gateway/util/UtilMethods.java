package br.com.api_gateway.util;

public class UtilMethods {
    public Double convertToDouble(String strNumber) {
        if (strNumber == null){
            return 0D;
        }
        String number = strNumber.replaceAll(",", ".");

        if(isNumeric(number)){
            return Double.parseDouble(number);
        }
        return 0D;
    }

    public boolean isNumeric(String strNumber) {
        if (strNumber == null){
            return false;
        }

        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+"); //regex para pegar só os numeros!
    }
}
