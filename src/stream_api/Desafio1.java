//Desafio 1 - Mostre a lista na ordem numérica:
//Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //criar uma a List de inteiros para recebe-los em ordem numérica
        List<Integer> numerosOrdenados = numeros.stream().sorted().toList();

        //imprimir o resultado
        System.out.println("Números ordenados: " + numerosOrdenados);
    }
}