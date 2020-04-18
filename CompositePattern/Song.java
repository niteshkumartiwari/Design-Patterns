package CompositePattern;

public class Song extends SongComponent {
    String songName;
    String bandName;
    int releaseDate;

    public Song(String songName, String bandName, int releaseDate) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseDate = releaseDate;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getSongName() + " was recorded by " + getBandName() + " in " + getReleaseDate());
        super.displaySongInfo();
    }
}