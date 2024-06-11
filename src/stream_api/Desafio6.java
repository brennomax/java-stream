//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15);

        //buscar números maior que 10
        List<Integer> numerosMaioresQueDez = numeros.stream()
                .filter(numero -> numero > 10).toList();

        //imprimir o resultado
        if(!(numerosMaioresQueDez.isEmpty())) {
            System.out.println("Números maiores que 10: " + numerosMaioresQueDez);
        } else {
            System.out.println("Não há números maiores que 10 ou lista vazia!");
        }
    }
}