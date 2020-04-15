import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        BinarySearch tree = new BinarySearch();
        QuickSort quickSort = new QuickSort();

        long[] timeStat = new long[100];
        long[] compStat = new long[100];
        Random r = new Random();

        for(int i=0; i<100; i++){
            tree = new BinarySearch();
            int[] rands = new int[(i+1)*1000];
            for(int j=0; j<(i+1)*1000; j++){
                rands[j] = r.nextInt(100000);
            }

            quickSort.sort(rands, 0 , rands.length-1);

            int lookin = r.nextInt(100000);
            long start = System.nanoTime();
            tree.binarySearch(rands, 0, rands.length-1, lookin);
            long elapsedTime = System.nanoTime() - start;

            timeStat[i] = elapsedTime;
            compStat[i] = tree.comparisons;
        }

        System.out.println(Arrays.toString(timeStat));
        System.out.println("\n" + Arrays.toString(compStat));
    }
}
