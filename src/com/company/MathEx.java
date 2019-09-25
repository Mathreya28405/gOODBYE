package com.company;

//Write a method called swap(). It takes a single integer argument. The method will create and return an integer with the ones and tens
// digits swapped. For example, if the number 123 is sent, the method will return 132.

public class MathEx {
    public static void main(String [] args) {
        int g = swap(157);
        System.out.println(g);
    }
    public static int swap(int x) {
        int y = x % 10;
        int z = x / 10 % 10;
        int a = ((x / 100)*100) + (y * 10) + (z);


        return a;

    }
    //Write a method called timeLeft(). The method takes the following integer arguments: curHour,
    //curMin, depHour, depMin. These correspond to the current time and the time that a train
    //leaves, all between 1 and 11 pm of the same day. This method will print how many hours and
    //minutes you will have to wait for the train.

    public static void timeLeft(int b, int c, int d, int e) {
        int curHour = b * 60;
        int curMin = c;
        int depHour = d * 60;
        int depMin = e;
    }
}

