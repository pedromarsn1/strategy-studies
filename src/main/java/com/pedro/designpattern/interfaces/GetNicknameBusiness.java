package com.pedro.designpattern.interfaces;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GetNicknameBusiness implements Strategy{
    @Override
    public String trazerNomePelaRegiao(String regiao, String tipo) {
        log.info("nome brasileiro");
        return "nome brasileiro";
    }
}
