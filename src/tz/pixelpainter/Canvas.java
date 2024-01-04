package tz.pixelpainter;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import tz.pixelpainter.keyboard.KeyboardController;
import tz.pixelpainter.utils.Messages;

public class Canvas {

    public Cursor cursor;
    private int width;
    private int height;
    private int pixelSize;
    private Rectangle canvas;
    private Rectangle[][] individualSquares;
    private KeyboardController keyboardController;
    private Messages messages;
    private Movement movement;
    private Coloring coloring;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPixelSize() {
        return pixelSize;
    }

    public Rectangle[][] getIndividualSquares() {
        return individualSquares;
    }


    protected void initializeCanvas(int width, int height, int pixelSize){
        this.width = width;
        this.height = height;
        this.pixelSize = pixelSize;
    }

    public void start() {
        cursor = new Cursor(this.pixelSize);
        movement = new Movement(cursor, this);
        coloring = new Coloring(movement, cursor, this);
        messages = new Messages();
        keyboardController = new KeyboardController(movement, coloring);

        drawCanvas();

        int numHorizontalSquares = calculateUtil(width);
        int numVerticalLines = calculateUtil(height);

        // Initialize the two-dimensional array with the correct size
        individualSquares = new Rectangle[numVerticalLines][numHorizontalSquares];

        createGridOfSquares(numVerticalLines,numHorizontalSquares);

        //Filling the cursor needs to come last so that it over-imposes other elements of the grid
        cursor.cursorFill();

        messages.userText();
    }

    /*
     *  Creates canvas as a big rectangle
     */
    private void drawCanvas(){
        canvas = new Rectangle(1, 1, this.width, this.height);
        canvas.setColor(Color.BLACK);
        canvas.draw();
    }

    /*
     *  Calculate the number of horizontal squares and vertical lines
     */
    private int calculateUtil(int value){return value / this.pixelSize;}

    /*
    *  Creates grid of squares
    */
    private void createGridOfSquares(int numVerticalLines, int numHorizontalSquares){
        for (int i = 0; i < numVerticalLines; i++) {
            for (int j = 0; j < numHorizontalSquares; j++) {

                individualSquares[i][j] = new Rectangle(
                        (1 + (j * pixelSize)),
                        (1 + (i * pixelSize)),
                        pixelSize,
                        pixelSize
                );

                individualSquares[i][j].setColor(Color.BLACK);
                individualSquares[i][j].draw();
            }
        }
    }

}
