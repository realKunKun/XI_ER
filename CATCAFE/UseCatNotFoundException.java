import java.util.LinkedList;

public class UseCatNotFoundException {
    private LinkedList catList;
    public UseCatNotFoundException(LinkedList catList){
    this.catList=catList;
    }
    public void throwException(LinkedList catList)throws CatNotFoundException{
        if(catList.size()==0){
        throw new CatNotFoundException("there is not enough cat ruaed in the MyCatCafe");
        }
    }
}
