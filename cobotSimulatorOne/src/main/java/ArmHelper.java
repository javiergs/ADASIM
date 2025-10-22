import java.util.ArrayList;
import java.util.List;
import java.awt.Color;
import java.util.Random;
/**
 * Manage angles and colors of robot arm for visualization.
 *
 * @author annonymous
 * @version 2025
 */
class ArmHelper {
    private List<Double> armAngles;
    private List<Double> targetAngles;
    private List<Color> colors;

    private ArmHelper(int count) {
        armAngles = new ArrayList<>();
        targetAngles = new ArrayList<>();
        colors = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            armAngles.add(0.0);
            targetAngles.add(0.0);
            colors.add(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
        }
    }

    static ArmHelper init(int count) {
        return new ArmHelper(count);
    }

    List<Double> getArmAngles() {
        return armAngles;
    }

    List<Color> getColors() {
        return colors;
    }
}
