//Desafio 18 - Verifique se todos os números da lista são iguais:
//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 1, 1, 2, 1);

        //verificar se todos os números são iguais
        boolean todosIguais = numeros.stream()
                .allMatch(numero -> numero.equals(numeros.get(0)));

        //imprimir o resultado
        if (todosIguais) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }
    }
}
