public class Demo4 {
    public static void main(String[] args) {
        int day     = 28;
        int month   = 12;
        int year    = 2023;
        int hour    = 23;
        int minute  = 59;
        int second  = 59;

        final String COLOR = "\033[" ;
        final String RESET = "\033[0m";

        System.out.printf("%7$s31m%2$d%8$s/%7$s32m%1$d%8$s/%7$s33m%3$d%8$s %7$s34m%4$d%8$s:%7$s35m%5$d%8$s:%7$s36m%6$d%8$s\n", day,month,year,hour,minute,second, COLOR,RESET);
        
    }
    
}
