package solutions;

import java.util.Arrays;

/**
 * @author Oleg Cherednik
 * @since 08.03.2020
 */
public class Solution241 {

    public static void main(String... args) {
        System.out.println(calcIndex(new int[] { 4, 3, 0, 1, 5 }));  // 3
    }

    public static int calcIndex(int[] papers) {
        Arrays.sort(papers);

        for (int i = papers.length - 1; 0 <= i; i--)
            if (papers[i] <= papers.length - i)
                return papers[i];

        return 0;
    }

}
