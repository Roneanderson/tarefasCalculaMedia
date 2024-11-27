public static void main(String[] args) {
    /** Exercicio 01:
     * O programa calculara a media do aluno junto com suas notas obtidas
     */

    Scanner informarNotas = new Scanner(System.in); {
        float nota1, nota2, nota3, nota4, media;

        System.out.println("Informar as 4 notas: ");

        nota1 = informarNotas.nextFloat();
        nota2 = informarNotas.nextFloat();
        nota3 = informarNotas.nextFloat();
        nota4 = informarNotas.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas è: "+media);
    }
}

