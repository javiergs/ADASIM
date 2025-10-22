import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 * ComponentController class that listens for component events, especially resize.
 * @author annonymous
 * @version 2025
 */
public class ComponentController implements ComponentListener {

    private static final Logger logger = LoggerFactory.getLogger(ComponentController.class);

    @Override
    public void componentResized(ComponentEvent e) {
        logger.info("Resizing window{}x{}", e.getComponent().getWidth(), e.getComponent().getHeight());
        Blackboard.getInstance().updateOrigin(e.getComponent().getWidth(), e.getComponent().getHeight());
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }

}