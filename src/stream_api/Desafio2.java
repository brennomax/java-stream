//Desafio 2 - Imprima a soma dos números pares da lista:
//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio2 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //somar os pares da list
        int somaDosNumerosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue).sum();

        //imprimir o resultado
        System.out.println("Soma dos números pares: " + somaDosNumerosPares);
    }
}
