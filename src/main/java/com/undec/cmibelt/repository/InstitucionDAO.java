package com.undec.cmibelt.repository;

import com.undec.cmibelt.entity.Institucion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InstitucionDAO extends JpaRepository<Institucion, Long> {

    Institucion save (Institucion pInstitucion);
    List<Institucion> findAll();
    Optional<Institucion> findById(Long pId);
    Optional<Institucion> findByCUE(int pCUE);
    //Optional<Institucion> findByNombre(String pNombre);

}
