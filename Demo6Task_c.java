public class Demo6Task_c {
    public static void main(String[] args) {
        
              
        String city1 = "Los Angeles";
        String city2 = "California";
        String city3 = "\033[32mNew \033[0mYork";
        //String city3 = "\033[32mNew \033[0mYork";
        String city4 = "York";

        String darkYellow = "\033[33m";
        String reset = "\033[0m";
        String white = "\033[37;1m";
        String magenta = "\033[95m";

        int population1=3966936;
        int population2=8336817;



        final String DASHLINE = "%s+-----------------+-------------+--------------+\n";

        System.out.printf(DASHLINE,darkYellow);
        System.out.printf("| %4$s%-16s%5$s%6$s| %4$s%-12s%5$s%6$s| %4$s%-13s%5$s%6$s|\n", "CITY","STATE","POPULATION",white,reset,darkYellow);
        System.out.printf(DASHLINE,darkYellow);
        System.out.printf("| %4$s%-16s%5$s| %4$s%-12s%5$s| %4$s%6$s%,-13d%5$s|\n",city1,city2,population1,reset,darkYellow,magenta);
        System.out.printf("| %1$s%4$s        | %1$s%4$s    | %3$s%5$s%2$,-13d%4$s%4$s%3$s|\n", city3,population2,reset,darkYellow, magenta);
        System.out.printf(DASHLINE,darkYellow);

        
    }   
}
