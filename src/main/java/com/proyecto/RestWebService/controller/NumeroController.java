package com.proyecto.RestWebService.controller;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto/numero")
public class NumeroController {
    
  @GetMapping("/aleatorios")
    public List<Integer> obtenerNumerosAleatorios() {
      return new Random().ints(10, 1, 101)
      .boxed()
      .collect(Collectors.toList()); 
    }
}
