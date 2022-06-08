import java.util.ArrayList;
public class MusicTransposer {
  private static ArrayList<Integer> newMusic = new ArrayList<Integer>();
  
  public static ArrayList<Integer> transpose(ArrayList<Integer> musicSheet, int key, int newKey) {
    int difference = Math.abs(newKey-key);
    for(int i = 0; i < musicSheet.size(); i++) {
      newMusic.add(musicSheet.get(i)+difference);
      System.out.println(musicSheet.get(i)+difference);
    }
    return newMusic;
    
    
    
  }
}