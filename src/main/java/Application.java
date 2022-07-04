import mappers.DadosOscarMapper;
import model.DadosOscar;
import service.OscarService;
import util.FileUtil;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) throws IOException, IllegalAccessException {
        var fileUtilM = new FileUtil<DadosOscar>("oscar_age_male.csv");
        var fileUtilF = new FileUtil<DadosOscar>("oscar_age_female.csv");

        var dadosOscarM = fileUtilM.readFile(new DadosOscarMapper());
        var dadosOscarF = fileUtilF.readFile(new DadosOscarMapper());
        var dadosOscar = Stream.concat(dadosOscarM.stream(),dadosOscarF.stream()).collect(Collectors.toList());

        var oscarService = new OscarService(dadosOscar);

        System.out.println("\nMais jovem premiado");
        oscarService.printMaisJovem();

        System.out.println("\nPessoas mais premiada");
        oscarService.printMaisPremiado();


        // exercicios
        // TODO 1 - Importar dataset
        // TODO 2 - Criar model que represente os dados
        // TODO 3 - Transformar os dois arquivos em apenas 1 stream
        // TODO 4 - Ator mais jovem a ser premiado
        // TODO 5 - Ator com maior qtd de prêmios
    }
}
