package com.apps;

import com.examples.FindNumberInArray;
import com.exceptions.CanNotFindNumber;
import com.exceptions.NotEvenANumber;

public class FindNumberInArrayApp {
    public static void main(String[] args){

        FindNumberInArray aNumber = new FindNumberInArray();
        int passed=0,failed=0;

        // CannotFindNumber
        //  number is less than smallest number
        // number is greate than biggest number
        // number is in between the numbers

        // found number
        /// it is the first number
        // it is the last number
        // it is the least number of the array
        // it is the max number of array
        // any number in the moddle
        System.out.println("::::::  RESULTS OF TESTS ::::::::::::::");
        //notEvennumber
        //  test case for NotEvenAnumber Exception
        String result = FindNumberInArrayApp.testApp(aNumber, "sahlini");
        if(result.equals("NOTNUMBER")) {
            System.out.println("test case 1: PASSED");
            passed++;
        } else {
            System.out.println("test case 1: TEST FAILED");
            failed++;
        }

        // test case for cannotFid in between
        result = FindNumberInArrayApp.testApp(aNumber, "65");
        if(result.equals("NOTFOUND")) {
            System.out.println("test case 2: PASSED");
            passed++;
        }else {
            System.out.println("test case 2: FAILED");
            failed++;
        }

        // positive test for number in between the array
        result = FindNumberInArrayApp.testApp(aNumber, "34");
        if(result.equals("3")) {
            System.out.println("test case 3: PASSED");
            passed++;
        }else {
            System.out.println("test case3: FAILED");
            failed++;
        }
        System.out.println("Total Tests passed :"+passed);
        System.out.println("Total Tests failed :"+failed);

    }

    private static String testApp(FindNumberInArray aNumber,String testData){
        String result;
        try {
            int index = aNumber.numberFind(testData);
//            System.out.println(index+" index");
            result = new Integer(index).toString();
        } catch (NotEvenANumber exp) {
//            System.out.println("The input is not a valid number, please enter a number");
            result = "NOTNUMBER";
        } catch (CanNotFindNumber exp) {
//            System.out.println("The given number is not in the Array");
            result = "NOTFOUND";
        }
        return result;
    }
}
