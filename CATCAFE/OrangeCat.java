public class OrangeCat extends Cat{
     boolean isFat;
     double price=200;
    public OrangeCat(){
        super();
        super.price=this.price;
        this.isFat=true;
    }
    public OrangeCat(boolean isFat,String name,int age,char gender){
        super(name,age,gender);
        this.isFat=isFat;
        super.price=this.price;
        super.age=age;
        super.gender=gender;
        super.name=name;
    }
    public OrangeCat(boolean isFat,String name,int age,char gender,double Price){
        super(name,age,gender,Price);
        this.isFat=isFat;
        super.price=Price;
        super.age=age;
        super.gender=gender;
        super.name=name;
    }
    public String ToString(){
        return "name:"+this.name+"\n"+
                "age:"+this.age+"\n"+
                "gender"+this.gender+"\n"+
                "isFat"+this.isFat+"\n"+
                "price"+this.price;
    }

}
