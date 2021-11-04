import funcionario.Funcionario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

    public static void main(String[] args) {

        Path arquivo = Paths.get("src/funcionarios.csv");
        Path filtrado = Paths.get("src/func_filtrado.csv");

        try{
            List<String> linhas = Files.readAllLines(arquivo);
            for (int i = 0; i < linhas.size(); i++) {
                String temp = linhas.get(i);
                String vetorSplit[] = temp.split(",");
                for (int j = 0; j < vetorSplit.length; j++) {
                    vetorSplit[j].strip();
                }
                if (i>0){
                    if(Integer.parseInt(vetorSplit[3]) > 0) {
                        Funcionario funcAux = new Funcionario(Integer.parseInt(vetorSplit[0]),
                                Integer.parseInt(vetorSplit[3]), Float.parseFloat(vetorSplit[4]));
                        Files.writeString(filtrado, funcAux.funcInfo(), StandardOpenOption.APPEND);
                    }
                }
                else{
                    Files.writeString(filtrado, "Identificador,Filhos,Salario\n", StandardOpenOption.APPEND);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
