public class Main {

    public static void main(String[] args) {
        int[] prices = {13, 17, 19, 25, 25, 25, 25, 25, 25, 27, 30};

        System.out.println("Для 31: " + countMore(prices, 31));
        System.out.println("Для 26: " + countMore(prices, 26));
        System.out.println("Для 25: " + countMore(prices, 25));
        System.out.println("Для 20: " + countMore(prices, 20));
    }

    public static int countMore(int[] prices, int money) {
        if (prices[0] > money) {
            return prices.length;
        }

        if (prices[prices.length - 1] < money) {
            return 0;
        }

        int left = 0;
        int right = prices.length - 1;
        while (left < right) {
            int middle = (left + right) / 2;

            if (prices[middle] > money) {
                if (prices[middle - 1] <= money) {
                    return prices.length - middle;
                }
                right = middle - 1;
            } else if (prices[middle] < money) {
                left = middle + 1;
            } else if (prices[middle] == money) {
                left = left + 1;
            }
        }
        return 0;
    }
}
