import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static long tinhGiaiThua(int n){
        long ketQua=1;
        int i;
        for(i=2;i<=n;i++)
        {
            ketQua*=i;
        }
        return ketQua;
    }

    public static long tinhToHop(int k,int n){
        return tinhGiaiThua(n)/(tinhGiaiThua(k)*tinhGiaiThua(n-k));
    }

    public static long tinhChinhHop(int k,int n) {
        return tinhGiaiThua(n)/tinhGiaiThua(n-k);
    }

    public static float getPreRate(int myNumOfCard){
        int numOfCardThatIsNotYourCard = 52 - myNumOfCard;
        int numOfTheirCard = 37 - myNumOfCard;
        return 0;
    }

    public static void main(String[] args) {
        Player[] a = new Player[3];
        for(Player i:a){
            System.out.println(i.getNumOfCards());
        }

    }
}