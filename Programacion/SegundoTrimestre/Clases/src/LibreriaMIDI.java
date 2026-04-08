import javax.sound.midi.*;

import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

    /**
     *
     * @author jorgejuanmunozmorera
     */
    public class LibreriaMIDI {

        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            try {
                Synthesizer synthesizer = MidiSystem.getSynthesizer();
                synthesizer.open();
                imprimirInstrumentos(synthesizer);
                MidiChannel[] channels = synthesizer.getChannels();
                MidiChannel canal = channels[0];
                canal.programChange(0, 13);
                System.out.println(channels.length);
                //tocarEscalaMusical(canal);
                tocarMarioBros(canal);
            } catch (MidiUnavailableException e1) {
                e1.printStackTrace();
            }
        }

        public static void imprimirInstrumentos(Synthesizer synth) {
            Instrument[] instrumentos = synth.getAvailableInstruments();
            for(int i=0; i<instrumentos.length; i++) {
                System.out.println(instrumentos[i]);
            }
        }

        private static void tocarEscalaMusical(MidiChannel canal) {
            canal.noteOn(60, 100); // DO
            esperar(300000);
            canal.noteOff(60);

            esperar(300000);

            canal.noteOn(62, 100); // RE
            esperar(300000);
            canal.noteOff(62);

            esperar(300000);

            canal.noteOn(64, 100); // MI
            esperar(300000);
            canal.noteOff(64);

            esperar(300000);

            canal.noteOn(65, 100); // FA
            esperar(300000);
            canal.noteOff(65);

            esperar(300000);

            canal.noteOn(67, 100); // SOL
            esperar(300000);
            canal.noteOff(67);

            esperar(300000);

            canal.noteOn(69, 100); // LA
            esperar(300000);
            canal.noteOff(69);

            esperar(300000);

            canal.noteOn(71, 100); // SI
            esperar(300000);
            canal.noteOff(71);

            esperar(300000);

            canal.noteOn(72, 100); // DO MAYOR
            esperar(300000);
            canal.noteOff(72);

            esperar(300000);
        }

        private static void tocarMarioBros(MidiChannel canal) {
            canal.noteOn(76, 100); // MI MAYOR
            esperar(100000);
            canal.noteOff(76);

            esperar(100000);

            canal.noteOn(76, 100); // MI MAYOR
            esperar(100000);
            canal.noteOff(76);

            esperar(300000);        // ESPERAR 0,3 SEGUNDOS

            canal.noteOn(76, 100); // MI MAYOR
            esperar(100000);
            canal.noteOff(76);

            esperar(300000);

            canal.noteOn(72, 100); // DO MAYOR
            esperar(100000);
            canal.noteOff(72);

            esperar(100000);

            canal.noteOn(76, 100); // MI MAYOR
            esperar(100000);
            canal.noteOff(76);

            esperar(350000);

            canal.noteOn(79, 100); // SOL MAYOR
            esperar(100000);
            canal.noteOff(79);

            esperar(750000);

            canal.noteOn(67, 100); // SOL
            esperar(300000);
            canal.noteOff(67);

            esperar(500000);

        }

        public static void esperar(long micro){
            long waitUntil = System.nanoTime() + (micro * 1_000);
            while(waitUntil > System.nanoTime()){
                ;
            }
        }

    }
