import java.util.Scanner;

public class programa6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String nomes = sc.nextLine();
            if (nomes.equals("wally")) {
                break;
            } else {
                String[] lista_nomes = nomes.split(" ");
                String nome_possivel = "?";
                for (int i = 0; i < lista_nomes.length; i++) {
                    String nome_teste = lista_nomes[i];
                    if ( nome_teste.length() == 5) {
                        nome_possivel = nome_teste;
                    }
                }
                System.out.println(nome_possivel);
            }
        }
         sc.close();        
    }
}
