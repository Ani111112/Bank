public class Main {
    public static void main(String[] args) {
        //creating first user
        HDFC hdfc1 = new HDFC("Aniruddha", "Ani@123", 1000);
        System.out.println("Congrats! " + hdfc1.getName() +
                " Your Acount has been created with Account number " +
                hdfc1.getAccountNumber());
        //getting the initial balance
        System.out.println(hdfc1.getBalance());
        //adding balance
        hdfc1.addMoney(5000);
        System.out.println(hdfc1.getBalance());
        //checking both cases
        System.out.println(hdfc1.changePassword("Abc", "hii"));
        System.out.println(hdfc1.changePassword("Ani@123", "Aniruddha@123"));

        //check both cases for withdraw money
        System.out.println(hdfc1.withdrawMoney("Aniruddha@123", 50000));
        System.out.println(hdfc1.withdrawMoney("Aniruddha@123", 5000));

        //making SBI User
        SBI sbi = new SBI("Arindam", 1000, "Arin@123");
        System.out.println("Congrats! " + sbi.getName() +
                " Your Acount has been created with Account number " +
                sbi.getAccountNumber());

        //getting initial balance
        System.out.println(sbi.FetchBalance("Arin@123"));
        //adding balance
        sbi.addMoney(5000);
        System.out.println(sbi.getTotalBalance());
        //checking both cases
        System.out.println(sbi.changePassword("Abc", "hii"));
        System.out.println(sbi.changePassword("Arin@123", "Arindam@123"));
        //check both cases for withdraw money
        System.out.println(sbi.withdrawMoney("Arindam@123", 50000));
        System.out.println(sbi.withdrawMoney("Arindam@123", 5000));
    }
}