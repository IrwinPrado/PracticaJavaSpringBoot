package com.proyecto.RestWebService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/proyecto")
public class MiController {
    @GetMapping("/numero")
    public List<Integer> obtenerNumerosAleatorios() {
        return List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }
}