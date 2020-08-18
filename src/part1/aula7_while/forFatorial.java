package part1.aula7_while;

public class forFatorial {
    public static void main(String[] args) {

        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial = fatorial * i;
            System.out.println("Fatorial de " + i + " = " + fatorial);
        }
    }
}
