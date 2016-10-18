package com.dvoss;

import javax.sound.midi.*;

/**
 * Created by Dan on 9/27/16.
 */
public class Midi {

    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {

        Synthesizer synth = MidiSystem.getSynthesizer();
        synth.open();

        // simple piano middle C
//        MidiChannel[] mc = synth.getChannels();
//        mc[1].noteOn(60, 200);
//        Thread.sleep(2000);
//        mc[1].noteOff(60);

        Soundbank sb = synth.getDefaultSoundbank();
        synth.loadAllInstruments(sb);
        Instrument[] inst = synth.getLoadedInstruments();

        // show list of all instruments:
//        for (int i=0; i<inst.length; i++ ) {
//            System.out.println(inst[i].getName());
//        }

        //set a new instrument (eg, electric piano):
        Patch p = inst[5].getPatch();
        MidiChannel[] mc = synth.getChannels();
        mc[1].programChange(p.getBank(), p.getProgram());
        mc[1].noteOn(60, 200);
        Thread.sleep(2000);
        mc[1].noteOff(60);

        synth.close();
    }
}
