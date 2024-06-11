//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
//Com a Stream API, encontre a soma dos números da lista que são
//divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio19 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 15);

        //encontrar a soma dos divisíveis por 3 e 5
        int somaDivisiveis = numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0)
                .mapToInt(Integer::intValue).sum();

        //imprimir o resultado
        System.out.println("Soma dos divisíveis por 3 e 5 é: " + somaDivisiveis);
    }
}
