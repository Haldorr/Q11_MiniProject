//Marcel, Bene, Oscar
public class Vogel extends Figur{

/**
 * Created on Sat Dec 27 12:33:57 2020
 * 
 * @author: Klaus Reinold
 * Klasse zur Darstellung eines Vogels
 * 
 */
int phase;

    
    public Vogel(){
        super();
        phase = 0;
    }
        
    
    void FlügelObenZeichnen(){
        //Darstellung Flügel oben
        
        super.EigeneFigurLöschen();
        int verschiebung =  10;
        int x1,x2,x3,y1,y2,y3,x,y,breite,höhe;
        //Flügel hinten
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = 10;
        y3 = -25;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
        
        //Schnabel
        x1 = 40;
        y1 = -10;
        x2 = 50;
        y2 = -15;
        x3 = 40;
        y3 = -20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange"); 
        
        //Kopf
        x = 10;
        y = -30;
        breite = 30;
        höhe = 30;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Auge
        x = 28;
        y = -22;
        breite = 4;
        höhe = 4;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "blau");
        
        //Rumpf
        x = -40;
        y = -15;
        breite = 60;
        höhe = 30;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");
        
        //Flügel vorne
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = -30;
        y3 = -25;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }


    void FlügelUntenZeichnen(){
        //Darstellung Flügel unten 
        
        int verschiebung =  -10;
        int x1,x2,x3,y1,y2,y3,x,y,breite,höhe;
        
        super.EigeneFigurLöschen();

        
        //Flügel hinten
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = 20;
        y3 = 15;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");

        //Schnabel
        x1 = 40;
        y1 = -10;
        x2 = 50;
        y2 = -15;
        x3 = 40;
        y3 = -20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange")  ;

        //Kopf
        x = 10;
        y = -30;
        breite = 30;
        höhe = 30;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");

        //Auge
        x = 28;
        y = -22;
        breite = 4;
        höhe = 4;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "blau");

        //Rumpf
        x = -40;
        y = -15;
        breite = 60;
        höhe = 30;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");

        //Flügel vorne
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = -50;
        y3 = 20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }


    void FlügelMitteZeichnen(){
        //Darstellung Flügel mittig
        
        int verschiebung =  0;
        int x1,x2,x3,y1,y2,y3,x,y,breite,höhe;
        
        super.EigeneFigurLöschen();


        //Schnabelteil unten
        x1 = 40;
        y1 = -10;
        x2 = 50;
        y2 = -10;
        x3 = 40;
        y3 = -15;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange"); 

        //Schnabelteil oben;
        x1 = 40;
        y1 = -15;
        x2 = 50;
        y2 = -20;
        x3 = 40;
        y3 = -20;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "orange")  ;

        //Kopf
        x = 10;
        y = -30;
        breite = 30;
        höhe = 30;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");

        //Auge
        x = 28;
        y = -22;
        breite = 4;
        höhe = 4;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "blau");

        //Rumpf
        x = -40;
        y = -15;
        breite = 60;
        höhe = 30;
        y = y + verschiebung;
        super.FigurteilFestlegenEllipse(x, y, breite, höhe, "schwarz");

        //Flügel vorne
        x1 = -20;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = -50;
        y3 = 5;
        y1 = y1 + verschiebung;
        y2 = y2 + verschiebung;
        y3 = y3 + verschiebung;
        super.FigurteilFestlegenDreieck(x1, y1, x2, y2, x3, y3, "grau");
    }    
}