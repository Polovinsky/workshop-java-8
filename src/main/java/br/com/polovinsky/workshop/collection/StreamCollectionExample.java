package br.com.polovinsky.workshop.collection;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class StreamCollectionExample {

    /*Filter*/
    public List<Integer> getNumerosPares(List<Integer> numeros) {
        return numeros.stream()
                .filter(numero -> (numero % 2) == 0)
                .collect(toList());
    }

    /*Map*/
    public List<Integer> getDobro(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> (number * 2))
                .collect(toList());
    }
}
