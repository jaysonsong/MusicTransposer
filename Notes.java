public class Notes {
  private int[] notes;
  
  public Notes() {
    this.notes = new int[88];
  }
  
  public int[] getNote() {
    return this.notes;
  }

  public int length() {
    return 88;
  }
  //Code to create all notes
  public int[] createNotes() {
    for(int i = 0; i < notes.length; i++) {
      notes[i] = i;
      // if(i%11 == 0) {
      //   notes[i] = "A";
      // }
      // else if(i%11 == 1) {
      //   notes[i] = "Bb";
      // }
      // else if(i%11 == 2) {
      //   notes[i] = "B";
      // }
      // else if(i%11 == 3) {
      //   notes[i] = "C";
      // }
      // else if(i%11 == 4) {
      //   notes[i] = "Db";
      // }
      // else if(i%11 == 5) {
      //   notes[i] = "D";
      // }
      // else if(i%11 == 6) {
      //   notes[i] = "Eb";
      // }
      // else if(i%11 == 7) {
      //   notes[i] = "E";
      // }
      // else if(i%11 == 8) {
      //   notes[i] = "F";
      // }
      // else if(i%11 == 9) {
      //   notes[i] = "Gb";
      // }
      // else if(i%11 == 10) {
      //   notes[i] = "G";
      // }
    }
    return notes;
  }
  
}