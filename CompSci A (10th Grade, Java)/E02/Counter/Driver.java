public class Driver {
    public static void main(String[] args){
        VotingMachine vm = new VotingMachine();
        vm.voteRep();
        vm.voteRep();
        vm.voteDem();
        System.out.println(vm.getRepVotes());
        System.out.println(vm.getDemVotes());
        vm.reset();
        System.out.println(vm.getRepVotes());
        System.out.println(vm.getDemVotes());
    }
}