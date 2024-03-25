package Programacion.EjercicioCuentaProgramacion;

public class SavingAccount extends Account{
    private boolean isAcctive;

    public SavingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        isAcctive = (balance>=10000);
    }

    @Override
    public void consign(float amount) {
        if (isAcctive) {
            super.consign(amount);
        }else {
            System.out.println("La cuenta de ahorro está inactiva");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (super.numberWithdrawals >4 && isAcctive){
            System.out.println("Se ha cobrado un monto adicional de 1000 (mas de 4 extracciones este mes)");
            super.withdraw(amount+1000);
        }else if (isAcctive){
            super.withdraw(amount);
        }else {
            System.out.println("LA CUENTA NO ESTÁ ACTIVA");
        }
    }

    public void Print(){

        System.out.println("Saldo: "+ this.getBalance() + " Comision Mensual: "+ super.monthlyCommission + " Total " +
                "transacciones: "+ (super.numberConsignments+ super.numberWithdrawals));

    }


}
