//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio7 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 71, 6, 7, 8, 9, 10, 5, 4, 3, 15, 97, 97, 14, 16);

        //ordenar a lista e recolher os últimos dois maiores
        List<Integer> segundoMaior = numeros.stream()
                .sorted().skip(numeros.size() - 2).toList();

        //imprimir o resultado
        //System.out.println(segundoMaior.get(0));
        System.out.println(segundoMaior.getFirst());
    }
}

