package CompositePattern;

abstract class SongComponent {
    public void addComponent(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    public void removeComponent(SongComponent songComponent) {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int componentIdx) {
        throw new UnsupportedOperationException();
    }

    public String getSongName() {
        throw new UnsupportedOperationException();
    }

    public String getBrandName() {
        throw new UnsupportedOperationException();
    }

    public String getReleaseYear() {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo() {
        throw new UnsupportedOperationException();
    }
}
