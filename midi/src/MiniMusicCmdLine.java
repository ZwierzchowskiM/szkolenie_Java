import javax.sound.midi.*;
import java.util.Scanner;

import static javax.sound.midi.ShortMessage.*;

public class MiniMusicCmdLine {
    public static void main(String[] args) {
        MiniMusicCmdLine mini = new MiniMusicCmdLine();

            int instrument = 9;
            int note = 44;
            mini.play(instrument, note);

    }


    public void play(int instrument, int note) {
        try {
            Sequencer player = MidiSystem.getSequencer();
            player.open();
            Sequence seq = new Sequence(Sequence.PPQ, 4);
            Track track = seq.createTrack();

            ShortMessage msg0 = new ShortMessage();
            msg0.setMessage(PROGRAM_CHANGE, 1, instrument, 100);
            MidiEvent changeInstrument = new MidiEvent(msg0, 1);
            track.add(changeInstrument);

            ShortMessage msg1 = new ShortMessage();
            msg1.setMessage(NOTE_ON, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(msg1, 1);
            track.add(noteOn);

            ShortMessage msg2 = new ShortMessage();
            msg2.setMessage(NOTE_OFF, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(msg2, 3);
            track.add(noteOff);

            player.setSequence(seq);

            player.start();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


}