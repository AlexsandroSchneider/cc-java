public class Character extends FlxSprite {
    public Character(String label, boolean alive, String graphics, int x, int y){
        super(label);
        this.setAlive(alive);
        this.loadGraphics(graphics);
        this.reset(x, y);
    }
}
