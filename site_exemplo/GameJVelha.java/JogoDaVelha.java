import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        JogoDaVelha[][] jDV = new JogoDaVelha[3][3];
        Boolean Jogo = true;
        char playerAtual = 'X';
        String gameWin = "";

        Scanner scan = new Scanner(System.in);

        while (Jogo) {

        }

    }

    public static void jogada(JogoDaVelha[][] jDV) {

        System.out.print("          0    1    2%n");
        System.out.printf("0   %c | %C | %c %n", jDV[0][0].getXOrO(),jDV[0][1].getXOrO(),jDV[0][2].getXOrO());
        System.out.printf("0   %c | %C | %c %n", jDV[1][0].getXOrO(),jDV[1][1].getXOrO(),jDV[1][2].getXOrO());
        System.out.printf("0   %c | %C | %c %n", jDV[2][0].getXOrO(),jDV[2][1].getXOrO(),jDV[2][2].getXOrO());
       

    }

}
