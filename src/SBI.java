import java.util.UUID;

public class SBI implements BankApplication{
    private String name;
    private double totalBalance;
    private String accountNumber;
    private String password;
    private final double rateOfInterest = 6.3;

    //both constructor
    public SBI() {
    }

    public SBI(String name, double totalBalance, String password) {
        this.name = name;
        this.totalBalance = totalBalance;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.password = password;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public void setTotalBalance(double totalBalance) {
        this.totalBalance = totalBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String FetchBalance(String password) {
        if (this.password.equals(password)) {
            return "Your Current Balance " + this.totalBalance;
        }else return "Check your Password!";
    }

    @Override
    public String addMoney(double amount) {
        this.totalBalance += amount;
        return "Money Added Successfully " + "Your Current Balance is " + this.totalBalance;
    }

    @Override
    public String withdrawMoney(String password, double amount) {
        if (this.password.equals(password)) {
            if (this.totalBalance - amount >= 0) {
                this.totalBalance -= amount;
                return "Money Debited Successfully " + "Your Current Balance is " + this.totalBalance;
            }else return "Insufficient Balance";
        }else return "Enter Correct Password!";
    }

    @Override
    public String changePassword(String oldPassword, String password) {
        if (this.password.equals(oldPassword)) {
            setPassword(password);
            return "Password Changed Successfully!";
        }else return "Incorrect Password!";
    }

    @Override
    public double rateOfInterest(int years) {
        return (this.totalBalance * years * this.rateOfInterest) / 100;
    }
}
