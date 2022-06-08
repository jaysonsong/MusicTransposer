public class Rests {
  private String[] rests;
  
  public Rests() {
    this.rests = new String[12];
  }
  //gives the array of rests
  public String[] getRest() {
    return this.rests;
  }
  //the amount of rests that exist
  public int length() {
    return 12;
  }
  //code to create all types of rests
  public String[] createRests() {
    for(int i = 0; i < rests.length; i++) {
      if(i == 0) {
        rests[i] = "thirty-second rest";
      }
      else if(i == 1) {
        rests[i] = "thirty-second rest with dot";
      }
      else if(i == 2) {
        rests[i] = "sixteenth rest";
      }
      else if(i == 3) {
        rests[i] = "sixteenth rest with dot";
      }
      else if(i == 4) {
        rests[i] = "eighth rest";
      }
      else if(i == 5) {
        rests[i] = "eighth rest with dot";
      }
      else if(i == 6) {
        rests[i] = "quarter rest";
      }
      else if(i == 7) {
        rests[i] = "quarter rest with dot";
      }
      else if(i == 8) {
        rests[i] = "half rest";
      }
      else if(i == 9) {
        rests[i] = "half rest with dot";
      }
      else if(i == 10) {
        rests[i] = "whole rest";
      }
      else if(i == 11) {
        rests[i] = "whole rest with dot";
      } 
    }
    return rests;
  }
}