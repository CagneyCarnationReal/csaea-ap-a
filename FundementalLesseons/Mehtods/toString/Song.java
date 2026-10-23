package FundementalLesseons.Mehtods.toString;

public class Song {
    
    private String title;
    private String artist;
    private int streams;

    public Song(String title, String artist){

        this.title = title;
        this.artist = artist;
        streams = 0;

    }

    public void play(){
        streams++;
    }

    public int getStreams(){
        System.out.println(streams);
        return streams;
    }

    public String toString(){
        
        if (streams > 1){
            return title + " by " + artist + " - " + streams + " streams";
        }
        else{
            return title + " by " + artist + " - " + streams + " stream";
        }
     
    }

    public void getStars(){
        int x = 0;
        String y = "";
        while(x < streams){
            y = y + "*";
            x++;
        }
        System.out.println(y);
    }

}
