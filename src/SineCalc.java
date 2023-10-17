public class SineCalc {
    public static double riemannSumEstimation(int totalNumRectangles) {
        double rectangleWidth = Math.PI / totalNumRectangles;
        double sumRectangleArea = 0;
        for (int currentRectangle = 0; currentRectangle <= totalNumRectangles; currentRectangle ++) {
            double rectangleMidpoint = currentRectangle * rectangleWidth - rectangleWidth / 2;
            sumRectangleArea += rectangleWidth * Math.sin(rectangleMidpoint);
        }
        return sumRectangleArea;
    }
}