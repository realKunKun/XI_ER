import java.time.LocalDate;
import java.util.LinkedList;

public class TEST {
    public static void main(String[] args) {
        MyCatCafe WhiteHouse=new MyCatCafe(1500,new LinkedList<Cat>(),new LinkedList<Customer>());
        BlackCat Nancy=new BlackCat();
        OrangeCat Trump=new OrangeCat(true,"Trump",76,'M');
        BlackCat Faker=new BlackCat("Faker",25,'M');
        OrangeCat Joey=new OrangeCat(false,"Joey",18,'M',200);
        Customer Biden=new Customer("Biden",6, LocalDate.of(2021,9,11));
        Customer Liyuu_= new Customer("Liyuu_",3,LocalDate.of(2021,19,11));
        //test method BuyCat
        WhiteHouse.BuyCat(WhiteHouse.GetBalence(),Trump);
        WhiteHouse.BuyCat(WhiteHouse.GetBalence(),Faker);
        WhiteHouse.BuyCat(WhiteHouse.GetBalence(),Nancy);
        WhiteHouse.BuyCat(WhiteHouse.GetBalence(),Joey);
        System.out.println("run of method BuyCat is "+WhiteHouse.ShowIsBuyCat());//验证是否买猫成功
        System.out.println(WhiteHouse.GetCatList().getFirst().toString()+"\n");//展示猫猫信息
        //test method ServeCustomer
        WhiteHouse.ServeCustomer(Biden);
        WhiteHouse.ServeCustomer(Liyuu_);
        System.out.println("\n"+"run of method ServeCustomer is "+WhiteHouse.showIsServeCustomer()+"\n");//验证是否"服务顾客"成功
        //test method closeCatCafe
        WhiteHouse.closeCatCafe(LocalDate.of(2021,9,11));
        WhiteHouse.closeCatCafe(LocalDate.of(2021,19,11));
        System.out.println("run of method closeCatCafe is "+WhiteHouse.showIscloseCatCafe());//验证关闭猫咖是否成功
    }
}
