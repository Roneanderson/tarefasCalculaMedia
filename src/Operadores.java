public class Operadores {

    public static void main(String[] args) {
        operacoesSomar();
        operacoesSubtarir();
        operacoesDividir();
        operacoesMultiplicar();
    }
    //operação somar
    private static void operacoesSomar() {
        System.out.println("**** operação de somar ****");
        int numero1 = 10;
        int numero2 = 10;
        int somar = (numero1 + numero2) / 4;
        System.out.println("O valor e " + somar);
    }

    //operação subtarir
    private static void operacoesSubtarir() {
        System.out.println("**** operação de subtração ****");
        int numero1 = 50;
        int numero2 = 10;
        int subtarir = (numero1 - numero2) / 4;
        System.out.println("O valor e " + subtarir);
    }

    //operação dividir
    private static void operacoesDividir() {
        System.out.println("**** operação de divisão ****");
        int numero1 = 20;
        int numero2 = 5;
        int dividir = (numero1 / numero2) / 4;
        System.out.println("O valor e " + dividir);
    }

    //operação de multiplicar
    private static void operacoesMultiplicar() {
        System.out.println("**** operação de multiplicação ****");
        int numero1 = 10;
        int numero2 = 100;
        int multiplicar = numero1 * numero2 / 4;
        System.out.println("O valor e " + multiplicar);
    }
}
