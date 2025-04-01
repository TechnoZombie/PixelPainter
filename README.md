# PixelPainter

![GitHub last commit](https://img.shields.io/github/last-commit/technozombie/PixelPainter)
![GitHub license](https://img.shields.io/github/license/technozombie/PixelPainter)

A simple pixel art drawing application built with Java and the SimpleGraphics library.

Based on an exercise made during #93rd bootcamp at Academia de Código / CodeForAll_ bootcamp, this is a paint-like program based on grid coordinates.
It uses simple-graphics as a graphics library ( https://github.com/academia-de-codigo/simple-graphics )

It has since been highly modified and enhanced, using a customized version of simple-graphics.

You can find them here:
PixelPainter Enhanced: https://github.com/TechnoZombie/PixelPainter-Enhanced
Simplegraphz: https://github.com/TechnoZombie/Simplegraphz

## Overview

PixelPainter is a lightweight application that allows users to create pixel art images using a grid-based canvas. Users can draw with various colors, save their work, and export it to PNG format.

## Features

- Interactive pixel-based drawing canvas
- Multiple color selection options
- Keyboard-controlled cursor movement
- Save and load functionality for your pixel art
- Export to PNG with automatic cropping of unused space
- Simple and intuitive interface

## Controls

### Movement
- **W**: Move cursor up
- **A**: Move cursor left
- **S**: Move cursor down
- **D**: Move cursor right

### Drawing
- **Space**: Paint pixel with selected color
- **E**: Erase pixel
- **O**: Clear canvas (with confirmation)

### File Operations
- **Z**: Save image
- **X**: Load image
- **C**: Export image to PNG
- **I**: Display information about painted pixels (debug feature)

### Colors
- **1**: Black
- **2**: Red
- **3**: Green
- **4**: Blue
- **5**: Cyan
- **6**: Yellow
- **7**: Orange
- **8**: Pink
- **9**: Magenta
- **0**: White
- **Up Arrow**: Light Gray

## Technical Details

PixelPainter is built using:
- Java
- SimpleGraphics library for rendering
- Object-oriented architecture with clear separation of concerns

### Project Structure

- **Main**: Application entry point
- **Canvas**: Core canvas management and initialization
- **Cursor**: Cursor representation and movement
- **Movement**: Cursor movement logic
- **Coloring**: Color selection and application
- **KeyboardController**: Keyboard input handling
- **FileManager**: Save, load, and export functionality
- **ColorProcessor**: Color conversion utilities
- **Messages**: User interface messages
- **Auxiliaries**: Helper functions for user interaction
- **Generators**: UI generation utilities

## Installation

### Prerequisites
- Java 11 or higher
- SimpleGraphics library (included in the resources folder)

### Running the Application

1. Clone the repository:
    \`\`\`bash
   git clone https://github.com/technozombie/pixelpainter.git
   \`\`\`

2. Navigate to the project directory:
    \`\`\`bash
   cd pixelpainter
   \`\`\`

3. Compile the project:
    \`\`\`bash
   javac -cp ".:lib/*" tz/pixelpainter/Main.java
   \`\`\`

4. Run the application:
    \`\`\`bash
   java -cp ".:lib/*" tz.pixelpainter.Main
   \`\`\`

## Future Enhancements

- Mouse support for drawing
- Drag painting feature
- Additional tools (lines, shapes, fill)
- More export options
- Layer support
- Custom color picker

## License

This project is licensed under the [MIT License](LICENSE).
