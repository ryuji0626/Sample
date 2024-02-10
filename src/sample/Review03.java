package sample;

public class Review03 {

    public static void main(String[] args) {

        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(num * 10);
        } catch (NumberFormatException n) {
            System.out.println("数値に変換出来ない文字が指定されました。");
        } finally {
            System.out.println("処理が終了しました。");
        }

    }
}
