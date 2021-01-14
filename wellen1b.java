
import processing.core.PApplet;
import processing.core.PFont;

/**
 * Klasse wellen1b.
 * Beschreibung: 
 *
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class wellen1b extends PApplet
{       
    /**
     * settings() Methode 
     * Fenstergröße size(int width, int height) und smooth(int level) muss hier eingestellt werden.
     */
    @Override
    public void settings()
    {
        size(760, 520);
    }        

    /**
     * Die setup() Methode wird einmal aufgerufen, wenn das Programm startet.
     * Hier werden Einstellungen wie die Hintergrundfarbe vorgenommen
     * und Medien wie Bilder und Schriftarten geladen.
     */
    @Override
    public void setup()
    {
        background(200, 130, 50);
    }

    /**
     * Die draw() Methode wird nach der setup() Methode aufgerufen
     * und führt den Code innerhalb ihres Blocks fortlaufend aus,
     * bis das Programm gestoppt oder noLoop() aufgerufen wird.
     */
    @Override
    public void draw()
    {
        for (int row = 0; row < 4; row++){
            for (int col = 0; col < 6; col++){
                drawDie(20 + (col * dieSize), 20 + (row * dieSize), 
                                (col + row) % 2 == 0, row % 2 == 0);
            }
        }
        
        for (int row = 0; row < 3; row++){
            stroke(50, 255, 120);
            strokeWeight(4);
            line (20, 20 + (row * dieSize) + dieSize, 6 * dieSize + 20, 20 + (row * dieSize) + dieSize);
            stroke(0);
            strokeWeight(1);
        }
    }
    
    final static int dieSize = 120; 
    void drawDie(int x, int y, boolean black, boolean eyesRight){
        fill(black ? 0 : 255);
        square(x, y, dieSize);
        
        fill(black ? 255 : 0);
        circle(eyesRight ? (x + 90) : (x + 30), y + 30, 20);
        
        circle(eyesRight ? (x + 90) : (x + 30), y + 90, 20);
        
    }

    /**
     * Mit der main()-Methode wird das Programm gestartet.
     *
     */    
    public static void main(String _args[]){ 
        PApplet.main(new String[] {wellen1b.class.getName() });
    }

}
