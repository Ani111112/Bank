import java.util.UUID;

public class HDFC implements BankApplication{
    private String name;
    private String accountNumber; //using UUID
    private String password;
    private double balance;
    private final double rateOfInterest = 6.1;

    //No argument Constructor
    public HDFC() {
    }
    //All arguments Constructor
    public HDFC(String name, String password, double amount) {
        this.name = name;
        this.accountNumber = String.valueOf(UUID.randomUUID());
        this.password = password;
        this.balance = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setPassword(String password) {
        if (password.equals(password))
            this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String FetchBalance(String oldPassword) {
        if (password.equals(oldPassword)) {
            return "Your Current Balance is " + this.balance;
        }
        return "Enter Correct Password!";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Money Added Successfully!";
    }

    @Override
    public String withdrawMoney(String oldPassword, double withdrawAmount) {
        if (password.equals(oldPassword)) {
            if (this.balance - withdrawAmount >= 0) {
                this.balance -= withdrawAmount;
                return "Thanks for choosing HDFC";
            }else return "Insufficient Balance!";
        }else return "Incorrect Password!";
    }

    @Override
    public String changePassword(String oldPassword, String Password) {
        if (this.password.equals(oldPassword)) {
            setPassword(Password);
            return "Password Changed Successfully!";
        }else return "Incorrect Password!";
    }

    @Override
    public double rateOfInterest(int years) {
        return (balance * years * rateOfInterest) / 100;
    }
}
