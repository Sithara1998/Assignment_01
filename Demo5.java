public class Demo5 {
    public static void main(String[] args) {

        int isbnNumber1 =978;
        int isbnNumber2 =3;
        int isbnNumber3 =16;
        int isbnNumber4 = 1484100;

        final String COLOR = "\033[" ;
        final String RESET = "\033[0m";

        System.out.printf("ISBN _Number = %5$s35m%d%6$s-%5$s34m%d%6$s-%5$s33m%d%6$s-%5$s32m%d%6$s\n", isbnNumber1,isbnNumber2,isbnNumber3,isbnNumber4,COLOR,RESET);
        
    }
    
}
