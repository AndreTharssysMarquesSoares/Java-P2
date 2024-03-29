import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public interface acima_da_media {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str_lista = sc.nextLine();                       // input
        String[] new_lista = str_lista.split(" ");              // split
        List <Integer> lista_nums = new ArrayList < >();        // lista vazia
        float soma = 0;

        for (int i = 0; i < new_lista.length; i++) {
            int num = Integer.parseInt(new_lista[i]);            // passar str pra int
            lista_nums.add(num);                                 // add na lista vazia
            soma += num;                                         // calculando a soma
        }
        
        float media = soma / new_lista.length;                 // calculo media 
        StringBuilder result = new StringBuilder();
        boolean cond = true;

        for (int j = 0; j < new_lista.length; j++) {
            if (lista_nums.get(j) > media) {
                if (cond == true) {
                    result.append(lista_nums.get(j));
                    cond = false;
                } else {   
                    result.append(" " + lista_nums.get(j));      
                }
            }
        }

        System.out.println(result); 
    }
}
