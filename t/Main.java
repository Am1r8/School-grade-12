package t;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];

        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int[] prefixSums = new int[n+1];
        int[] suffixSums = new int[n+1];
        for (int i = 1; i <= n; i++) {
            prefixSums[i] = prefixSums[i-1] + heights[i-1];
            suffixSums[i] = suffixSums[i-1] + heights[n-i];
        }

        for (int i = 1; i <= n; i++) {
            int asymmetric = Integer.MAX_VALUE;
            for (int j = 0; j <= n-i; j++) {
                int symmetric = prefixSums[j+i] - prefixSums[j] - (i / 2) * (heights[j] + heights[j+i-1]);
                symmetric += (i / 2) * (heights[j+i-1] - heights[j]);
                asymmetric = Math.min(asymmetric, symmetric + suffixSums[n-j-i] - suffixSums[n-j-i-1]);
            }
            System.out.print(asymmetric + " ");
        }
    }
}
