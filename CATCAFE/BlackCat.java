public class BlackCat extends Cat {
    double price = 350;;
    //@Override
    public BlackCat(){
        super();
        super.price = price;
    }
    public BlackCat(String name,int age,char gender){
        super(name,age,gender);
        super.price = this.price;
        super.age=age;
        super.gender=gender;
        super.name=name;
    }
    public BlackCat(String name,int age,char gender,double Price){
        super(name,age,gender,Price);
        super.price = price;
        super.age=age;
        super.gender=gender;
        super.name=name;
    }
    public String ToString(){
        return "name:"+this.name+"\n"+
                "age:"+this.age+"\n"+
                "gender"+this.gender+"\n"+
                "price"+this.price;
    }

    /*@Override
    public void is() {

    }

    @Override
    public void as(int a) {

    }

     */
}
