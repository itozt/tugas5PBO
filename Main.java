import java.util.Scanner;

public class Main {
  public void showCommands() {
    System.out.println("--------------------------------------");
    System.out.println("Music Organizer Command :");
    System.out.println("0. Show Music Organizer Command");
    System.out.println("1. Add a track");
    System.out.println("2. Get number of track in the list");
    System.out.println("3. List a selected track using index");
    System.out.println("4. List all tracks");
    System.out.println("5. Remove a track using index");
    System.out.println("6. Search a track in the list");
    System.out.println("7. Play a track using index");
    System.out.println("8. Stop playing");
    System.out.println("9. Exit");
    System.out.println("--------------------------------------");
  }

  public static void main(String[] args) {
    Main mainCommands = new Main();
    MusicOrganizer musicApp = new MusicOrganizer();
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;

    mainCommands.showCommands();

    while (!exit) {
      System.out.println();
      System.out.print("Enter command : ");
      int command = scanner.nextInt();

      switch(command) {
        case 0:
          mainCommands.showCommands();
          break;
        case 1:
          scanner.nextLine(); // consume the leftover 'newline' from entering a command

          System.out.print("Enter title track string : ");
          String title = scanner.nextLine();
          System.out.print("Enter artist track string : ");
          String artist = scanner.nextLine();
          
          Track track = new Track(title, artist);
          musicApp.addTrack(track);
          break;
        case 2:
          musicApp.getNumberOfTracks();
          break;
        case 3:
          System.out.print("Enter index to list a track : ");
          int index = scanner.nextInt();
          
          musicApp.listATrack(index);
          break;
        case 4:
          musicApp.listAllTracks();
          break;
        case 5:
          System.out.print("Enter index to remove a track : ");
          index = scanner.nextInt();  
          
          musicApp.removeTrack(index);        
          break;
        case 6:
          scanner.nextLine(); // consume 

          System.out.print("Enter string title pattern to search : ");
          String pattern = scanner.nextLine();
          
          musicApp.trackSearch(pattern);
          break;
        case 7:
          System.out.print("Enter index to play a track : ");
          index = scanner.nextInt();

          musicApp.playTrack(index);
          break;
        case 8:
          musicApp.stopTrack();
          break;
        case 9:
          exit = true;
          break;
        default:
          System.out.println("Invalid command!");
          break;
      }
    }
  }
}
