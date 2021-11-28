import java.time.LocalDate;

public class Customer {
 String name;
 int rua;
 LocalDate time;
    public Customer(){
        this.name="KUN";
        this.time=LocalDate.of(2021,11,11);
        this.rua=2;
    }
    public Customer(String name, int rua, LocalDate time){
        this.name=name;
        this.rua=rua;
        this.time=time;
    }

    public String ToString(){
        return "customer`s name is "+this.name+"\n"+
               "the time of how many customer want to rua is  "+this.rua+"\n"+
                "the local time is "+this.time;
    }
}
