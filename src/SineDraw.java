import java.awt.Graphics;
import java.awt.Color;



public class SineDraw {

    public static final int DP_WIDTH = 628;
    public static final int DP_HEIGHT = 200;

    public static final Color SINE_WAVE_COLOR = new Color(165, 44, 2);

    public static void main(String[] args) {
        DrawingPanel dp = new DrawingPanel(DP_WIDTH, DP_HEIGHT);
        Graphics gr = dp.getGraphics();
        gr.setColor(SINE_WAVE_COLOR);
        drawSineWave(dp, gr);

    }

    public static void drawSineWave(DrawingPanel dp, Graphics gr) {
        for (int xValue = 0; xValue < DP_WIDTH; xValue += 1) {
            int endXValue = xValue + 1;
            gr.drawLine(xValue, getYValueSineWave(xValue), endXValue, getYValueSineWave(endXValue));
        }
    }

    public static int getYValueSineWave(int xValue) {
        return (int) (200 - 200.0 * Math.sin(xValue / 200.0));
    }
}
