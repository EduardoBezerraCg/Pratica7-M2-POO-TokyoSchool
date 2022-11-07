package CondicionalSwitch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("entre 1 a 10, avalie o nivel do serviço utilizado");
        String saida;
        int numero = entrada.nextInt();

        switch (numero){
            case 1:
                saida = "insuficiente";
                break;
            case 2:
                saida = "insuficiente";
                break;
            case 3:
                saida = "Suficiente";
                break;
            case 4:
                saida = "Suficiente";
                break;
            case 5:
                saida = "Bom";
                break;
            case 6:
                saida = "Bom";
                break;
            case 7:
                saida = "Notável";
                break;
            case 8:
                saida = "Notável";
                break;
            case 9:
                saida = "Muito Bom";
                break;
            case 10:
                saida = "Muito Bom";
                break;
            default:
                saida = "O numero náo existe";
        }
        System.out.println("A nota ao serviço utilizado é: " + saida);
    }
}
