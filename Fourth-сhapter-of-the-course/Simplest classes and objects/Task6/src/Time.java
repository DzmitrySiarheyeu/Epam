import javafx.concurrent.Task;

import java.util.Scanner;

public class Time {

    private int HH, MM, SS;

    public Time(int hh, int mm, int ss) {
        set_hh(hh);
        set_mm(mm);
        set_ss(ss);
    }
    public Time(int hh, int mm) {
        this(hh, mm, 0);
    }
    public Time() {
        this(0, 0, 0);
    }
    public void set_hh(int hh) {
        if (hh < 0 || hh > 23)
            HH = 0;
        else
            HH = hh;
    }
    public void set_mm(int mm) {
        if (mm < 0 || mm > 59)
            MM = 0;
        else
            MM = mm;
    }
    public void set_ss(int ss) {
        if (ss < 0 || ss > 59)
            SS = 0;
        else
            SS = ss;
    }
    public int hours() {
        return HH;
    }
    public int minutes() {
        return MM;
    }
    public int seconds() {
        return SS;
    }
    public void print() {
        System.out.println(toString());
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", HH, MM, SS);
    }

    public void read(Scanner scanner) {

        System.out.println("hh: ");
        Task6.time.set_hh(scanner.nextInt());

        System.out.println("mm: ");
        Task6.time.set_mm(scanner.nextInt());

        System.out.println("ss: ");
        Task6.time.set_ss(scanner.nextInt());
    }
    public void add_seconds(int ss) {
        SS += ss;
        MM += SS / 60;
        SS = SS % 60;
        HH += MM / 60;
        MM = MM % 60;
        HH = HH % 24;
    }
    public void add_minutes(int mm) {
        add_seconds(mm * 60);
    }
    public void add_hours(int hh) {
        add_seconds(hh * 60 * 60);
    }

}
