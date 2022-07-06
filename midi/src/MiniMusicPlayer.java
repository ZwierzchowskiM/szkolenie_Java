import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;
import javax.swing.*;
import java.util.Random;
import java.awt.*;

public class MiniMusicPlayer {
    private MyDrawPanel panel;
    private Random random = new Random();

    public static void main(String[] args) {

        MiniMusicPlayer mini = new MiniMusicPlayer();
        mini.go();


    }

    public void go(){
        setUpGui();
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            int [] eventsIWant = {127};
            sequencer.addControllerEventListener(panel, eventsIWant);
            Sequence seq = new Sequence(Sequence.PPQ,4);
            Track track = seq.createTrack();

            int note;

            for (int i=0; i<60; i+=4) {
                note = random.nextInt(50) +1;

                track.add (makeEvent (NOTE_ON,1,note,100,i));
                track.add(makeEvent(CONTROL_CHANGE,1,127,0,i));
                track.add (makeEvent (NOTE_OFF,1,note,100, i+2));
            }

            sequencer.setSequence(seq);
            sequencer.setTempoInBPM(220);
            sequencer.start();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static MidiEvent makeEvent ( int cmd, int chn1, int one, int two, int tick) {
        MidiEvent event = null;
        try {
            ShortMessage msg = new ShortMessage();
            msg.setMessage(cmd, chn1, one, two);
            event = new MidiEvent(msg, tick);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return event;
    }

    public void setUpGui() {
    JFrame frame = new JFrame("My first video");
    panel = new MyDrawPanel();
    frame.setContentPane(panel);
    frame.setBounds(30,30,300,300);
    frame.setVisible(true);
}

}
