package FundementalLesseons.Mehtods.toString;

public class SongTester {
    
    public static void main(String[] args){

        Song a = new Song("Enter Sandman", "Metallica");
        
        a.play();
        a.play();
        a.play();
        a.play();
        a.getStreams();
        a.getStars();

        System.out.println(a);
    }
}
