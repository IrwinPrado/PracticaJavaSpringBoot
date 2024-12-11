package com.proyecto.RestWebService.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class NumerosParesController {

    @PostMapping("/pares")
    public Map<String, List<Integer>> separarParesImpares(@RequestBody List<Integer> numeros) {
        Map<String, List<Integer>> resultado = new HashMap<>();
        resultado.put("Los pares son:", numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
        resultado.put("Los impares son:", numeros.stream().filter(n -> n % 2 != 0).collect(Collectors.toList()));
        return resultado;
    }
}