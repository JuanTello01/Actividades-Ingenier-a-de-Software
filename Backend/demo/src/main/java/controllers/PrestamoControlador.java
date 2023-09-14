package controllers;

import org.springframework.beans.factory.annotation.Autowired;

import repository.PrestamoRepository;

public class PrestamoControlador {
    
    @Autowired
    private PrestamoRepository prestamoRepository;
}
