import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // objeto
        Classe compa = new Classe();
        //variavel para o 1º while
        int k = 1;
        JOptionPane.showMessageDialog(null, "Bem vindo ao adivinha números");
        while (k == 1){
            int opção = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU INICIAL \n[1] Jogar \n[2] Sair"));
            switch (opção){
                case 1:
                    //variavel para o 2º while
                    int x = 1;
                    //numero de referência de vezes
                    int cont = 0;
                    //numero aleatorio
                    int numeroAleatorio = compa.numero();
                    JOptionPane.showMessageDialog(null, "Vamos lá!!!");
                    while (x == 1)
                    {
                        cont += 1;
                        if (cont <= 5)
                        {
                            int pergunta = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor de 0 - 100:"));
                            switch (compa.comparacao(numeroAleatorio, pergunta))
                            {
                                case 1:
                                    JOptionPane.showMessageDialog(null, "Parabéns você acertou!!!");
                                    x = 0;
                                    break;
                                case 2:
                                    JOptionPane.showMessageDialog(null, "O numero é maior");
                                    break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "O número é menor");
                                    break;
                            }

                        } else
                        {
                            JOptionPane.showMessageDialog(null, "Infelizmente você perdeu, o número era " + numeroAleatorio);
                            x = 0;
                        }
                    }
                    break;
                case 2:
                    k = 0;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Inválido");
            }
        }

    }
}