public class Demo6Task_d {
    public static void main(String[] args) {
        
        String darkYellow = "\033[33m";
        String reset = "\033[0m";
        String bolt = "\033[1m";
        String blue = "\033[34m";
        String green = "\033[32m";
        String magenta = "\033[95m";

        String item1 = "Apples";
        int quantity1 = 5;
        double price1 = 0.99;

        String item2 = "Orange";
        int quantity2 = 10;
        double price2 = 1.49;

        String record1 = "%s+----------+----------+-------+\n";
        String record2 = "| %1$s%6$s%2$-9s%1$s%5$s| %1$s%6$s%3$-9s%1$s%5$s| %1$s%6$s%4$-6s%1$s%5$s|\n";
        String record3 = "%1$s+%2$s----------%1$s+----------+%2$s-------%1$s+\n";
        String record4 = "| %4$s%1$-9s%5$s|%6$s%2$9d%5$s | %7$s$%8$s%3$.2f%5$s |\n";

        System.out.printf(record1, darkYellow);
        System.out.printf(record2,reset,"ITEM","QUANTITY","PRICE", darkYellow,bolt);
        System.out.printf(record3, darkYellow,green);
        System.out.printf(record4, item1, quantity1,price1, reset, darkYellow,blue,green,magenta);
        System.out.printf(record4, item2, quantity2,price2, reset, darkYellow,blue,green,magenta);
        System.out.printf(record3, darkYellow,green);
        
    }
    
}
