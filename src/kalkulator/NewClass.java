package kalkulator;

import java.text.DecimalFormat;

public class NewClass {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setGroupingUsed(true);
        df.setGroupingSize(3);
        double d = 1889.1234;
        
        System.out.println(df.format(d));
    }
    
}
