package ru.geekbrains.Homework2;


public class Sample01 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        invertArray(arr);

        int sizeArray = 8;
        array02(sizeArray);

        int [] arr03 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        array03(arr03);

        int sizeArray04 = 5;
        array04(sizeArray04);
    }


    public static void invertArray (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void array02 (int sizeArr02) {
        int [] arr02 = new int [sizeArr02];
        arr02[0] = 0;
        for (int i = 0; i < arr02.length; i++) {
            arr02[i] = i * 3;
            System.out.print(arr02[i]+ " ");
        }
        System.out.println();
    }

    public static void array03 (int [] arr03) {
        for (int i =0; i < arr03.length; i++){
            if (arr03[i] < 6){
                arr03[i] *=2;}
                System.out.print(arr03[i] + " ");
        }
        System.out.println();
    }

    public static void array04 (int sizeArr04) {
        int[][] arr04 = new int [sizeArr04][sizeArr04];
        for (int i = 0; i < sizeArr04; i ++) {
            for (int j = 0; j < sizeArr04; j++) {
                arr04[i][i] = 1;
                arr04[i][arr04.length - i - 1] = 1;
               // if(i == j){
                   // arr04[i][j] = 1;}
               // else{
                    //arr04[i][j] = 0;}
              System.out.print(arr04[i][j] + " ");
            }
            System.out.println();
            }
    }
}
