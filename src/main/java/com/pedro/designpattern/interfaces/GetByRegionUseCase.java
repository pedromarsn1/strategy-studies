package com.pedro.designpattern.interfaces;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Slf4j
@AllArgsConstructor
@RequiredArgsConstructor
public class GetByRegionUseCase {
    public Strategy strategy;

    public String trazerNomePelaRegiao(String regiao, String tipo){

        return strategy.trazerNomePelaRegiao(regiao, tipo);
    }
}
