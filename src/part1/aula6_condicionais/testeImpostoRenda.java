package part1.aula6_condicionais;

public class testeImpostoRenda {

    public static void main(String[] args) {

        double salario = 3000.0;

        if (salario < 1900 || salario > 4664) {

            System.out.println("Erro, o salario deve estar entre 1900 R$ e 4664 R$");

        } else if (salario >= 1900 && salario <= 2800) {

            System.out.println("A sua aliquota é de 7%");
            System.out.println("Você pode deduzir até R$ 142");

        } else if (salario > 2800 && salario <= 3751) {

            System.out.println("A sua aliquota é de 15%");
            System.out.println("Você pode deduzir até R$ 350");

        } else if (salario > 3751 && salario <= 4664) {

            System.out.println("A sua aliquota é de 22.5%");
            System.out.println("Você pode deduzir até R$ 636");

        }
    }
}
