
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen2b.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen2b extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(520,520);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(250);
        strokeWeight(4);
        
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        for (int row = 0;  row < 12; row++){
            for (int col = 0; col < 12; col++){
                //20px als Abstand
                zeichneQuadrat(20 + (col * laenge), 20 + (row * laenge),((row + col) % 2 == 1));
            }
        }
    }
    
    int laenge = 40;
    int[] color = new int[] { 50, 255, 70 };
    public void zeichneQuadrat(int x, int y, boolean filled){
       if (filled){
           stroke(255);
           fill(color[0], color[1], color[2]);
        }
        else {
           stroke(color[0], color[1], color[2]);
           noFill();
        }
       square(x, y, laenge - 4);
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen2b.class.getName() });
    }

}
