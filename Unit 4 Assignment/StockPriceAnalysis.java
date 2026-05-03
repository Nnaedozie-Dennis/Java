import java.util.ArrayList;

public class StockPriceAnalysis {

    // Method to calculate average price for array
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }

        return sum / prices.length;
    }

    // Method to calculate average price for ArrayList
    public static float calculateAveragePrice(ArrayList<Float> prices) {
        float sum = 0;

        for (int i = 0; i < prices.size(); i++) {
            sum += prices.get(i);
        }

        return sum / prices.size();
    }

    // Method to find maximum price for array
    public static float findMaximumPrice(float[] prices) {
        float max = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }

        return max;
    }

    // Method to find maximum price for ArrayList
    public static float findMaximumPrice(ArrayList<Float> prices) {
        float max = prices.get(0);

        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) > max) {
                max = prices.get(i);
            }
        }

        return max;
    }

    // Method to count occurrences of a target price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == targetPrice) {
                count++;
            }
        }

        return count;
    }

    // Method to compute cumulative sum using ArrayList
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {

        ArrayList<Float> cumulativeSum = new ArrayList<>();

        float sum = 0;

        for (int i = 0; i < prices.size(); i++) {
            sum += prices.get(i);
            cumulativeSum.add(sum);
        }

        return cumulativeSum;
    }

    public static void main(String[] args) {

        // Array of stock prices
        float[] stockPrices = {
            120.5f, 125.0f, 119.5f, 130.0f, 128.5f,
            130.0f, 135.5f, 128.0f, 132.5f, 130.0f
        };

        // ArrayList of stock prices
        ArrayList<Float> stockPriceList = new ArrayList<>();

        stockPriceList.add(120.5f);
        stockPriceList.add(125.0f);
        stockPriceList.add(119.5f);
        stockPriceList.add(130.0f);
        stockPriceList.add(128.5f);
        stockPriceList.add(130.0f);
        stockPriceList.add(135.5f);
        stockPriceList.add(128.0f);
        stockPriceList.add(132.5f);
        stockPriceList.add(130.0f);

        // Calculate average prices
        float averageArray = calculateAveragePrice(stockPrices);
        float averageList = calculateAveragePrice(stockPriceList);

        // Find maximum prices
        float maxArray = findMaximumPrice(stockPrices);
        float maxList = findMaximumPrice(stockPriceList);

        // Count occurrences
        int occurrences = countOccurrences(stockPrices, 130.0f);

        // Compute cumulative sum
        ArrayList<Float> cumulativePrices =
                computeCumulativeSum(stockPriceList);

        // Display results
        System.out.println("Average Price using Array: " + averageArray);

        System.out.println("Average Price using ArrayList: " + averageList);

        System.out.println("Maximum Price using Array: " + maxArray);

        System.out.println("Maximum Price using ArrayList: " + maxList);

        System.out.println("Occurrences of 130.0: " + occurrences);

        System.out.println("Cumulative Sum of Prices: " + cumulativePrices);
    }
}