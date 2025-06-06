package reviews.reviews2;

public class Review26 {
    public static void main (String[] args) {
        int[] numArray = new int[] {1,2,3,4,5};
        int target = 3;
        int count = 0;
        for(int i = 0; i<numArray.length; i++) {
            if(target == numArray[i]) {
                count++;
            }
        }
        System.out.println("探索した値：" + target);
        System.out.println("一致した数：" + count);
    }
}
