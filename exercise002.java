public class Main{
    public static void main(String[] args) {
        //lab002 -exercise 02

        if(args.length ==3) {
            System.out.println("DIST no     :" + args[0]);
            System.out.println("Name        :" + args[1]);
            System.out.println("District    :" + args[2]);
        }
        else
            System.out.println("invalid argument length\n Current length  "+args.length);
    }
}
