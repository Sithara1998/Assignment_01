public class Demo6Task_b {
    public static void main(String[] args) {

        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob" ;
        int age2 = 30;

        String darkYellow = "\033[33m";
        String blue= "\033[34;1m";
        String reset = "\033[0m";
        String white = "\033[37m";
        String magenta = "\033[95m";

        String DASHLINE = "%s+-----------------+-----+\n";
        final String RECORD  = "| %3$s%-16s%4$s|%5$s%4s%4$s |\n";


        System.out.printf(DASHLINE, darkYellow);
        System.out.printf("| %3$s%-16s%5$s%4$s| %3$s%s%5$s%4$s |\n", "NAME", "AGE", blue, darkYellow, reset);
        System.out.printf(DASHLINE, darkYellow);
        System.out.printf(RECORD, name1, age1, white, darkYellow, magenta);
        System.out.printf(RECORD, name2, age2, white, darkYellow, magenta);
        System.out.printf(DASHLINE, darkYellow);
        //System.out.printf();

        
    }
    
}
