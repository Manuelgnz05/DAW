public class Prompter {
    public static void main(String[] args) throws InterruptedException{
        String cadena = "El sistema se conectara el \n4 de agosto de 1997, se eliminaran \nlas  " +
                "decisiones humanas en la \ndefensa estrategica, Skynet \naprendera en progresion " +
                "geometrica. \nTendra conciencia de si \nmismo a las 2 y 14 de la \nmadrugada del 29 de " +
                "agosto. \nLos humanos aterrados intentaran desconectarlo.";

        String color_verde = "\u001B[32m";

        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == '.' || cadena.charAt(i) == ','){
                System.out.print(color_verde + cadena.charAt(i));
                Thread.sleep(1000);
            }else{
                System.out.print(color_verde + cadena.charAt(i));
                Thread.sleep(100);
            }
        }
    }
}
