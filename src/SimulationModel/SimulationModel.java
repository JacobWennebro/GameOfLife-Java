package SimulationModel;

import Shapes.Point;
import Shapes.Scene;
import Shapes.Shape;
import Shapes.Sprite;

import java.util.ArrayList;

/**
 * This is a class
 * Created 2021-10-18
 *
 * @author Magnus Silverdal
 */
public class SimulationModel {
    Scene scene;
    private int mapSize = 32;
    private boolean[][] map = new boolean[mapSize][mapSize];

    public SimulationModel() {

    }

    public boolean[][] getMap() {
        return map;
    }

    public void revive(int x, int y) {
        map[x][y] = true;
    }

    public void kill(int x, int y) {
        map[x][y] = false;
    }

    public boolean isAlive(Cell cell) {
        return map[cell.x][cell.y];
    }

    public Cell getCell(int x, int y) {
        return new Cell(x, y);
    }

    public void checkSurroundings(int x, int y) {
        Cell cell = getCell(x, y);

    }

    public ArrayList<Shape> getShapes(int x, int y) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Point(x,y));
        return shapes;
    }

    public ArrayList<Sprite> getSprites() {
        ArrayList<Sprite> sprites = new ArrayList<>();
        //sprites.add(c.getSprite());
        return sprites;
    }
}
