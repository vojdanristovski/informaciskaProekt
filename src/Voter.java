import java.security.NoSuchAlgorithmException;

public class Voter extends User {
    private int voteParty;

    public Voter(String name, String lastname, String ssn){
        super(name,lastname,ssn);
    }

    public void vote(int partyNumber){
        this.voteParty=partyNumber;
    }
}
