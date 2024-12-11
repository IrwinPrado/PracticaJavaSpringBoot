package com.proyecto.RestWebService.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class ValidarCorreoController {

    @PostMapping("/validacorreo")
    public String validarCorreo(@RequestBody String correo) {
        return correo.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$") ?
                "EL correo ingresado es valido" : "El correo ingresado es invalido";
    }
}
