/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica01.services.impl;

import com.practica01.dao.practicaDao;
import com.practica01.domain.practica;
import com.practica01.services.practicaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jeausthin
 */
@Service
public class practicaServiceImpl implements practicaService{

    @Autowired
    private practicaDao practicaDao;
    
    @Override
    public List<practica> getpractica() {
        return (List<practica>) practicaDao.findAll();
    }
    
}
