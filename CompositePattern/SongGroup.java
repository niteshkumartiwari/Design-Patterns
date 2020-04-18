package CompositePattern;

import java.util.ArrayList;

public class SongGroup extends SongComponent {
    private ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    @Override
    public void addComponent(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    @Override
    public void removeComponent(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    @Override
    public SongComponent getComponent(int componentIdx) {
        return songComponents.get(componentIdx);
    }

    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        for (SongComponent song : songComponents)
            song.displaySongInfo();
    }

}