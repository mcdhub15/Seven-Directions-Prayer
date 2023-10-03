import java.util.ArrayList;
import java.util.Scanner;

//import com.sun.speech.freetts.Voice;
//import com.sun.speech.freetts.VoiceManager;

class SevenDirections {
  public static void main(String[] args) {

// ####### Array ###################
    
    ArrayList<String> prayer = new ArrayList<>();

    prayer.add("This is the sunrise and the direction of new beginnings, hope, promise, and potential.");
    prayer.add("This is the direction of warmth, growth, creativity and productivity.");
    prayer.add("This is the sunset and the direction of rest, our dream lives, and of closure.");
    prayer.add("This is the direction of strength, courage, fortitude, focus, clarity and purpose.");
    prayer.add("This is the direction of Father Sky. May our heart, mind, soul, and spirit always look towards Him.");
    prayer.add("This is the direction of Mother Earth. May everything we do, honor and reverence her.");
    prayer.add("May we be true to the Spirit of God, (Father, Son & Holy Spirit) that dwells within us. Amen..");
    
// ###########################################
    
    Scanner scanner = new Scanner(System.in);
    System.out.print("Please enter a direction ! (EAST, SOUTH, WEST, NORTH, UPWARD, DOWNWARD, INWARD): ");
    String userInput = scanner.nextLine();
    
    Direction user = Direction.valueOf(userInput.toUpperCase());

    if (user != null){
      System.out.println("Welcome to the Indigenous 7 Direction Prayer!");
      System.out.println("Let’s start with the sign of our faith. In the name of the Father, Son, and Holy Spirit.");

      System.out.println(" - " + user + " - " + prayer.get(user.ordinal()));

      
    } else{
      System.out.println("Not a valid direction.. Please restart..");
        }

    
/*
public static void speak(String ..){
    VoiceManager vm = VoiceManager.getInstance();
    Voice v = voiceManager.getVoice("kevin16");

    if (voice != null){
      voice.allocate();
      voice.speak();
      voice.deallocate();

      
    } else{
    System.out.println("TTS Error.. Restart program.");
    }
  ???????? not big brain enough to add text to speech :C
}
*/
    
     }
  }