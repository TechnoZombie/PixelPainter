package tz.pixelpainter.keyboard;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import tz.pixelpainter.Movement;
import tz.pixelpainter.Coloring;

public class KeyboardController implements KeyboardHandler {

    private final Movement movement;
    private final Coloring coloring;

    public KeyboardController(Movement movement, Coloring coloring) {
        this.movement = movement;
        this.coloring = coloring;

        Keyboard keyboard = new Keyboard(this);

        char[] keys = {'D', 'A', 'S', 'W', 'Z', 'X', 'P', ' ', 'E', '1', '2', '3', '4', '5', '6'};

        for (char key : keys) {
            KeyboardEvent event = new KeyboardEvent();
            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
            event.setKey(key);
            keyboard.addEventListener(event);
        }

        // Special case for SPACE key released event
        KeyboardEvent spaceReleased = new KeyboardEvent();
        spaceReleased.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);
        spaceReleased.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(spaceReleased);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_W -> movement.moveUp();

            case KeyboardEvent.KEY_A -> movement.moveLeft();

            case KeyboardEvent.KEY_S -> movement.moveDown();

            case KeyboardEvent.KEY_D -> movement.moveRight();

            case KeyboardEvent.KEY_SPACE -> coloring.paint();

            case KeyboardEvent.KEY_E -> coloring.erase();

            case KeyboardEvent.KEY_C -> {/*to export image as png or jpg or wtv */ }

            case KeyboardEvent.KEY_1 -> coloring.colorBlack();

            case KeyboardEvent.KEY_2 -> coloring.colorRed();

            case KeyboardEvent.KEY_3 -> coloring.colorGreen();

            case KeyboardEvent.KEY_4 -> coloring.colorBlue();

            case KeyboardEvent.KEY_5 -> coloring.colorYellow();

            case KeyboardEvent.KEY_Z -> {/*to save image*/ }

            case KeyboardEvent.KEY_X -> { /* to load image */ }
            }
        }


    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}