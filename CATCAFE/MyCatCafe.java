import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class MyCatCafe implements CatCafe{
    private double balance;
    private LinkedList<Cat> CatList;
    private LinkedList<Customer>  CustomerList;
    private int numOfrua;
    private boolean isBuyCat;
    private boolean isServeCustomer;
    private boolean isCloseCatCafe;
    public MyCatCafe(){
        this.balance=0.0;
        this.CatList=new LinkedList<Cat>();
        this.CustomerList=new LinkedList<Customer>();
        this.isCloseCatCafe=false;
        this.isBuyCat=false;
        this.isServeCustomer=false;
    }
    public MyCatCafe(int balance,LinkedList CatList,LinkedList CustmoerList){
        this.balance=balance;
        this.CatList=CatList;
        this.CustomerList=CustmoerList;
        this.isCloseCatCafe=false;
        this.isBuyCat=false;
        this.isServeCustomer=false;
    }
    public void BuyCat(double balance,Cat goal){
       try {
           //Cat a=new BlackCat();
        UseInsufficientBalanceException su=new UseInsufficientBalanceException(balance,goal.price);
        su.throwException(balance);
       }
       catch(InsufficientBalanceException wrong){
           System.out.println(wrong.getMessage()+"which is not enough to buy" );
        }
        if (balance >= goal.price) {
            this.CatList.add(goal);
            this.balance=this.balance-goal.price;
            this.isBuyCat=true;
        }
    }
    public void ServeCustomer(Customer customer){
    this.CustomerList.add(customer);
    this.numOfrua=customer.rua;
    int x=1;
    while(numOfrua>=1){
        Random ra=new Random();
        Cat RandomElement=CatList.get(ra.nextInt(CatList.size()));
        System.out.println("the "+x+" time message is");
        System.out.println(RandomElement.ToString());
        balance+=15;
        numOfrua--;
        x++;
        this.isServeCustomer=true;
    }
    };
    public void closeCatCafe(LocalDate date){
        //输出顾客信息
        int Today_gain=0;
        Iterator<Customer> it = CustomerList.iterator();
        while (it.hasNext()) {
            Customer n = it.next();
            if(n.time.equals(date)){
             Today_gain=n.rua*15+Today_gain;
            System.out.println(n.ToString());
            }
        }
        //输出当天利润
        System.out.println("the profit today is: "+Today_gain);
        this.isCloseCatCafe=true;
    };
    //this write for test
    public double GetBalence(){
        return this.balance;
    }
    public LinkedList GetCatList(){
        return this.CatList;
    }

    public boolean ShowIsBuyCat(){return this.isBuyCat;}
    public boolean showIsServeCustomer(){return this.isServeCustomer;}
    public boolean showIscloseCatCafe(){return this.isCloseCatCafe;}
}
//this.numOfrua+=numOfrua;