
package kata1;

import java.util.Date;

public class Person {
    
    private final String name;
    private final Date birthday;
    private static final double DAY_PER_YEAR = 365.25;
    private static final int HOUR_PER_DAY = 24;
    private static final int MINUTE_PER_HOUR = 60;
    private static final int SECOND_PER_MINUTE = 60;
    private static final int MS_PER_SECOND = 1000;

    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }
    
    public int getAge(){
        Date today = new Date();
        return toYear(today.getTime()-birthday.getTime());
    }

    private int toYear(long ms) {
        return (int) (ms / millisecondsPerYear());
    }

    private double millisecondsPerYear() {
        return MS_PER_SECOND
                * SECOND_PER_MINUTE
                * MINUTE_PER_HOUR
                * HOUR_PER_DAY
                * DAY_PER_YEAR;
    }
}
