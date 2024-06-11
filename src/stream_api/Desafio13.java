//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
//Utilize a Stream API para filtrar os números que estão dentro de um intervalo
//específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 71, 6, 7, 8, 9, 10, 5, 4, 3, 15, 97, 97, 14, 16);

        //encontrar números de um determinado intervalo
        List<Integer> numerosIntervalos = numeros.stream()
                .filter(numero -> numero > 5 && numero < 10).toList();

        //imprimir o resultado
        System.out.println("Resultado: " + numerosIntervalos);
    }
}
