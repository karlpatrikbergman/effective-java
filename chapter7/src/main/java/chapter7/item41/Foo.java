package chapter7.item41;

public class Foo {

    static int sum(int... args) {
        return -1;
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum1(int[] ints) {
        return 9;
    }


    public static void main(String args[]) {
        System.out.println(sum(0));
        System.out.println(sum(1,1));
        System.out.println(sum(1,2,3));
        System.out.println(sum(new int[]{1,2,3}));
    }
}
