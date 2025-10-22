interface EyeTrackingDelegate {
	void addToEyeTrackingQueue(String data) throws InterruptedException;
	
	String pollEyeTrackingQueue() throws InterruptedException;
}
