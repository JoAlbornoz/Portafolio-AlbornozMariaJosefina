/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.mja.Security.Service;

import com.portfolio.mja.Security.Entity.Rol;
import com.portfolio.mja.Security.Enums.RolNombre;
import com.portfolio.mja.Security.Repository.IRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josef
 */
@Service
@Transactional
public class RolService {
    @Autowired 
    IRolRepository IrolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return IrolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        IrolRepository.save(rol);
    }

}
