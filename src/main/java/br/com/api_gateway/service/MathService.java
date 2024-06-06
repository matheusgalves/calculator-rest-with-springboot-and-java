package br.com.api_gateway.service;


import br.com.api_gateway.util.UtilMethods;
import br.com.exceptions.UnsupportedMathOperationException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MathService {
    UtilMethods util = new UtilMethods();

    public Double sum(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if (!util.isNumeric(numberOne) || !util.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return util.convertToDouble(numberOne) + util.convertToDouble(numberTwo);
    }

    public Double subtract(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if(!util.isNumeric(numberOne) || !util.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }

        return util.convertToDouble(numberOne) - util.convertToDouble(numberTwo);
    }

    public Double division(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if(!util.isNumeric(numberOne) || !util.isNumeric(numberTwo) || numberTwo.equals("0")){
            throw new UnsupportedMathOperationException("Please set a numeric or different of zero value!");
        }
        return util.convertToDouble(numberOne) / util.convertToDouble(numberTwo);
    }

    public Double multiplication(String numberOne, String numberTwo) throws UnsupportedMathOperationException {
        if(!util.isNumeric(numberOne) || !util.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return util.convertToDouble(numberOne) * util.convertToDouble(numberTwo);
    }

    public Double mean(List<String> numbers) throws UnsupportedMathOperationException {
        double sum = 0;
        for(String number : numbers){
            if(!util.isNumeric(number)){
                throw new UnsupportedMathOperationException("Please set a numeric value!");
            }

            sum += util.convertToDouble(number);
        }
        return sum / numbers.size();
    }

    public Double squareRoot(String number) throws UnsupportedMathOperationException {
        if(!util.isNumeric(number)){
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return Math.sqrt(util.convertToDouble(number));
    }
}
