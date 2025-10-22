import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

class ProcessedDataDelegate implements DataDelegate {
    private final Queue<ProcessedDataObject> processedDataQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void addToProcessedDataQueue(ProcessedDataObject data) {
        processedDataQueue.add(data);
        Blackboard.getInstance().firePropertyChange(Blackboard.PROPERTY_NAME_PROCESSED_DATA, null, null);
    }

    @Override
    public ProcessedDataObject getFromProcessedDataQueue() {
        return processedDataQueue.poll();
    }
}
