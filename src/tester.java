public class tester {
    public static void main(String[] args) {
        MyInt i = new MyInt(100);
        String[] a ={"1000","00"};
        System.out.println(i.isEven());
        System.out.println(i.isOdd());
        System.out.println(i.isPrime());
        System.out.println(i.equals(1000));
        System.out.println(i.equals(i));
        System.out.println(MyInt.isEven(2));
        System.out.println(MyInt.isOdd(2));
        System.out.println(MyInt.isPrime(2));
        System.out.println(MyInt.parseInt("0"));
        for (int x: MyInt.parseInt(a)){
            System.out.println(x);
        }

    }
}
