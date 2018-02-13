import java.awt.*;

public class Brush {

    Graphics point;

    Brush(Color colorOfCurve){
        this.point = point;
        this.point.setColor(colorOfCurve);
    }

    public void Draw(int mouseX, int mouseY){
        point.drawOval(mouseX, mouseY, 2, 2);
        point.fillOval(mouseX, mouseY, 2, 2);
    }
}

