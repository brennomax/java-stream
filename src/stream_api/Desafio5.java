//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

package stream_api;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class Desafio5 {
    public static void main(String[] args) {
        //atributo
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //filtrar e somar números maiores que 5
        int somaNumerosMaioresQueCinco = numeros.stream()
                .filter(numero -> numero > 5)
                .mapToInt(Integer::intValue).sum();

        //imprimir o resultado
        System.out.println("A soma dos números maiores que 5 é: " + somaNumerosMaioresQueCinco);
    }
}