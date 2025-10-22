interface EmotionDelegate {
	void addToEmotionQueue(String data) throws InterruptedException;
	
	String pollEmotionQueue() throws InterruptedException;
}
