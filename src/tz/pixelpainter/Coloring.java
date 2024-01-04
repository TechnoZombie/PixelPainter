package tz.pixelpainter;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

import java.util.ArrayList;
import java.util.List;

public class Coloring {

    private final Movement movement;
    private final Cursor cursor;
    private final Canvas canvas;
    public void setChosenColor(Color chosenColor) {
        this.chosenColor = chosenColor;
    }

    Color chosenColor = Color.BLACK;
    Color gridColor = Color.BLACK;
    int cursorSquareX;
    int cursorSquareY;

    public Coloring(Movement movement, Cursor cursor, Canvas canvas) {
        this.movement = movement;
        this.cursor = cursor;
        this.canvas = canvas;
    }

    public void paint() {
        cursorSquareX = movement.getCursorIndexX();
        cursorSquareY = movement.getCursorIndexY();

        canvas.getIndividualSquares()[cursorSquareY][cursorSquareX].setColor(chosenColor);
        canvas.getIndividualSquares()[cursorSquareY][cursorSquareX].fill();

        cursor.cursorReFill();
    }

    public void erase() {
        cursorSquareX = movement.getCursorIndexX();
        cursorSquareY = movement.getCursorIndexY();

        if (verifyIfFilled(cursorSquareY,cursorSquareX)) {
            resetIndividualSquare(cursorSquareY,cursorSquareX);
        }
        cursor.cursorReFill();
    }

    private boolean verifyIfFilled(int y, int x){
        return canvas.getIndividualSquares()[y][x].isFilled();
    }

    private void resetIndividualSquare(int y, int x){
        canvas.getIndividualSquares()[y][x].delete();
        canvas.getIndividualSquares()[y][x].setColor(gridColor);
        canvas.getIndividualSquares()[y][x].draw();
    }

    public void colorBlack() {
        setChosenColor(Color.BLACK);
    }

    public void colorRed() {
        setChosenColor(Color.RED);
    }

    public void colorGreen() {
        setChosenColor(Color.GREEN);
    }

    public void colorBlue() {
        setChosenColor(Color.BLUE);
    }

    public void colorYellow() {
        setChosenColor(Color.YELLOW);
    }


}



