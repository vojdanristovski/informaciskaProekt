import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Candidates {
    Map<Integer, String> candidates;

    public Candidates() {
        candidates = new HashMap<>();
    }
    public void addCandidate(String partyName, int partyNumber){
        candidates.putIfAbsent(partyNumber, partyName);
    }
    public List<Integer> getAllPartyNumbers(){
        return new ArrayList<>(candidates.keySet());
    }
}
