package mappers;

import model.DadosOscar;

import java.util.function.Function;

public class DadosOscarMapper implements Function<String, DadosOscar> {
    @Override
    public DadosOscar apply(String s) {
        var dadosLinha = s.split(";");
        var id = Integer.parseInt(dadosLinha[0]);
        var ano = Integer.parseInt(dadosLinha[1].replace(" ",""));
        var idade = Integer.parseInt(dadosLinha[2].replace(" ",""));
        var nome = dadosLinha[3];
        var filme = dadosLinha[4];


        DadosOscar dadosOscar = new DadosOscar(id, ano, idade, nome, filme);
        return dadosOscar;
    }
}
