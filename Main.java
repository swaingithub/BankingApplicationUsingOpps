public class Main {

    public static void main(String[] args) {

        Account RakeshAccount = new Account("121212",0,"Rakesh","Rakesh@xyz.com","97766089");

        RakeshAccount.DepositMoney(5000);
        RakeshAccount.DepositMoney(1500);

        RakeshAccount.WithDrawMoney(1000);
    
    }
}
