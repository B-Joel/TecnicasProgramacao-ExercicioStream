package service;

import mappers.DadosOscarMapper;
import model.DadosOscar;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OscarService {
    private final List<DadosOscar> dadosOscars;

    public OscarService(List<DadosOscar> dadosOscars) {
        this.dadosOscars = dadosOscars;
    }

    public void printMaisJovem(){
          dadosOscars.stream()
                  .collect(Collectors.groupingBy(DadosOscar::getIdade))
                  .entrySet().stream()
                  .min(Map.Entry.comparingByKey()).get().getValue()
                  .forEach(x -> System.out.printf("Nome: %s - Idade: %d%n",x.getNome(),x.getIdade()));
    }

    public void printMaisPremiado(){
        dadosOscars.stream()
                .collect(Collectors.groupingBy(DadosOscar::getNome, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue()).stream()
                .forEach(x ->System.out.printf("Nome: %s - Quantidade:%d%n",x.getKey(),x.getValue()));
    }


}

