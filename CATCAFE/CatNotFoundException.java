public class CatNotFoundException extends RuntimeException{
    private String message;

    public CatNotFoundException(String message){
        super(message);
        this.message=message;
    }
}
