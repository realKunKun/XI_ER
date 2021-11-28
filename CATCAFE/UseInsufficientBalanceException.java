public class UseInsufficientBalanceException {
    private double money;
    private double price;
    public UseInsufficientBalanceException(double money,double price){

        this.money=money;
        this.price=price;

    }
    public void throwException(double money)throws InsufficientBalanceException{
        if(money<this.price){
        throw new InsufficientBalanceException("Balance:"+money);
        }
    }
}
