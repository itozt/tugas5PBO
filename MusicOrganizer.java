import java.util.ArrayList;

public class MusicOrganizer {
  private ArrayList<Track> tracks;
  private MusicPlayer player;

  public MusicOrganizer() {
    tracks = new ArrayList<Track>();
    player = new MusicPlayer();
  }

  public void addTrack(Track track) {
    System.out.println("======================================");
    System.out.println("Track is added.");
    tracks.add(track);
    System.out.println("======================================");
  }

  public void getNumberOfTracks() {
    System.out.println("======================================");
    System.out.println("Number of track found : ");
    System.out.println(tracks.size());
    System.out.println("======================================");
  }

  public void listATrack(int index) {
    System.out.println("======================================");
    if (index >= 0 && index < tracks.size()) {
      Track track;
      track = tracks.get(index);

      System.out.println("List Selected Track :");
      track.getDetails();
    } else {
      System.out.println("Error: track not found!");
    }
    System.out.println("======================================");
  }

  public void listAllTracks() {
    System.out.println("======================================");
    System.out.println("Track Listing :");
    System.out.println();

    int index = 0;
    
    for (Track track : tracks) {
      System.out.println("Track index : " + index);
      index++;
      track.getDetails();
      System.out.println();
    }
    System.out.println("======================================");
  }

  public void removeTrack(int index) {
    System.out.println("======================================");
    if (index >= 0 && index < tracks.size()) {
      tracks.remove(index);
      System.out.println("Track removed.");
    } else {
      System.out.println("Error: track not found!");
    }
    System.out.println("======================================");
  }

  public boolean trackSearch(String trackSearch) {
    System.out.println("======================================");
    int index = 0;
    boolean searching = true;

    while (searching && index < tracks.size()) {
      String trackTitle = tracks.get(index).getTitle();
      if (trackTitle.contains(trackSearch)) {
        searching = false;
      } else {
        index++;
      }
    }
    
    if (searching) {
      System.out.println("Searching track not found!");
      System.out.println("======================================");
      return false;
    } else {
      System.out.println("Searching track is found!");
      System.out.println("The index of the track is at " + index);
      System.out.println("======================================");
      return true;
    }
  }

  public void playTrack(int index) {
    System.out.println("======================================");
    if (index >= 0 && index < tracks.size()) {
      Track track = tracks.get(index);
      player.startPlaying(track.getTitle());

      System.out.println();
      System.out.println("Now playing : ");
      track.getDetails();
    } else {
      System.out.println("Error: track not found!");
    }
    System.out.println("======================================");
  }

  public void stopTrack() {
    System.out.println("======================================");
    player.stopPlaying();
    System.out.println("======================================");
  }
}
