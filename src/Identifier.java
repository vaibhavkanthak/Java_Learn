public class Identifier {

        public static void main(String[] args){

            int x = 11;
            //only allowed identifiers are alphabets, digits, and _ and $ symbols.
            //int 2y = 55;
            //Identifiers starting with digits are not allowed.

            int number = 100;
            int Number = 100;
            int NUMBER = 100;
            // Identifiers are Case-sensitive.
            int zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz = 200;
            // There is no length limit for Java Identifiers, but it's not good programming practice.
            // int this = 55; -> Java Reserved words are not allowed as Identifiers in Java.

            int String = 22;
            int Runnable = 44;
        /*Using predefined class and interface names like String and Runnable as identifier is allowed
        but its worst programming practice to follow*/

            int $cash = 66;

            System.out.println(String);
            System.out.println(Runnable);
            System.out.println(x);
            System.out.println(number);
            System.out.println(Number);
            System.out.println(NUMBER);
            System.out.println(zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz);
            System.out.println($cash);

        /* Find which of the following identifiers are valid or invalid
        sum_number ->valid
        total# ->invalid
        123SUM ->invalid
        number22 ->valid
        cash% ->invalid
        $cash ->valid
        _$_$-$ ->valid
        all@numbers ->invalid
        java7_$$ ->valid
        Integer -valid
        Int ->valid
        int ->invalid
        */


        }

}
