import java.util.ArrayList;

public class Artist {
    private final String name;
    private final ArrayList<Album>albumList = new ArrayList<>();

    public Artist(String name) {
        this.name = name;
    }

    public void addAlbum(Album album) {
        albumList.add(album);
    }

    public ArrayList<Album> getAlbums() {
        return albumList;
    }

    public String getName() {
        return name;
    }
}
