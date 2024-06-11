//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio11 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        //
        int somaDosQuadrados = numeros.stream()
                .map(numero -> numero * numero)
                .reduce(0, Integer::sum);

        //imprimir o resultado
        System.out.println("Soma dos Quadrados: " + somaDosQuadrados);
    }

}
