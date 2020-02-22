import java.util.ArrayList;

public class Album {
    private final String title;
    private final int year;
    private final Artist artist;
    private final ArrayList<Song> songlist = new ArrayList<>();

    public Album(String title, int year, Artist artist) {
        this.title = title;
        this.year = year;
        this.artist = artist;
    }

    public void addTrack(Song song) {
        songlist.add(song);
    }

    public Song getTrack(int num) {
        if(num < 1 || num > songlist.size()) {
            return null;
        }

        return songlist.get(num - 1);
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }
}
