//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio15 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(-1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //encontrar os negativos
        boolean haNegativo = numeros.stream()
                .anyMatch(numero -> numero < 0);

        //imprimir o resultado
        if(haNegativo) {
            System.out.println("Existe pelo menos um número negativo!");
        } else {
            System.out.println("Não existo número negativo!");
        }
    }
}
