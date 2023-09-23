import java.util.Random;

public class Classe {
    public Classe (){
    }
    public int numero(){
        Random gerador = new Random();
        int numeroAleatorio = gerador.nextInt(101);
        return  numeroAleatorio;
    }
    public int comparacao (int x,int pergunta ) {
        if (x == pergunta) {
            return 1;
        } else if (x > pergunta) {
            return  2;
        }else {
            return 3;
        }
    }
}
