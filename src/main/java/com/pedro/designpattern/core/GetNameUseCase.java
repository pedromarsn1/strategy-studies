package com.pedro.designpattern.core;
import com.pedro.designpattern.interfaces.GetNameUsResident;
import com.pedro.designpattern.interfaces.GetNicknameBusiness;
import com.pedro.designpattern.interfaces.Strategy;

public class GetNameUseCase {
    public static void main(String[] args) {
        var regiao = "US";
        var tipo = "PF";

        Strategy strategy;
        if (regiao.equalsIgnoreCase("BR") &&
                tipo.equalsIgnoreCase("BUSINESS")){
            strategy = new GetNicknameBusiness();
            strategy.trazerNomePelaRegiao(regiao,tipo);
        }

        if (regiao.equalsIgnoreCase("US") &&
                tipo.equalsIgnoreCase("PF")){
            strategy = new GetNameUsResident();
            strategy.trazerNomePelaRegiao(regiao,tipo);
        }
    }
}
