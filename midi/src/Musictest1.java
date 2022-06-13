import javax.sound.midi.*;

public class Musictest1 {

    public void play(){
            try {
                Sequencer sequencer = MidiSystem.getSequencer();
                System.out.println("OK");
            }
            catch (MidiUnavailableException e) {
                System.out.println("NOK");
            }
    }

    public static void main(String[] args) {

            new Musictest1().play();

    }
}
