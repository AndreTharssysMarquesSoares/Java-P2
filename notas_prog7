import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variaveis 
        int maior_nota = 0;
        int menor_nota = 0;
        int soma_notas = 0;
        int quant_alunos = 0;
        int notas_maior_setescentos= 0;
        int notas_menor_setescentos= 0;

        // laços
        while (true) {
            String aluno = sc.nextLine();
            if (aluno.equals("-")) {  // conferindo break
                break;
            } else { 
                String[] aluno01 = aluno.split(" ");   // separando nota de aluno
                String nota_str = aluno01[1];     // salvando nota em uma variavel
                int nota = Integer.parseInt(nota_str);   // passando para int

                //somatorio
                quant_alunos += 1;
                soma_notas += nota;

                // comparando notas
                if (quant_alunos == 1) {
                    maior_nota = nota;
                    menor_nota = nota;
                } else if (nota > maior_nota) {
                    maior_nota = nota;
                } else if (nota < menor_nota) {
                    menor_nota = nota;
                }

                //maior ou menor que 700

                if (nota >= 700) {
                    notas_maior_setescentos += 1;
                } else {
                    notas_menor_setescentos += 1;
                }
            }
        }

        // calculo media
        float media = soma_notas / quant_alunos;

        //prints
        System.out.println("maior: " + maior_nota);
        System.out.println("menor: " + menor_nota);
        System.out.println("media: " + String.format("%.00f", media));
        System.out.println("acima: " + notas_maior_setescentos);
        System.out.println("abaixo: " + notas_menor_setescentos);

        sc.close();
    }
}
