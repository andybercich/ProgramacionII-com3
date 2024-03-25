package Programacion.EjercicioCuentaProgramacion;

public class AccountMain {
    public static void main(String[] args) {

        CurrentAccount account1 = new CurrentAccount(75123,0.15f);

        account1.consign(4500);
        account1.Print();
        account1.withdraw(8500);
        account1.Print();
        account1.withdraw(95000);
        account1.Print();
        account1.consign(23000);
        account1.Print();
        account1.consign(8777);
        account1.Print();


    }
}
