package tz.pixelpainter.utils;

public class Messages {

    public void instructionsTable() {
        System.out.println(
                """
                        +---------------------------------------------------+
                        |             Welcome to PixelPainter!              |
                        +----------------------+----------------------------|
                        |HOW TO MOVE:          |FILE:                       |
                        | W-A-S-D: MOVE        | KEY Z: SAVE IMAGE          |
                        | SPACE: PAINT         | KEY X: LOAD IMAGE          |
                        | KEY E: ERASE SQUARE  | KEY C: EXPORT IMAGE TO PNG |
                        | KEY O: CLEAR CANVAS  |                            |
                        +---------------------------------------------------+
                        |COLOR SELECTION:                                   |
                        | KEY 1: BLACK         | KEY 6: YELLOW              |
                        | KEY 2: RED           | KEY 7: ORANGE              |
                        | KEY 3: GREEN         | KEY 8: PINK                |
                        | KEY 4: BLUE          | KEY 9: MAGENTA             |
                        | KEY 5: CYAN          | KEY 0: WHITE               |
                        +---------------------------------------------------+
                        """
        );
    }

    public String imageSaved() {
        return "IMAGE SAVED!";
    }

    public void imageLoaded() {
        System.out.println(
                """
                        +-----------------------+
                        | IMAGE LOADED!         |
                        +-----------------------+"""
        );
    }

    public void featureUnavailable() {
        System.out.println("FEATURE IS NOT YET AVAILABLE.");
    }

    public void pngExported() {
        System.out.println(
                """
                        +-----------------------+
                        | IMAGE SAVED AS PNG!   |
                        +-----------------------+"""
        );
    }

    public void areYouSureClear() {
        System.out.println(
                """
                        +-----------------------+
                        | CLEAR CANVAS:         |
                        |  ARE YOU SURE? (Y/N): |
                        +-----------------------+"""
        );
    }

    public void canvasCleared() {
        System.out.println(
                """
                        +-----------------------+
                        | CANVAS CLEARED!       |
                        +-----------------------+"""
        );
    }

    public String actionCancelled() {
        return "Saving cancelled.";
    }
}
