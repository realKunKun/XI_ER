import java.time.LocalDate;

public interface CatCafe {
    void BuyCat(double money,Cat goal);
    void ServeCustomer(Customer customer);
    void closeCatCafe(LocalDate date);
}
