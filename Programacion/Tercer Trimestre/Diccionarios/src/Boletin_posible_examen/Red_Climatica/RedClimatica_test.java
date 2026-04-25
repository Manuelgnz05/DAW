package Boletin_posible_examen.Red_Climatica;

import Boletin_posible_examen.CiudadException;

public class RedClimatica_test {

    static void main() {
        RedClimatica registro = new RedClimatica();
        registro.regitrarValor("Sevilla", 32);
        registro.regitrarValor("Sevilla", 35);
        registro.regitrarValor("Sevilla", 22);
        registro.regitrarValor("Sevilla", 37);
        registro.regitrarValor("Sevilla", 12);
        registro.regitrarValor("Madrid", 15);
        registro.regitrarValor("Madrid", 19);
        registro.regitrarValor("Madrid", 22);
        System.out.println(registro);
        try {
            System.out.println(registro.consultarTempCiudad("Sevilla"));
            System.out.println(registro.consultarTempCiudad("Madrid"));
        } catch (CiudadException e) {
            throw new RuntimeException(e);
        }

        try {
            System.out.println(registro.tempMaxYMin("Sevilla"));
            System.out.println(registro.tempMaxYMin("Madrid"));
            System.out.println(registro.tempMaxYMin("Huelva"));
        } catch (CiudadException e) {
            throw new RuntimeException(e);
        }

    }

}
