package reviews.reviews2;

public class Review19 {
    public static void main(String[] args) {
        int num = 8;
        int i = 1;
        int factorial = 1;
        while(i <= num){
            factorial *= i;
            i += 1;
        }
        System.out.println("結果: "+factorial);
    }
}
