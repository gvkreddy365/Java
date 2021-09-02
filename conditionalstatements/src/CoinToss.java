import java.util.Random;

public class CoinToss {

    public String tossACoin()
    {
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt())%2;
        if (toss==0)
        {
            return "Heads";
        }
        else {
            return "Tales";
        }
    }
    public static void main(String[] args)
    {
        CoinToss flip = new CoinToss();
        System.out.println(flip.tossACoin());
    }
}
