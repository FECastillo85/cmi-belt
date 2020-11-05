package com.undec.cmibelt.service;

import com.undec.cmibelt.DTO.InstitucionDTO;
import com.undec.cmibelt.DTO.ListarInstDTO;
import com.undec.cmibelt.entity.Institucion;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public interface InstitucionService {


    Institucion agregar(InstitucionDTO dto);
    List<ListarInstDTO> listar();
    Institucion modificar(Institucion pInstitucion);
    Optional<Institucion> buscarPorId(Long pId);
   // Optional<Institucion> buscarPorNombre(String pNombre);
    Optional<Institucion> buscarPorCUE(int CUE);

}
