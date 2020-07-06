import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader buffered = new BufferedReader(new InputStreamReader(System.in));
        Account Zahar = new Account("1",10000, "$");
        Account Yura = new Account("2",15000, "$");


        Zahar.ShowAccountInfo();
        Zahar.PutMoney(5000);

        Zahar.ShowAccountInfo();
        Zahar.WithdrawMoney(8000);

        Zahar.ShowAccountInfo();
        Yura.ShowAccountInfo();

        Zahar.MakeTransaction(Yura,6000);

        Zahar.ShowAccountInfo();
        Yura.ShowAccountInfo();
    }

}
