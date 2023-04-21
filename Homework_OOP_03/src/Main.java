public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(-10_000, -50_000);
        SimpleAccount simpleAccount = new SimpleAccount(150_000);

        System.out.println(simpleAccount.transfer(creditAccount, 5000));
        System.out.println(creditAccount.getBalance());
        System.out.println(simpleAccount.getBalance());
        System.out.println(simpleAccount.transfer(creditAccount, 5000));
        //System.out.println(creditAccount.transfer(simpleAccount, 50000));
        System.out.println(creditAccount.getBalance());
        System.out.println(simpleAccount.getBalance());
        System.out.println(simpleAccount.transfer(creditAccount, 5000));
        System.out.println(creditAccount.getBalance());
        System.out.println(simpleAccount.getBalance());
    }
}
