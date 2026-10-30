import edu.cymbal.graphics.CanvasAPI;
import edu.cymbal.graphics.Graphics;
import edu.cymbal.graphics.PainterAPI;
import java.awt.Color;

public class Aquarium {
    public static void main(String[] args) {
        CanvasAPI canvas = Graphics.createCanvas(800, 600, "My First Drawing");
        PainterAPI painter = canvas.getPainter();
        painter.setSpeed(10); // Lower number means faster, zero means as fast as possible.
        painter.forward(100);
        painter.turnRight(90);
        painter.forward(100);
    }

    /**
     * Draws a filled circle
     * @param painter the painter used to draw 
     * @param x the X coordinate of the center of the circle
     * @param y the Y coordinate of the center of the circle
     * @param radius the radius of the circle
     * @param color the color of the circle
     */
    public static void drawCircle(PainterAPI painter, int x, int y, int radius, Color color) {
    }

    /**
     * Draws a filled triangle using three corner positions
     * @param painter the painter used to draw
     * @param x1 the X coordinate of the first vertex of the triangle
     * @param y1 the Y coordinate of the first vertex of the triangle
     * @param x2 the X coordinate of the second vertex of the triangle
     * @param y2 the Y coordinate of the second vertex of the triangle
     * @param x3 the X coordinate of the third vertex of the triangle
     * @param y3 the Y coordinate of the third vertex of the triangle
     * @param color the color of the triangle
     */
    public static void drawTriangle(PainterAPI painter, int x1, int y1, int x2, int y2, int x3, int y3, Color color) {
    }
    
    /**
     * Draws a fish with a circular body and a triangular tail
     * @param painter the painter used to draw
     * @param x the X coordinate of the center of the fish's body
     * @param y the Y coordinate of the center of the fish's body
     * @param size the radius of the fish's body
     * @param color the color of the fish's body and tail
    */
    public static void drawFish(PainterAPI painter, int x, int y, int size, Color color) {
        // Calls drawCircle to draw the body and eye of the fish
        // Calls drawTriangle to draw the tail and fin of the fish
    }

    /**
     * Draws a shark with a circular body, triangular tail, triangular side fin, and triangular dorsal fin
     * @param painter the painter used to draw
     * @param x the X coordinate of the center of the shark's body
     * @param y the Y coordinate of the center of the shark's body
     * @param size the radius of the shark's body
     * @param color the color of the shark's body, tail, and dorsal fin
    */
    public static void drawShark(PainterAPI painter, int x, int y, int size, Color color) {
        // Calls drawCircle to draw the body and eye of the shark
        // Calls drawTriangle to draw the tail, dorsal fin, and side fin of the shark
    }

    /**
     * Draws bubbles rising above a starting position
     * @param painter the painter used to draw
     * @param x the X coordinate of the starting position of the bubbles
     * @param y the Y coordinate of the starting position of the bubbles
     * @param radius the radius of the bubbles
     * @param count the number of bubbles to draw
     */
    public static void drawBubbles(PainterAPI painter, int x, int y, int radius, int count) {
        // Calls drawCircle repeatedly using a loop
    }

    /**
     * Draws green sea moss at the bottom of the aquarium
     * @param painter the painter used to draw
     * @param x the starting X coordinate of the sea moss
     * @param y the starting Y coordinate of the sea moss
     * @param width the width of the sea moss
     */
    public static void drawSeaMoss(PainterAPI painter, int x, int y, int width) {
        // Calls drawTriangle repeatedly using a loop to create the sea moss
    }

    /**
     * Draws a gray rock cave with an entrance
     * @param painter the painter used to draw
     * @param x the X coordinate of the cave's center
     * @param y the Y coordinate of the cave's center
     * @param size the radius of the cave's center
     */
    public static void drawCave(PainterAPI painter, int x, int y, int size) { 
        // Calls drawCircle to draw the outer rock and entrance of the cave
    }

    public static void drawSeaMoss(PainterAPI painter, int x, int y, int width) {
        // Calls drawTriangle repeatedly using a loop to create the sea moss effect
    }

    /**
     * Draws the complete aquarium scene including fish, sharks, bubbles, and sea moss
     * @param painter the painter used to draw
     */
    public static void drawAquarium(PainterAPI painter) {
        // Calls drawSeaMoss and drawCave for decorations
        // calls drawFish and drawShark for the aquatic life
        // calls drawBubbles above the fish and shark for the rising bubbles in the water
    }
}