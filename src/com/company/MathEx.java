package com.company;

//Write a method called swap(). It takes a single integer argument. The method will create and return an integer with the ones and tens
// digits swapped. For example, if the number 123 is sent, the method will return 132.

public class MathEx {
    public static void main(String [] args) {
        int g = swap(157);
        System.out.println(g);

        timeLeft(1, 34, 8, 20);

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

        int curTime = curHour + curMin;
        int depTime = depHour + depMin;

        int newHour = (depTime - curTime) / 60;
        int newMin = (depTime - curTime) % 60;

        System.out.print(newHour + " hours, ");
        System.out.print(newMin + " minutes");


    }

    /*
    Write a method called dayOfWeek(). This method takes 2 integer arguments. The first indicates
witch day of the week January 1 is. (0-Sunday, 1-Monday, 2-Tuesday, 3-Wednesday, 4-
Thursday, 5-Friday, 6-Saturday) The second argument is a date. (i.e. 15 for Jan 15 th ). The
method will return an integer 0-6 indicating which day of the week the date corresponds to.
     */

}

