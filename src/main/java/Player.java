import lombok.Data;

@Data
public class Player {
    private Integer[][] rateTable = new Integer[5][14];
    private int numOfCards;

    public Player(){
        for(int i=1;i<5;i++){
            for(int j=0;j<14;j++){
                rateTable[i][j] = 1;
            }
        }
    }
}
