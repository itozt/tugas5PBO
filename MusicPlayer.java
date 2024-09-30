public class MusicPlayer {
  private boolean isPlaying;
  private String trackPlaying;

  public MusicPlayer() {
    isPlaying = false;
    trackPlaying = null;
  }

  public void startPlaying(String trackTitle) {
    if (isPlaying) {
      stopPlaying();
      System.out.println();
    }
    trackPlaying = trackTitle;
    isPlaying = true;
    System.out.println("Playing a track : " + trackPlaying);
  }

  public void stopPlaying() {
    if (isPlaying) {
      System.out.println("Stopping the current playing track : " + trackPlaying);
      isPlaying = false;
    } else {
      System.out.println("No track is currently playing.");
    }
  }
}
