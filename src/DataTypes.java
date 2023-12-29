public class DataTypes {

        public static void main(String[] args) {

            // Integral data types
            byte x = 11; // 1 byte = 8 bits memory.
            // byte w = 128; // compile time error saying type mismatch cannot convert from int to byte.
            short y = 22; // 2 byte = 16 bits memory.
            int z = 33; // 4 byte = 32 bits memory.
            long k = 44; // 8 byte = 64 bits memory.

            // floating point data types
            float h = 55.5345f; // 4 byte = 32 bits memory.
            double d = 66.624545; // 8 byte = 64 bits memory.

            // boolean data types
            boolean b = false;

//            int l = 0;
//            if (l) {
//                System.out.println("Yes");
//            } else {
//                System.out.println("No");
//            }
            // we will get compile time error saying type mismatch cannot convert int to
            // boolean.

//            while (0) {
//                System.out.println("Hello");
//            }
            // we will get compile time error saying type mismatch cannot convert int to
            // boolean.

            // char data types Java is unicode based so char size is 2 byte.
            char c = 'v';

            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(k);
            System.out.println(h);
            System.out.println(d);
            System.out.println(b);
            System.out.println(c);

            /*
             * In Java every variable and every expression has some type. Each and every
             * data type is clearly defined.
             * Every assignment should be checked by compiler for type compatibility.
             * because of above reasons we can conclude that Java language is Strongly typed
             * Programming Language.
             *
             * Java is not considered as pure object-oriented programming language because
             * several oops features are not
             * satisfied by Java(like operator overloading and multiple inheritance etc.)
             * Moreover, we depend on primitive data types which are non objects.
             */

        }

}
