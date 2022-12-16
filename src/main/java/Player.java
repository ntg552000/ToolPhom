import com.sun.source.tree.Tree;
import lombok.Data;

import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;
import java.util.*;

@Data
public class Player {
    private Integer[][] rateTable = new Integer[5][14];
    private int numOfCards;
    private List<RateDependence> rateDependencies = new ArrayList<>();

    public Player(){
        for(int i=1;i<5;i++) {
            for (int j = 0; j < 14; j++) {
                rateTable[i][j] = 1;
            }
        }
    }


}
