
import java.util.Scanner;

public class Beecrowd1067 {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        //declarar variável
        int X;
        //ler variável
        X = scanner.nextInt();
        //verificar se o número é par e mostrar no console
        for(int i = 1;i<=X;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
