import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int parametroUm = scanner.nextInt();
        int parametrosDois = scanner.nextInt();
        try{
            contar(parametroUm, parametrosDois);
        }catch(ParametrosInvalidos e){
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println("Somente é aceito valores numéricos");
        }
        scanner.close();
    }
    static void contar(int parametroUm, int parametrosDois)throws Exception{
        if(parametroUm > parametrosDois){
            throw new ParametrosInvalidos("O parametro um não pode ser maior que o parametros dois");
        }
        int contagem = parametrosDois - parametroUm;
        for(int i = 0; i < contagem; i++){
            System.out.println("Imprimindo o numero: "+(i+1));
        }
    }
}
