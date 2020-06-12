package com.examples;

import com.exceptions.CanNotFindNumber;
import com.exceptions.NotEvenANumber;

public class FindNumberInArray {
    int[] numbers = {5, 90, 45, 34, 59, 60};

    public int numberFind(String number) throws NotEvenANumber, CanNotFindNumber {

        int newNumber = 0;
        int index = -1;
        //System.out.println("The number inside the solution: "+number);
        //System.out.println("The new number values is: "+newNumber);
        try {
            newNumber = Integer.parseInt(number);
//            System.out.println("The number after parseInt Method: "+newNumber);
        } catch (NumberFormatException exception) {
            throw new NotEvenANumber();
        }

        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("The newNumber "+newNumber+" is compared to: "+numbers[i]);
//            System.out.println("The index value is: "+i);
            if (newNumber == numbers[i]) {
//                System.out.println(newNumber+" is in"+i+" th location of the array");
                index = i;
            }
        }
//        System.out.println("After for loop the value of index is: "+index);
        if (index == -1)
            throw new CanNotFindNumber();
        return index;
    }
}
