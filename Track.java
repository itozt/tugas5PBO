public class Track {
  public String artist;
  public String title;

  public Track(String title, String artist) {
    this.artist = artist;
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  public String getArtist() {
    return artist;
  }

  public void getDetails() {
    System.out.println("Track title : " + getTitle());
    System.out.println("Track artist : " + getArtist());
  }
}
