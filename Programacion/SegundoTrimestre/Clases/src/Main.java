//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Television tv1 = new Television("LG", "LG-756", 3452f);
        Television tv2 = new Television("HUAWUEI", "HUAWEI-645", 2342f);
        Television tv3 = new Television("TOSHIBA");
        Television tv4 = new Television("SAMSUMG", "SAMSUMG-098");
        Television tv5 = new Television();
        System.out.println(tv3.getModelo().length());
    }
}
