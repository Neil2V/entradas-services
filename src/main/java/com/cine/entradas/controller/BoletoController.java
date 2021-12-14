package com.cine.entradas.controller;

import com.cine.entradas.service.BoletoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/entradas")
public class BoletoController {

    @Autowired
    BoletoServices boletoServices;
}
