
package kata1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Person pepe = new Person("Pepe", new Date(85,1,10));
        System.out.println(pepe.getName());
        System.out.println(pepe.getAge());
    }
    
}
