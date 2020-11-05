package com.undec.cmibelt.repositoryImpl;

import com.undec.cmibelt.DTO.InstitucionDTO;
import com.undec.cmibelt.DTO.ListarInstDTO;
import com.undec.cmibelt.entity.Direccion;
import com.undec.cmibelt.entity.Institucion;
import com.undec.cmibelt.repository.InstitucionDAO;
import com.undec.cmibelt.service.InstitucionService;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public  class InstitucionImpl implements InstitucionService {

    @Autowired
    private InstitucionDAO repositorio;





    @Override
    public Institucion agregar(InstitucionDTO dto) {

        ModelMapper mapper = new ModelMapper();
        Institucion institucion = new Institucion();
        Direccion direccion = new Direccion();
/*

        institucion.setNombre(dto.getNombre());
        institucion.setNumero(dto.getNumero());
        institucion.setDescripcion(dto.getDescripcion());
        institucion.setCUE(dto.getCUE());
        institucion.setEmail(dto.getEmail());
        institucion.setTelefono(dto.getTelefono());
        direccion.setCalle(dto.getDireccionCalle());
        direccion.setBarrio(dto.getDireccionBarrio());
        direccion.setCP(dto.getDireccionCP());
        direccion.setLocalidad(dto.getDireccionLocalidad());
        direccion.setProvincia(dto.getDireccionProvincia());
        direccion.setNumero(dto.getDireccionNumero());
        institucion.setDirección(direccion);

*/

        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        institucion = mapper.map(dto, Institucion.class);
        institucion.setFechaCreacion( new Date()) ;
        return repositorio.save(institucion);
    }

    @Override
    public List<ListarInstDTO> listar() {

        ModelMapper mapper = new ModelMapper();
        List<Institucion> lista = new ArrayList<Institucion>() ;

        lista = repositorio.findAll();

        List<ListarInstDTO> listaDTO = lista
                .stream()
                .map(Institucion -> mapper
                        .map(Institucion, ListarInstDTO.class))
                .collect(Collectors.toList());
        return listaDTO;
    }

    @Override
    public Institucion modificar(Institucion pInstitucion) {
        return repositorio.save(pInstitucion);
    }

    @Override
    public Optional<Institucion> buscarPorId(Long pId) {
/*
        Optional<Institucion> institucion = repositorio.findById(pId);
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        InstitucionDTO institucionDTO = mapper.map(institucion, InstitucionDTO.class);
        Optional<InstitucionDTO> instDTO = Optional.of(institucionDTO);

        return  instDTO;

 */
         return repositorio.findById(pId);
    }

    @Override
    public Optional<Institucion> buscarPorCUE(int pCUE) {
        return repositorio.findByCUE(pCUE);
    }
/*
    @Override
    public Optional<Institucion> buscarPorNombre(String pNombre) {
        return repositorio.findByNombre(pNombre);
    }
*/


}
