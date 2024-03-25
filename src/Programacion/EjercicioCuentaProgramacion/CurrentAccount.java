package Programacion.EjercicioCuentaProgramacion;

public class CurrentAccount extends Account{
    private float overdraft;

    public CurrentAccount(float balance, float annualRate) {

        super(balance, annualRate);
        overdraft = 0;
    }

    @Override
    public void withdraw(float amount) {
        if (amount > balance) {
            balance -= amount;
            overdraft += balance;
            balance= 0;
        }else {
            super.withdraw(amount);
        }

    }

    @Override
    public void consign(float amount) {
        overdraft+=amount;
        if (overdraft>0){
            super.consign(overdraft);
            overdraft= 0;
        }

    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    public void Print (){

        System.out.println("Saldo: "+ this.balance+ " Comision Mensual: "+ super.monthlyCommission+ " Transacciones " +
                "realizadas: "+ (this.numberConsignments+this.numberWithdrawals) + " Sobregiro: "+ this.overdraft);

    }
}
