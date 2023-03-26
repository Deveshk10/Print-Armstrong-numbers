import java.util.Scanner;

public class Armstrong_Number_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your range:");
        int range=sc.nextInt();
        System.out.println("Armstrong numbers from 0 to "+range+" are:");

        for (int i = 0; i <range ; i++) {
            if(i<10 && i>=0 ){
                continue;
            }
            String s=Integer.toString(i);
            int pow=s.length();

            if(isArmstrong(Integer.parseInt(s),pow)){
                System.out.println(i);
            }
        }
    }
    static boolean isArmstrong(int n,int power){
        int rem,sum=0;
        int copy=n;
        while (copy>0){
            rem=copy%10;
            copy=copy/10;
            sum=(int)(sum+Math.pow(rem,power));
        }
        return sum==n;
    }
}
