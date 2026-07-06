/*
    ConceptDemo.java
    R. Tran
    7/6/2025
    Demonstration of the Adapter pattern and use of generics
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConceptDemo {
    public static void main(String[] args){
        Integer[] numberArray = {5, 2, 9, 1, 4, 7};
        ArrayAdapter adapter = new ArrayAdapter(numberArray);
        List<Integer> numbers = adapter.toList();

        //Printing values
        System.out.println("Before sorting: " + numbers);

        //Printing sorted values
        Collections.sort(numbers);
        System.out.println("After sorting: " + numbers);

        //Printing without value "4"
        numbers.remove(Integer.valueOf(4));
        System.out.println("After removing 4: " + numbers);

        //Printing via List
        printList(numbers);

    }

    public static void printList(List<?> list) {
        System.out.println(
                "Printing list using unbounded wildcard: " + list);
    }
}

class ArrayAdapter {
    private Integer[] array;
    public ArrayAdapter(Integer[] array) {
        this.array = array;
    }
    public List<Integer> toList() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
