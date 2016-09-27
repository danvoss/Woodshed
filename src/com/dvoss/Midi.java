package com.dvoss;

import javax.sound.midi.*;

/**
 * Created by Dan on 9/27/16.
 */
public class Midi {

    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();

        MidiChannel[] mc = synth.getChannels();
        mc[1].noteOn(60, 100);
        Thread.sleep(2000);
        mc[1].noteOff(60);

        synth.close();
    }
}
