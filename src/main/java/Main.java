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
        /*
            - Khởi tạo bảng rate của 3 người chơi còn lại
         */
        Integer[][] rate1 = new Integer[5][14];
        for(int i=1;i<5;i++){
            for(int j=0;j<14;j++){
                rate1[i][j]=1;
            }
        }
        Integer[][] rate2;
        Integer[][] rate3;

        /*
            - Nhập số lượng bài của mình, sau đó nhập từng con bài
            - Các con bài được nhập theo quy luật "chất + tên"
            - Cơ rô tép bích lần lượt là 1 2 3 4
            - Các quân bài bắt đầu từ 1 kết thúc là 13
            - Vd 2 cơ sẽ là 12
        */
        Scanner scanner = new Scanner(System.in);
        int myNumOfCard = scanner.nextInt();
        Integer[] myCards = new Integer[myNumOfCard];
        for(int i=0;i<myNumOfCard;i++){
            myCards[i] = scanner.nextInt();
        }

        /*
            - Xét tỉ lệ của các quân bài của đối phương dựa trên bài của mình
        */
        for(int card: myCards){
            rate1[card/10][card%10] = 0;
        }
        for(int i=1;i<5;i++){
            for(int j=0;j<14;j++){
                if(rate1[i][j]!=0){
//                    rate1[i][j] =
                }
            }
        }

    }
}