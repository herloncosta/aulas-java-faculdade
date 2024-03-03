package agrupamento_objetos.collections;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Inserção de dados
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Acesso aos elementos
        System.out.println("\nThe elements on the array are:\n");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("numbers[" + i + "] = " + numbers.get(i));
        }

        // Removendo o elemento da segunda posição
        numbers.remove(1);

        // Inserindo um novo elemento na primeira posição
        int x = 57;
        numbers.set(0, x);

        // Verificando se o array contém um elemento específico
        int y = 100;
        String containsElement = numbers.contains(y) ? "True" : "False";
        System.out.println("\nThe array contains: " + y + "? " + containsElement);

        // Iternado na lista com o laço for-each
        System.out.println("\nUpdated array elements:\n");
        int j = 0;
        for (int number : numbers) {
            System.out.println("numbers[" + j + "] = " + number);
            j++;
        }

        // Removendo todos os elementos do array
        System.out.println("\nRemove all elements from array. From here, the array will be empty.");
        numbers.clear();

        // Verifando se o array está vazio
        String isEmpty = numbers.isEmpty() ? "True" : "False";
        System.out.println("\nIs the array empty? " + isEmpty);
    }

}
