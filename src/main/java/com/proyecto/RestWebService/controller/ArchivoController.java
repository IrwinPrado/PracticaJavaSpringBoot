package com.proyecto.RestWebService.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/proyecto")
public class ArchivoController {

    @PostMapping("/crearArchivo")
    public String crearArchivo(@RequestBody List<Persona> personas) throws IOException {
        java.nio.file.Path path = Paths.get("personas.txt");
        List<String> lineas = personas.stream()
                .map(p -> String.join("|", p.getNombre(), p.getApellidoPaterno(), p.getApellidoPaterno(), String.valueOf(p.getEdad())))
                                                                .collect(Collectors.toList());
                                                        Files.write(path, lineas);
                                                        return "Archivo creado en: " + path.toAbsolutePath();
                                                    }
                                                }
                                                
                                                class Persona {
                                                    public String nombre;
                                                    public String apellidoPaterno;
                                                    public String apellidoMaterno;
                                                    public int edad;
                                                    public CharSequence getNombre() {
                                                        throw new UnsupportedOperationException("Unimplemented method 'getNombre'");
                                                    }
                                                    public char[] getEdad() {
                                                        throw new UnsupportedOperationException("Unimplemented method 'getEdad'");
                                                    }
                                                    public CharSequence getApellidoPaterno() {
                                        throw new UnsupportedOperationException("Unimplemented method 'getApellidoPaterno'");
                                    }
}
