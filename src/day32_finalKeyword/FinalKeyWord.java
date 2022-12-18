package day32_finalKeyword;

import java.time.LocalDate;

class  CydeoStudent{

    public void language(){

        System.out.println("Jave Programming");
    }
}

public class FinalKeyWord {

    public static void main(String[] args) {


        final char gender = 'M';

        System.out.println(gender);

        //gender = 'F'; get compiler error once we made gender final.

        //System.out.println(gender);

        System.out.println("------------------DateExample--------------");

        final LocalDate dateOfBirth = LocalDate.now();

        System.out.println(dateOfBirth);
/*  when we made date of birth variable final, we weren't able to now print the below script. We got
compiler error instead, as we can NOT make any changes what so ever!
  dateOfBirth= dateOfBirth.plusYears(1);

        System.out.println(dateOfBirth);
 */



    }

}
