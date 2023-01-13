public interface bankInterface {
    int checkBalance();

    String addMoney(int money);

    String withDrawMoney(int money,String password);

    float calculateInterest(int years);
}
