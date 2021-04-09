public class Main {

    public static void main(String[] args) {

        System.out.println(method(8));
        System.out.println(method3(8, 9));

    }

    public static int method (int a){
        return a*2+3;
    }

    public static int method3 (int a, int b){
        return a*b + 22;
    }

}
