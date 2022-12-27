package MentorTasks.week1;

import day27_accessModifiers.StaticInitializationBlock;

public class FINRA {

    public static void main(String[] args) {



        String result = "";

        for (int i = 1; i < 31; i++)//i will represent the number from 1-30,
            if (i % 3 == 0 && i % 5 == 0) {
                result += "FINRA "+"\n";
            } else if (i % 3 == 0) {
                result += "FIN "+"\n";
            } else if (i % 5 == 0) {
                result += "RA "+"\n";
            } else {
                result += i +" "+"\n";


            }

        System.out.println(result);

    }


    }

/*
Create a class called FINRA, Write a function which prints out the number.
    but for number which is a multiple of 3, print "FIN" instead of the number and for number
    which is a multiple of 5,    print "RA" instead of the number.
     and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3
                output:
                      FIN
                number = 10
	            output:
	                RA
            	number = 15
	            output:
	                FINRA
 */