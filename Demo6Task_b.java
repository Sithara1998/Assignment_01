public class Demo6Task_b {
    public static void main(String[] args) {

        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob" ;
        int age2 = 30;

        String darkYellow = "\033[33m";
        String blue= "\033[34m";
        
        String dashLine = "%s+-----------------+-----+\n";
        String 


        System.out.printf(dashLine, darkYellow);
        System.out.printf("| %3$s%-16s%4$s| %3$s%s%4$s |\n", "NAME", "AGE", blue, darkYellow);
        System.out.printf(dashLine, darkYellow);
        System.out.printf("| %3$s%-16s%4$s|%3$s%4s%4$s |\n", name1, age1, blue, darkYellow);
        System.out.printf("| %3$s%-16s%4$s|%3$s%4s%4$s |\n", name2, age2, blue, darkYellow);
        System.out.printf(dashLine, darkYellow);
        //System.out.printf();

        
    }
    
}
