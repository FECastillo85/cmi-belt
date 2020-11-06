package com.undec.cmibelt.seguridad.repository;

import com.undec.cmibelt.seguridad.entity.Rol;
import com.undec.cmibelt.seguridad.enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Integer> {

        Optional<Rol> findByRolNombre(RolNombre rolNombre);

}
