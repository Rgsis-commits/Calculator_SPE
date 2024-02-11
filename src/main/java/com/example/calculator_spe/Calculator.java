package com.example.calculator_spe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins="http://localhost:3000/")
@SpringBootApplication
@RestController
public class Calculator{

    @GetMapping("/factorial/{number}")
    public int factorial(@PathVariable int number) {
        if (number == 0)
            return 1;
        else
            return (number * factorial(number - 1));
    }

    @GetMapping("/logarithmic/{number}")
    public double logarithmic(@PathVariable double number) {
        return Math.log(number);
    }

    @GetMapping("/sqrt/{number}")
    public double squareRoot(@PathVariable double number) {
        return Math.sqrt(number);
    }

    @GetMapping("/power/{base}/{exponent}")
    public double power(@PathVariable double base, @PathVariable double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        SpringApplication.run(Calculator.class, args);
    }
}


