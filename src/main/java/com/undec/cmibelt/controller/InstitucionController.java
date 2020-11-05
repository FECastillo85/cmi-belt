package com.undec.cmibelt.controller;
import com.undec.cmibelt.DTO.InstitucionDTO;
import com.undec.cmibelt.DTO.ListarInstDTO;
import com.undec.cmibelt.entity.Institucion;
import com.undec.cmibelt.service.InstitucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("/estInstitucional")
public class InstitucionController {

    @Autowired
    InstitucionService service;


    @PostMapping(value = "/agregarInstitucion")
    public Institucion addInstitucion(@RequestBody InstitucionDTO institucion){
        return service.agregar(institucion);
    }


    @GetMapping(value = "/listarInstitucion")
    public List<ListarInstDTO> listarInstitucion(){
        return service.listar();
    }

    @GetMapping(value = "/getInstitucionById/{id}")
    public Optional<Institucion> getInstitucionById(@PathVariable("id") Long idInstitucion){
        return service.buscarPorId(idInstitucion);
    }

    @PutMapping(value = "/modificarInstitucion/{id}")
    public Institucion editarInstitucion(@RequestBody Institucion institucion, @PathVariable(name = "id") Long idInstitucion){
        institucion.setId(idInstitucion);
        return service.modificar(institucion);
    }



}
