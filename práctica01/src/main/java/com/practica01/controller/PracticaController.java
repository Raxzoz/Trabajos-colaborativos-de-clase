/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.controller;

import com.practica01.services.practicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Jeausthin
 */
@Controller
public class PracticaController {

    @Autowired
    private practicaService practicaService;

    @GetMapping("/")
    public String inicio(Model model) {
        var practica = practicaService.getpractica();
        model.addAttribute("practica", practica);
        return "index";
    }

}
