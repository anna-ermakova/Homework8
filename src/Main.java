public class Main {
    public static void main(String[] args) {
        int[] weights = {90,91,92,93,94,95,96,97,98,99,0,0};
        weights[0] = 90;
        int januaryWeight=weights[0];
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        int january=0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
            System.out.println(weights[i]);
        }
    }
}