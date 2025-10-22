import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

class EmotionDataDelegate implements EmotionDelegate {
	private final BlockingQueue<String> emotionQueue = new LinkedBlockingQueue<>();
	
	@Override
	public void addToEmotionQueue(String data) throws InterruptedException {
		emotionQueue.put(data);
	}
	
	@Override
	public String pollEmotionQueue() throws InterruptedException {
		return emotionQueue.poll(Blackboard.TIMEOUT_IN_MS, TimeUnit.MILLISECONDS);
	}
}
