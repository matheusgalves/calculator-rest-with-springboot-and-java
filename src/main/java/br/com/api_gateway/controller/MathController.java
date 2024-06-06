package br.com.api_gateway.controller;

import br.com.api_gateway.service.MathService;
import br.com.api_gateway.util.UtilMethods;
import br.com.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {
    private static final AtomicLong counter = new AtomicLong();
    UtilMethods util = new UtilMethods();
    MathService mathService = new MathService();

    // Especificando os parametros {numberOne} e {numberTwo}, a fim de deixá-los obrigatórios e especificando
    //  que eu quero um método GET
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)

    // @PathVariable para lidar com os parametros obrigatorios
    public Double sum(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException { //lógica para validação
        return mathService.sum(numberOne, numberTwo);
    }


    @RequestMapping(value = "/subtract/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtract(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo//para mapear os parametros que eu passei no request mapping!
    ) throws UnsupportedMathOperationException { //pode lançar essa exceção
        return mathService.subtract(numberOne, numberTwo);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {
        return mathService.division(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable(value = "numberOne") String numberOne,
            @PathVariable(value = "numberTwo") String numberTwo
    ) throws UnsupportedMathOperationException {
        return mathService.multiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mean/{numbers}", method = RequestMethod.GET)
    public Double mean(
            @PathVariable(value = "numbers") List<String> numbers
    ) throws UnsupportedMathOperationException {
        return mathService.mean(numbers);
    }

    @RequestMapping(value = "/sqrt/{number}", method = RequestMethod.GET)
    public Double squareRoot(
            @PathVariable(value = "number") String number
    ) throws UnsupportedMathOperationException {
        return mathService.squareRoot(number);
    }
}
