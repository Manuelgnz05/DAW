import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("Manuel");
        lista.add("Manuel");
        lista.add("Manuel");
        lista.add("Marcos");
        lista.add("Ocaña");
        System.out.println(lista.size());

        for (String s:lista){
            System.out.println(s);
        }

        for(int i=0; i<lista.size()-1;i++){
            System.out.println(lista.get(i));
        }

    }
}