package ar.ies6.tpfinal.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.ies6.tpfinal.demo.model.Vehiculo;

@Controller
public class VehiculoController {
    
     @GetMapping("/vehiculo")
    public String vehiculo(Model model) { 

        Vehiculo nuevoVehiculo = new Vehiculo(); 
        model.addAttribute("vehiculo", nuevoVehiculo);
        return "vehiculo";
    }


}
