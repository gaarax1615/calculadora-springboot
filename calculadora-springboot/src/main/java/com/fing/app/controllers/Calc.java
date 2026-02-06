package com.fing.app.controllers;

import org.springframework.web.bind.annotation.*;
import com.fing.app.models.Product;

@RestController
public class Calc {

    @GetMapping("/")
    public String root() {
        return "SIUUUU, ya jala xD";
    }

    @GetMapping("/calc/{oper}/{n1}/{n2}")
    public String calc(@PathVariable String oper,
                       @PathVariable int n1,
                       @PathVariable int n2) {

        int res;

        switch (oper.toLowerCase()) {
            case "suma":
                res = n1 + n2;
                break;
            case "resta":
                res = n1 - n2;
                break;
            case "multiplicacion":
                res = n1 * n2;
                break;
            case "divvision":
                if (n2 == 0) return "Error: no se puede dividir entre 0";
                res = n1 / n2;
                break;
            default:
                return "Operacion no valida (usa suma/resta/multiplicacion/division)";
        }

        return "Resultado = " + res;
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Ing.") String name,
                        @RequestParam(value = "carrera", defaultValue = "de ICC") String carrera) {
        return "Hola " + name + "!, " + carrera;
    }

    @PostMapping("/prod")
    public String createProduct(@RequestBody Product product) {
        return "Producto recibido: " + product.getName() + " - $" + product.getPrice();
    }
}
