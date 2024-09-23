package first;

import org.junit.Assert;
import org.junit.Test;


import java.sql.Array;

public class Simple {
    @Test
    public  void mainb() throws InterruptedException {

        try {
            int arr[] =  new int[4];
            arr[0] = 100;
            arr[1] = 200;
            System.out.println(1);
            Assert.fail("какая то фигня");
            System.out.println(arr[7]);
            System.out.println(2);
        } catch (Exception e) {
            Thread.sleep(2000);
            System.out.println(e.getMessage() + "Gjnjve lskjflsjfls");
            //throw new RuntimeException(e);

        }

    }
}
