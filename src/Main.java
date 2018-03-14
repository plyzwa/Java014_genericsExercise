public class Main {

    public static void main(String[] args) {
        VolleyballPlayer pat = new VolleyballPlayer("Patrick");
        HokeyPlayer kam = new HokeyPlayer("Kamil");
        TenisPlayer pet = new TenisPlayer("Peter");

        HokeyPlayer mar = new HokeyPlayer("Daniel");
        HokeyPlayer dan = new HokeyPlayer("Marcin");

        Team<TenisPlayer> mostostal = new Team<>("Mostostal");

        //mostostal.addPlayer(pat);
        //mostostal.addPlayer(kam);
        mostostal.addPlayer(pet);

        System.out.println(mostostal.howmanyPlayers());

        Team<HokeyPlayer> hockeyStars = new Team<>("HockeyStars");
        hockeyStars.addPlayer(kam);
        System.out.println(hockeyStars.howmanyPlayers());

        Team<HokeyPlayer> hockeys = new Team<>("Hockeys");
        hockeys.addPlayer(mar);
        hockeys.addPlayer(dan);
        System.out.println(hockeys.howmanyPlayers());



    }
}
