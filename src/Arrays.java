public class Arrays {
        public static void main(String[] args) {

            // Introduction
            // An array is an indexed collection of fixed number of homogeneous data
            // elements.
            // the main advantage of array is we can represent huge number of values by
            // using single variable
            // so that readability of the code will be improved
            // the main disadvantage of array is fixed in size that is once we create array
            // there is no chance of increasing or decreasing the size based on requirement.
            // so to use array we must be knowing size in advance which may not possible always.

            // Array declaration
            // One dimensional array declaration

            int[] x; // this syntax is recommended as name is separated from type.
            int[] y;
            int z[];

            // at the time of declaration we cannot specify the size otherwise we will get
            // compile time error.

            // int[2] d;
            int[] f;

            // Two dimensional array declaration

            int[][] j; // all syntax are valid but first one is preferred.
            int[][] a;
            int e[][];
            int[][] g;
            int[] h[];
            int[] t[];

            // Which of the following are valid

            int[] r, b; // r->1 , b->1
            int[] q[], p; // q->2, p->1
            int[] m[], o[]; // m->2, o->2
            int[][] u, i; // u->2, i->2 recommended.
            int[][] v, c[]; // v->2, c->3
            // int[] []w,[]l; //error.

            // if we want to specify dimension before the variable that facility is
            // applicable only for first variable in declaration.
            // if we are trying to apply for remaining variables then we will get error.

            // Three dimensional array declaration

            int[][][] k;

            // Array creation

            int[] G = new int[2];
            System.out.println(G.getClass().getName());
            // Every array in java is an object only hence we can create array using new
            // operator
            // For every array type corresponding java classes are available.
            // at time of array creation we must specify array size so that JVM will
            // allocate that memory.
            // it is legal to have an array with size 0 in java

            int[] V = new int[0];
            System.out.println(V.length);

            // if we are trying negative int value as array size then we will get
            // NegativeArraySizeException.

            //int[] S = new int[-2];

            // to specify array size allowed data types are
            // byte, short, int, char if we are trying to specify any other than we will get
            // compile time error.

            long l = 10l;
            //int[] F = new int[l]; // error
            long[] D = new long[5];

            // array is stored in Heap memory.

            // Two-dimensional array also known as Matrix
            // In java, two-dimensional array not implemented by using matrix style
            // some people followed array of arrays approach for multidimensional array
            // creation
            // main advantage of this approach is memory utilization will be improved.

            int[][] A = new int[2][];
            A[0] = new int[2];
            A[1] = new int[3];

            // for diagram please check handwritten notes.
            // Please check handwritten notes for more examples.
            // Which of the following declarations are valid.
            // Once we create an array every array element default initialized by default
            // values
            // Whenever we are trying to print "any reference variable internally toString
            // method will be called" which is implemented by default to the string in the
            // following form
            // classname@hashcode_in hexadecimal form

            int[] R = new int[2];
            System.out.println(R); // CI@3e234
            System.out.println(R[0]); // 0

            int[][] C = new int[2][3];
            System.out.println(C); // CI@3e234
            System.out.println(C[0]); // CI@121212f
            System.out.println(C[0][0]); // 0

            int[][] K = new int[2][];
            System.out.println(K); // CI@3e234
            System.out.println(K[0]); // null
            //System.out.println(K[0][0]); // nullPointerException

            // If we are trying to perform any operation on null then we will get runtime
            // exception saying NullPointerException
            // Once we create array every element by default initialized with default value
            // that is 0.

            int[] T = new int[3];
            T[0] = 11;
            T[1] = 22;
            //T[3] = 33; // ArrayIndexOutofBoundException
            System.out.println(T);
            System.out.println(K);

            // Array declaration, creation and initialisation in a single line

            int[] E;
            E = new int[3];
            E[0] = 11;
            E[1] = 22;
            E[2] = 33;
            // we can do above all three steps in single line

            int[] O = { 11, 22, 33 };
            String[] Str = { "a", "b", "c" };

            // Performance and memory wise there is no difference in both ways.
            // for two-dimensional array also this shortcut is applicable.

            int[][] W = { { 1, 2 }, { 3, 4, 5 } };

            int[][][] Q = { { { 11, 22, 33 }, { 44, 55, 66 } }, { { 77, 88 }, { 99, 111, 222 } } };

            System.out.println(Q[0][1][2]); // 60
            System.out.println(Q[1][0][1]); // 80
            //System.out.println(Q[2][0][0]); // ArrayIndexOutOfBoundException
            //System.out.println(Q[1][2][0]); // ArrayIndexOutOfBoundException
            System.out.println(Q[1][1][1]); // 100
            //System.out.println(Q[2][1][0]); // ArrayIndexOutOfBoundException

            int[] I;
            //I={33,44};
            // We cannot use this shortcut and divide it in two line if then we will get
            // compile time error.

            // length vs length();

            System.out.println(Q.length); // valid
            //System.out.println(Q.length()); // cannot find symbol method length()

            // length is final variable applicable for arrays
            // length variable represents size of the array.
            // length() is a final method applicable for string objects
            // length() return number of characters present in the string.

            String[] St = { "a", "aa", "aaa" };
            //System.out.println(St.length()); // invalid
            System.out.println(St.length); // valid
            //System.out.println(St[0].length); // invalid
            System.out.println(St[0].length()); // valid

            // In multidimensional arrays, length variable represents only base size/

            int[][] arr = new int[3][2];
            System.out.println(arr.length); // 3

            // Anonymous array - just for one time use - which has no name.

        }

}
