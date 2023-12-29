public class Literals {



        public static void main(String[] args) {

            int x = 22;
            int y = 033;
            int z = 0x11;
            int q = 0X55;
            int w = 0XBAE;

            System.out.println(w);

            // A constant value which can be assigned to variable is called a literal.
            // In above example, int-> data type/keyword, x-> name of variable/identifier and
            // 10 -> constant value/Literal.
            // Integral literals
            // Decimal literal->by default JVM considers values in decimal. e.g.
            // 22,33,44,55.
            // A number prefixed with 0 then its treated as Octal form( base 8 -> allowed
            // digits 0 to 8)
            // e.g. 011, 022.
            // Hexadecimal value->base 16( allowed digits 0 to 9 and both lower and upper
            // cases are allowed a to f)-> A number prefixed with 0x or 0X
            // then its considered as hexadecimal number
            // JVM will always provide values in decimal form.
            // By default, every integral literal is of int type, but we can specify
            // explicitly as long type by suffixed with l or L.
            // By default every floating point literal is of double type. so we have
            // explicitly writing 'f' or 'F' suffix.
            // We can specify floating point literal as double type by suffixed with d or D
            // but not required.
            // Floating point literals are specified in Decimal only.
            // We can assign integral literal directly to floating point variables under
            // that integral literal can be specified either in decimal or octal hexadecimal
            // forms.

            double d = 0777;
            double e = 0XFace;
            double f = 0998.6;
            // double d = 0XFACE.78;
            double g = 10;
            // double num = 0888;
            // float p = 1.2e3;
            double r = 1.2e3;

            // But we cannot assign floating point value to int data type

            // int num1 = 222.23;
            // System.out.println(num1);

            // Boolean data type-> true or false ->lower case only

            boolean g1 = true;
            boolean b1 = false;
            // boolean n = 0; // compile time error.
            // boolean m = True; // compile time error.
            // boolean v = "true"; // compile time error.

            // Char data type ->
            // Single character within single quotes.

            char ch = 'a';
            // char vh = a;
            // char sd = "a";
            // char h = 'ac';
            char t = 97;
            char o = 0xface;
            char gg = 0777;
            char df = 65535;

            System.out.println(t);

            // We can specify char literal as integral literal which represents unicode value of the character and
            // that integral literal can be specified in either in decimal, octal and hexadecimal form.
            // but allowed range is 0 to 65535.
            //www.unicode.org
            // we can represent char literal in unicode representation like
            //\4xxxx
            char chh = '\u0061';

            // Every escape character is a valid char literal.

            char ch1 = '\n'; //new line
            char ch2 = '\t'; //horizontal tab
            char ch3 = '\r'; //carriage return.
            char ch4 = '\b'; //backspace.
            char ch5 = '\f'; //form feed.
            char ch6 = '\''; //single quote.
            char ch7 = '\"'; //double quote.
            char ch8 = '\\'; //Back slash.

            //String literal
            //Any sequence of characters within double quotes is treated as String literal.

            String s = "Hello";

            //1.7 version enhancements wrt to literals
            // Binary Literals
            //For integral data types we can specify literal values in the following ways.
            //Usage of underscore symbol in numeric literals.

            double dd = 123_345.78;

            // at compilation _ symbols will be removed automatically.
            //byte -> short-> int -> long-> float-> double
            //char-> int

            float ff = 10l;
            //8 byte can be assigned to 4 byte because both long and float have different memory allocations in JVM.












        }


}
