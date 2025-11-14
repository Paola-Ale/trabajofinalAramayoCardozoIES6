package ar.ies6.tpfinal.tpfinalAramayoCardozo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class UsuarioController {
     @GetMapping ("/usuario")
    public String getUsuario () {
        return "usuario";
    }
    
}
