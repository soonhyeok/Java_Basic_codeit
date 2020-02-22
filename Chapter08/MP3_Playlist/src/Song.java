public class Song {
    private final String text;
    private final Artist artist;
    private final Album album;

    public Song(String text, Artist artist, Album album) {
        this.text = text;
        this.artist = artist;
        this.album = album;
    }

    public String toString() {
        return text + " - " + artist.getName() + "\n" + album.getTitle() + "(" + album.getYear() + ")";
    }
}
