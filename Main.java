import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Notes notes = new Notes();
    Rests rests = new Rests();
    int[] all_notes = notes.createNotes();
    System.out.println("Please refer to these notes when inputting the original music");
    for(int i = 0; i < all_notes.length; i++) {
      if(i%11 == 0) {
        System.out.println(all_notes[i]);
        System.out.println("A");
      }
      else if(i%11 == 1) {
        System.out.println(all_notes[i]);
        System.out.println("Bb");
      }
      else if(i%11 == 2) {
        System.out.println(all_notes[i]);
        System.out.println("B");
      }
      else if(i%11 == 3) {
        System.out.println(all_notes[i]);
        System.out.println("C");
      }
      else if(i%11 == 4) {
        System.out.println(all_notes[i]);
        System.out.println("Db");
      }
      else if(i%11 == 5) {
        System.out.println(all_notes[i]);
        System.out.println("D");
      }
      else if(i%11 == 6) {
        System.out.println(all_notes[i]);
        System.out.println("Eb");
      }
      else if(i%11 == 7) {
        System.out.println(all_notes[i]);
        System.out.println("E");
      }
      else if(i%11 == 8) {
        System.out.println(all_notes[i]);
        System.out.println("F");
      }
      else if(i%11 == 9) {
        System.out.println(all_notes[i]);
        System.out.println("Gb");
      }
      else if(i%11 == 10) {
        System.out.println(all_notes[i]);
        System.out.println("G");
      }
    }
    String[] all_rests = rests.createRests();
    System.out.println("Please enter the key of the current music.(please enter in form of integers. A = 0, Bb = 1, B = 2, C = 3, Db = 4, D = 5, Eb = 6, E = 7, F = 9, Gb = 10, G = 11)");
    int key = sc.nextInt();
    System.out.println("Please enter the key that you would like to change your music to.(please enter in form of integers. A = 0, Bb = 1, B = 2, C = 3, Db = 4, D = 5, Eb = 6, E = 7, F = 9, Gb = 10, G = 11)");
    int newKey = sc.nextInt();
    ArrayList<Integer> musicSheet = new ArrayList<Integer>();
    while(true) {
      System.out.println("Please enter the note(in terms of numbers) of the music(seperate notes that are on top of each other with commas. When you would like to stop the program please enter 100.):");
      int input = sc.nextInt();
      if(input == 100) {
        break;
      }
      musicSheet.add(input);
    }
    MusicTransposer.transpose(musicSheet, key, newKey);
    
    
    
    
    
    
    
  }
}