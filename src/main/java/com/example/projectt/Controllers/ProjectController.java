package com.example.projectt.Controllers;

import com.example.projectt.Entidad.Proyecto;
import com.example.projectt.Repos.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProyectoRepo prorep;

    @GetMapping("/")
    public String index(Model model){
        List<Proyecto> proyectos=prorep.findAll();
        model.addAttribute("proyectos",proyectos);
        model.addAttribute("proyecto",new Proyecto());
        return "index";
    }


    @PostMapping("/add")
    public String create(Proyecto proyecto){
        Proyecto p=new Proyecto();
        prorep.save(proyecto);
        return "redirect:/";
    }

}
