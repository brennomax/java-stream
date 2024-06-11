//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio9 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //verificar se todos os números são distintos
        boolean todosDistintos = numeros.stream()
                .distinct().count() == numeros.size();

        //imprimindo resultado
        if(todosDistintos) {
            System.out.println("Todos os números são distintos!");
        } else {
            System.out.println("Existem núemros repetidos na lista!");
        }
    }
}
