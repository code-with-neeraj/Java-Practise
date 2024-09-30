// package PRA_06;

public class pr_problem {
    public static void main(String[] args) {
        // Question1: create an array of 5 float and calculate their sum.

        // float [] marks = {45.3f, 65.5f, 35.3f, 99.0f, 100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of sum is " + sum);

        // Question2: write a program to find out whether a given integer is present in an array or not.

        // float [] marks = {45.3f, 65.5f, 35.3f, 99.0f, 100.0f};
        // float num = 45.3f;
        // boolean isInArray = false;
        // for(float element:marks){
        //     if(num==element){
        //         isInArray = true;
        //         break;
        //     }
        // }
        // if(isInArray){
        //     System.out.println("The value is present in the array");
        // }
        // else{
        //     System.out.println("The value is not present in the array");
        // }


        // Question3: calculate the average marks from an array containing marks of all students in physics using for-each loop.

        // float [] marks = {45.3f, 65.5f, 35.3f, 99.0f, 100.0f};
        // float sum = 0;
        // for(float element:marks){
        //     sum = sum + element;
        // }
        // System.out.println("The value of average marks is " + sum/marks.length);

        // Question4: create a java program to add two matrice of size 2X3.
        /* 
        int [][] mat1 = {{1, 2, 3},
                         {4, 5, 6}};
        int [][] mat2 = {{2, 6, 13},
                         {3, 7, 1}};
        int [][] result = {{0, 0, 0},
                          {0, 0, 0}};
        for (int i=0; i<mat1.length; i++){ // row number of times
            for (int j=0; j<mat1.length; j++){ // column number of time
                System.out.format("Setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Printing the elements of a 2-D Array
        for (int i=0; i<mat1.length; i++){ // row number of times
            for(int j=0; j<mat1[i].length;j++){ // column number of time
                System.out.println(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.print(""); // Prints a new line
        }
            */
        // Question5: write a java program to revese an array.

        /* 
        int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap  a[i] and a[l-1-i]
            // a b temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int element: arr){
            System.out.print(" "+element);
        }
        */

        // Question6: write a java program to find the maximum element in an array.
        /* 
        int [] arr = {1, 2, 3, 445, 5, 64};
        int max = 0;
        for(int e: arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: "+ max);
        */

        // Question7: write a java program to find the minimum element in a java array.

        /* 
        int [] arr = {1, 2, 3, 445, 5, 64};
        int min = 0;
        for(int e: arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The value of the maximum element in this array is: "+ min);
        */

        // Question8: write a java program to find whether an array is sorted or not.

        boolean isSorted = true;
        int [] arr ={1, 2, 3, 4, 5, 6, 7};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]> arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The Array is sorted");
        }
        else{
            System.out.println("The Array is not soted");
        }



    }
    
}
