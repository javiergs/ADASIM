interface DataDelegate {
	void addToProcessedDataQueue(ProcessedDataObject data);
	
	ProcessedDataObject getFromProcessedDataQueue();
}
