package com.cine.entradas.service;

import com.cine.entradas.repository.BoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletoServices {

    @Autowired
    private BoletoRepository boletoRepository;

}
