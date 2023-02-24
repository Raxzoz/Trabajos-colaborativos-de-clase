/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica01.dao;

import com.practica01.domain.practica;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jeausthin
 */
public interface practicaDao extends JpaRepository<practica,Long>{
    
}
