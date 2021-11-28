public abstract class Cat                                                                                   {
    protected String name;
    protected int age;
    protected char gender;
   // if(gender!='M'||gender!='F'){}
    double price;
    public Cat(){
        this.name="Nancy Pelosi";
        this.age=0;
        this.gender='F';
        //this.price=0.0;
    }
    public Cat(String name,int age,char gender){
        if(gender!='M'&& gender!='F'){
            System.out.println("Please enter correct gender");
        }
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
    public Cat(String name,int age,char gender, double price){
        if(gender!='M'&& gender!='F'){
          System.out.println("Please enter correct gender");
        }
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.price=price;
    }
    public abstract String ToString();

}
