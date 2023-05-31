public class Task_001 {

    public static void main(String[] args) {
        ISum summer = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        System.out.println(summer.sum(2, 3));
    }
}

@FunctionalInterface
interface ISum {
    int sum(int a, int b);
}

