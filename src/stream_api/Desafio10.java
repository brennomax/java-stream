//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio10 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //encontrar e agrupar múltiplos de 3 e 5
        List<Integer> multiplosTresCinco = numeros.stream()
                .filter(numero -> numero % 3 == 0 || numero % 5 == 0).toList();

        //imprimir o resultado
        System.out.println("Múltiplos de 3 e 5: " + multiplosTresCinco);
    }
}
