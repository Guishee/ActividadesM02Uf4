package com.example.projectt.Controllers;

import com.example.projectt.Entidad.Alumno;
import com.example.projectt.Entidad.Proyecto;
import com.example.projectt.Repos.AlumnoRepo;
import com.example.projectt.Repos.ProyectoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProyectoRepo prorep;

    @Autowired
    private AlumnoRepo alumnoRepo;


    //PROYECTO******************************************************************************
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

    //ALUMNO*********************************************************************************

    @GetMapping("/alumnos")
    public String listarAlumnos(Model model) {
        List<Alumno> listaAlumnos = alumnoRepo.findAll();
        model.addAttribute("alumnos", listaAlumnos);
        model.addAttribute("nuevoAlumno", new Alumno());
        return "alumnos";
    }
    @PostMapping("/alumnos")
    public String agregarAlumno(@ModelAttribute("nuevoAlumno") Alumno alumno) {
        alumnoRepo.save(alumno);
        return "redirect:/alumnos";
    }


}
