package GreedyAlgorithm;

public class knapsackProblem {
    public static void main(String args[]) {

        int n = 5;

        int weight[] = {5, 10, 15, 22, 25};
        int profit[] = {30, 40, 45, 77, 90};

        float pw[] = new float[n];

        int M = 60;

        // Calculate profit/weight
        for (int i = 0; i < n; i++) {
            pw[i] = (float) profit[i] / weight[i];
        }

        // Select highest ratio
        float totalProfit = 0;

        while (M > 0) {

            int maxIndex = -1;
            float maxRatio = -1;

            // Find highest ratio among remaining items
            for (int i = 0; i < n; i++) {

                if (pw[i] > maxRatio) {
                    maxRatio = pw[i];
                    maxIndex = i;
                }
            }

            if (maxIndex == -1) {
                break;
            }

            // Complete item
            if (M >= weight[maxIndex]) {

                M = M - weight[maxIndex];
                totalProfit += profit[maxIndex];

            } 
            // Fraction of item
            else {

                totalProfit += pw[maxIndex] * M;
                M = 0;
            }

            // Mark item as used
            pw[maxIndex] = -1;
        }

        System.out.println("Maximum Profit = " + totalProfit);
    }
}