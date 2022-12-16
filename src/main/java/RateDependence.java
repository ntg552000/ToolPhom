import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RateDependence {
    private int card;
    private List<Integer> dependenceCards = new ArrayList<>();
}
