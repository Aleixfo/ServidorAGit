package com.example.springproductes.Controllers;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//NOTACIO OBLIGATORIA (PAQUET AL QUE PERTANY)
@Controller
@RequestMapping("/prova2") //Quan es faci localhost:8080/prova2 es dirigira a aquest controllador
public class ProvaController {

    @Value("${index.salutacio}")
    private String salutacio;

    @GetMapping({"/", "", "/index"}) //Aqui li dic que aquest metode es cridara amb get i el mappegam a s'arrel de prova2
    public String provaVisualitzarTitol (ModelMap model){ //Per enviar dades a la vista

        model.addAttribute("titol", salutacio);

        return "mostrarTitol"; //El return ha de retornar el nom de la vista (mostrarTitol.html)
    }

    @PostMapping("/respo") //Subdomini pel metode
    public String resposta (@RequestParam String nom, ModelMap model) {
        String textcomplet = "El nom que has escrit esa: ".concat(nom);
        model.addAttribute("text", salutacio);
        return "resposta"; //El return ha de retornar el nom de la vista (resposta.html)
    }


}
