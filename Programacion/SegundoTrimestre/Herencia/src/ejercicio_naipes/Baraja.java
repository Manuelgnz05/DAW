package ejercicio_naipes;

public final class Baraja {

    private static int contador = 0;
    private Carta[] baraja = new Carta[40];
    private Carta[] monton = new Carta[40];

    public Baraja() throws NumeroInvalidoException {
        int contador1 = 0;
        int contador2 = 10;
        int contador3 = 20;
        int contador4 = 30;
        for (int i = 0; i < 12; i++, contador1++) {
            baraja[contador1] = new Carta(i+1, Palo.OROS);
            if (i == 6){
                i += 2;
            }
        }
        for (int i = 0; i < 12; i++, contador2++) {
            baraja[contador2] = new Carta(i+1, Palo.ESPADAS);
            if (i == 6){
                i += 2;
            }
        }
        for (int i = 0; i < 12; i++, contador3++) {
            baraja[contador3] = new Carta(i+1, Palo.COPAS);
            if (i == 6){
                i += 2;
            }
        }
        for (int i = 0; i < 12; i++, contador4++) {
            baraja[contador4] = new Carta(i+1, Palo.BASTOS);
            if (i == 6){
                i += 2;
            }
        }
    }

    public void mostrarBaraja(){
        for (int i = 0; i < baraja.length; i++) {
            System.out.println(baraja[i]);
        }
    }

    public void barajar(){
        for (int i = 0; i < 88; i++) {
            int random1 = (int) (Math.random() * 40);
            int random2 = (int) (Math.random() * 40);
            if (random1 != random2){
                Carta tmp = baraja[random1];
                baraja[random1] = baraja[random2];
                baraja[random2] = tmp;
            }
        }
    }

    public Carta darCarta() throws CartasInsuficientesException {
        if (contador <= 40){
            Carta res = baraja[contador];
            contador++;
            return res;
        }else {
           throw new CartasInsuficientesException("No hay mas cartas.");
        }
    }

    public int cartasDisponibles(){
        return 40 - contador;
    }

    public Carta[] darCartas(int numCartas) throws CartasInsuficientesException {
        Carta[] res = new Carta[numCartas];
        if (numCartas > this.cartasDisponibles()){
            throw new CartasInsuficientesException("No hay suficientes cartas");
        }else{
            for (int i = 0; i < numCartas; i++, contador++) {
                res[i] = baraja[contador];
            }
        }
        return res;
    }

}
