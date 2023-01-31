package chap_06;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        int[] iArray={1,2,3,4,5};
        double[] dArray={1.0,2.0,3.0,4.0,5.0};
        String[] sArray ={"A","B","C","D","E"};
        
        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);
        System.out.println("--------------------");
      //  printAnyArray(iArray);
       // printAnyArray(dArray);    -> 제네릭스는 객체타입을 지원한다. 참조타입이 아닌 기본타입인 int,double 등은 에러남.
        // -> wrapper class를 사용하여 감싸줌.

        Integer[] iArray2={1,2,3,4,5};
        Double[] dArray2={1.0,2.0,3.0,4.0,5.0};

        printAnyArray(iArray2);
        printAnyArray(dArray2);
        printAnyArray(sArray);

    }



    private static <T> void printAnyArray(T[] array) {
        for (T t:array){
            System.out.print(t+"     ");
        }

        System.out.println();
    }


    private static void printIntArray(int[] iArray) {
        for (int i:iArray){
            System.out.print(i+"     ");
        }

        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double i:dArray){
            System.out.print(i+"     ");
        }
        System.out.println();

    }

    private static void printStringArray(String[] sArray) {
        for (String i:sArray){
            System.out.print(i+"     ");
        }
        System.out.println();

    }
}
