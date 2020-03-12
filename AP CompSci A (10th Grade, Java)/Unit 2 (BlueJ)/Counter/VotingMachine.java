public class VotingMachine {
    private int numRepVotes;
    private int numDemVotes;
    
    public void voteRep (){
        numRepVotes++;
    }
    public void voteDem (){
        numDemVotes--;
    }
    public void reset (){
        numRepVotes = 0;
        numDemVotes = 0;
    }
    public int getRepVotes(){
        return numRepVotes;
    }
    public int getDemVotes(){
        return numDemVotes;
    }
}