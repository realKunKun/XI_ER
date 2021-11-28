public class InsufficientBalanceException extends RuntimeException{
  private String message;

  public InsufficientBalanceException(String message){
  super(message);
  this.message=message;
  }

}
