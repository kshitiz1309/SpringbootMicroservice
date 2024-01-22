package practice;

public class PrintNumberWithoutUsingLoops {
    public static void main(String[] args){
        int i = 0;
        printTenNumbers(i);
    }

    private static void printTenNumbers(int i) {
        if(i<10){
            ++i;
            System.out.print(i+" ");
            printTenNumbers(i);
        }
    }
}
