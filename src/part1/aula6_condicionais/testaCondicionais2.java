package part1.aula6_condicionais;

public class testaCondicionais2 {
    public static void main(String[] args) {

        System.out.println("testando condicionais");

        int idade = 16;
        int quantidadePessoas = 3;

        if (idade >= 18 || quantidadePessoas >= 2) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente você não pode entrar");
        }
    }
}
