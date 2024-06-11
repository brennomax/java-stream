//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio8 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(5, 10, 15, 20, 1);

        //realizar a soma de todos os elementos da list
        int somaDosElementos = numeros.stream()
                .mapToInt(Integer::intValue).sum();

        //imprimir o resultado
        System.out.println("O resultado encontrado é: " + somaDosElementos);
    }
}
