import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class EyeTrackingDataDelegate implements EyeTrackingDelegate {
	private final BlockingQueue<String> eyeTrackingQueue = new LinkedBlockingQueue<>();
	
	@Override
	public void addToEyeTrackingQueue(String data) throws InterruptedException {
		eyeTrackingQueue.put(data);
	}
	
	@Override
	public String pollEyeTrackingQueue() throws InterruptedException {
		return eyeTrackingQueue.poll(Blackboard.TIMEOUT_IN_MS, TimeUnit.MILLISECONDS);
	}
}
