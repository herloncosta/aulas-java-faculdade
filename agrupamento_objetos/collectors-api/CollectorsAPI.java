import java.util.*;
import java.util.stream.Collectors;

public class CollectorsAPI {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("banana", "maçã", "pera", "laranja", "uva", "abacaxi");

        // Agrupando as palavras por tamanho
        Map<Integer, List<String>> gruposPorTamanho = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        // Mostrando os grupos
        for (Map.Entry<Integer, List<String>> entry : gruposPorTamanho.entrySet()) {
            System.out.println("Palavras de tamanho " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
