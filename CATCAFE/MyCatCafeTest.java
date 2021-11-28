import org.junit.jupiter.api.Test;

import java.util.LinkedList;

class MyCatCafeTest {
    //@BeforeClass
    //public static void BeforeClass()
    //{
    MyCatCafe a=null;
    BlackCat goal=new BlackCat();
    //}
    //@DisplayName("")
    //@ParameterizedTest
    //@MethodSource("parameterDataProvider")
    @Test
    void buyCat(double balance,Cat goal) {
      a=new MyCatCafe(1000,new LinkedList<Cat>(),new LinkedList<Customer>());
    System.out.println(a.GetBalence());
    }
    @Test
    void serveCustomer() {
    }

    @Test
    void closeCatCafe() {
    }
    /*private static Stream<Arguments> parameterDataProvider(){
        return Stream.of(
                Arguments.of(15,'M',false,0),
                Arguments.of(22,'M',false,2000),
                Arguments.of(46,'F',true,200)
        );
    }

     */
}