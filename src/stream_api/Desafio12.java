//Desafio 12 - Encontre o produto de todos os números da lista:
//Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

package stream_api;

import java.util.Arrays;
import java.util.List;

public class Desafio12 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4);

        //encontrar o produtos de todos os números
        int produtosDosNumeros = numeros.stream()
                .mapToInt(Integer::intValue).reduce(1, (num1, num2) -> num1 * num2);

        //imprimir o resultado
        System.out.println("O produto de todos os números é: " + produtosDosNumeros);
    }
}
