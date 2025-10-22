package eyesimulator;

/**
 * Interface defining methods for a data destination that receives
 * subscriber data and handles errors.
 *
 *  @author annonymous
 *  @version 2025
 */

public interface DataDestination {
    void addSubscriberData(String dataWithPrefix);
    void alertError(String messageWithPrefix);
}
