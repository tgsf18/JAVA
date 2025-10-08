package com.exemplo.conversor.controller;

import com.exemplo.conversor.service.ConversorService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
public class ConversorController {

    private final ConversorService service;

    public ConversorController(ConversorService service) {
        this.service = service;
    }

    @GetMapping("/converter")
    public String converter(@RequestParam double valor, @RequestParam String de, @RequestParam String para) {
        double resultado = service.converter(valor, de, para);
        return String.format("%s °%s = %s °%s", service.formatar(valor), de, service.formatar(resultado), para);
    }
}