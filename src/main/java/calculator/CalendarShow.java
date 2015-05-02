package calculator;

import java.util.Calendar;

/**
 * Created by Dmitry on 23.03.2015.
 */
public class CalendarShow extends TimeShow {

    public static void main(String[] args) {
        new CalendarShow();
    }

    public Calendar calendar;

    @Override
    public void alert() {
        System.out.println(calendar.getTime());

    }

    CalendarShow(){
        super();
        this.calendar = Calendar.getInstance();
       this.alert();
    }
}
