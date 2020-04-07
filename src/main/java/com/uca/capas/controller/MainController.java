package com.uca.capas.controller;

import com.uca.capas.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class MainController {
    @GetMapping("/login")
    public String enviarForm(Usuario usuario) {
        return "login";
    }

    @PostMapping("/validacion")
    /*
     * usuario: admin
     * contraseña: root
     */
    public String procesarForm(Usuario usuario) {
        if(usuario.getNombre().equals("admin")&&usuario.getContra().equals("root")) {
            return "MostrarMensajeV";
        }else {
            return "MostrarMensajeF";
        }

    }


}