import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 * This class draws the wall object.
 * @author Noah Stebbings
 * @version 1.2
 */
public class Wall extends Terrain {

	/**
	 * Creating a wall object.
	 * @param x
	 * @param y
	 * @param gc
	 * @param TILE_SIZE
	 */
	public Wall (int x, int y, GraphicsContext gc, int TILE_SIZE) {
		super(x, y, gc, TILE_SIZE);
		this.image = new Image("file:Art/Wall.png");
		this.tileType = "Wall";
	}

}