//Marcel, Bene, Oscar
public class Spiel
{
    private Zeichenfenster Zeichenfenster;
    public Hindernisse[] Röhren;
    public Vogel Flappy;
    
    public Spiel()
    {
        Röhren = new Hindernisse[4];
        Flappy = new Vogel();
        
        
    }
    
    public void Berührt()
    {
        for(int z = 0; z < 4; z++){
            if(Flappy.Berührt(Röhren[z]))
            {
                Spielbeenden();
            }
        }
    }
    
    public void Außerhalb()
    {
        if(this.Flappy.YPositionGeben() > 650 && this.Flappy.YPositionGeben() < -1)
        {
            Spielbeenden();    
        }
    }
    
    public void Spielbeenden()
    {
        System.out.println("Ende");
    }
}