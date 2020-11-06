package com.undec.cmibelt.seguridad.service;

import com.undec.cmibelt.seguridad.entity.Rol;
import com.undec.cmibelt.seguridad.enums.RolNombre;
import com.undec.cmibelt.seguridad.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class RolService {

    @Autowired
    RolRepository rolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return rolRepository.findByRolNombre(rolNombre);
    }

}
