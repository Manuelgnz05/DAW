import javax.sound.midi.*;

public class MIDI {
    public class ConfiguracionMusical {

        //PARTE 1
        //Analice el código y desarrolle una clase MIDI con (siga el siguiente orden):
        //- Variables públicas, finales y estáticas de tipo int. Una por cada instrumento que su
        //equipo pueda tocar (elija diez como máximo).
        //- Variables públicas, finales y estáticas de tipo int. Una por cada nota que su equipo pueda
        //tocar (escala musical de DO a DO MAYOR como mínimo).
        //- Todos los métodos estáticos de prueba que se le han proporcionado.
        //- Un método estático adicional, de nombre esInstrumentoValido, que recibe un String con
        //el nombre de un instrumento y devuelve un boolean comprobando si está dentro de los
        //válidos.
        //- Un método estático adicional, de nombre esNotaValida, que recibe un int con el valor de
        //una nota y devuelve un boolean comprobando si está dentro de las válidas.
        //- Un método estático adicional, de nombre tocarSemicorchea, que recibe un int con el
        //valor de una nota, la toca y luego espera el tiempo necesario (100000).
        //- Un método estático adicional, de nombre tocarCorchea, que recibe un int con el valor de
        //una nota, la toca y luego espera el tiempo necesario (300000).
        //- Todas las notas estarán en ON la misma cantidad de tiempo (100000).
        //- Un método estático adicional, de nombre tocarCumpleaños, que toque las primeras
        //notas de dicha melodía.

        public static final int PIANO_ACUSTICO = 0;
        public static final int XILOFONO = 13;
        public static final int GUITARRA = 24;
        public static final int BAJO_ELECTRICO = 33;
        public static final int VIOLIN = 40;
        public static final int TROMPETA = 56;
        public static final int SAXO = 66;
        public static final int FLAUTA = 73;
        public static final int SINTETIZADOR = 89;
        public static final int BATERIA = 118;

        public static final int DO = 60;
        public static final int RE = 62;
        public static final int MI = 64;
        public static final int FA = 65;
        public static final int SOL = 67;
        public static final int LA = 69;
        public static final int SI = 71;
        public static final int DO_MAYOR = 72;

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

        public static String[] instrumentos = {"PIANO_ACUSTICO", "XILOFONO", "GUITARRA", "BAJO_ELECTRICO", "VIOLIN", "TROMPETA", "SAXO_TENOR", "SAXO", "FLAUTA", "SINTETIZADOR", "BATERIA"};
        public static boolean esInstrumentoValido(String instrumento){
            for (int i = 0; i < instrumentos.length; i++) {
                if(instrumento.equals(instrumentos[i]));
                return true;
            }
            return false;
        }

        public static int[] valoresNotas = {60, 62, 64, 65, 67, 69, 71, 72};
        public static boolean esNotaValida(int valorNota){
            for (int i = 0; i < valoresNotas.length; i++) {
                if(valorNota == valoresNotas[i]){
                    return true;
                }
            }
            return false;
        }

        public static void tocarSemicorchea(MidiChannel canal, int nota) {
            if (esNotaValida(nota)) {
                canal.noteOn(nota, 100);
                esperar(100000);
                canal.noteOff(nota);
                esperar(100000);
            }
        }
        public static void tocarCorchea(MidiChannel canal, int nota) {
            if (esNotaValida(nota)) {
                canal.noteOn(nota, 100);
                esperar(100000);
                canal.noteOff(nota);
                esperar(300000);
            }
        }
        public static void tocarCumpleaños(MidiChannel canal) {
            tocarSemicorchea(canal, SOL);
            tocarSemicorchea(canal, SOL);
            tocarCorchea(canal, LA);
            tocarCorchea(canal, SOL);
            tocarCorchea(canal, DO_MAYOR);
            tocarCorchea(canal, SI);
        }
    }
}
