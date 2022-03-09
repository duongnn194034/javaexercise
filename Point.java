abstract class Graphics {

}
interface Action {
    void moveTo(float x, float y);
    void draw();
    void erase();
}
class Point extends Graphics implements Action {
    protected float x;
    protected float y;

    public Point(float xx, float yy) {
        this.x = xx;
        this.y = yy;
    }
    public void moveTo(int xx. int yy) {
        this.erase();
        this = new Point(xx, yy);
        this.draw(); 
    }
    public void draw() {}
    public void erase() {}
}

class Circle extends Point implements Action {
    protected float r;

    public Circle(float _x, float _y, float _r) {
        super(_x, _y);
        this.r = _r;
    }
    public void moveTo(float xx, float yy) {}
    public void draw() {}
    public void erase() {}
}

class Rectangle extends Point implements Action {
    float a, b;
}