public interface BankApplication {
    String FetchBalance(String password);
    String addMoney(double amount);
    String withdrawMoney(String password, double amaount);
    String changePassword(String oldPassword, String password);
    double rateOfInterest(int years);
}
