package com.proyecto.RestWebService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
public class CrearUsuarioController {
    @PostMapping("/crearUsuario")
    public ResponseEntity<String> crearUsuario(@RequestBody Usuario usuario) {
        try {
            return ResponseEntity.ok("Usuario creado");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error al crear el usuario, intenatalo mas tarde ;)");
        }
    }
}