package test;

public class Main {

    public static void main(String[] args) {
        String str = "100ドル";
        String sub = str.replaceAll("100", "10000");
        System.out.println(sub);

    }

}
