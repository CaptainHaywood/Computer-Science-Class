public class Driver {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 44, 8};
        ArrayMethods methods = new ArrayMethods(arr);
        methods.moveEvensInFront();
        System.out.println(methods.getValues());

        /*int[] arr = new int[5];

        arr[0] = 1;

        arr[1] = 2;

        arr[2] = 3;

        arr[3] = 4;

        arr[4] = 5;

        ArrayMethods am = new ArrayMethods(arr);

        // test A

        am.swapFirstAndLast();

        System.out.println(am.getValues()); // prints 5 2 3 4 1



// test B

        am.shiftRight();

        System.out.println(am.getValues()); // prints 1 5 2 3 4



// test C

        am.replaceEvens();

        System.out.println(am.getValues()); // prints 1 5 0 3 0



// test D

        am.replaceWithLargerNeighbors();

        System.out.println(am.getValues()); // prints 1 1 5 0 0



// test E

        am.removeMiddle();

        System.out.println(am.getValues()); // prints 1 1 0 0



// test F

        am.moveEvensInFront();

        System.out.println(am.getValues()); // prints 0 0 1 1



// test G

        System.out.println(am.getSecondLargest()); // prints 1



// test H

        System.out.println(am.isAscendingOrder()); // prints true



// test I

        System.out.println(am.containsAdjacentDuplicates()); // prints true



// test J

        System.out.println(am.containsDuplicates()); // prints true*/


    }
}
