import java.util.Deque;
import java.util.concurrent.ConcurrentLinkedDeque;

class CircleDataDelegate implements CircleDelegate {
	private Deque<Circle> circleList = new ConcurrentLinkedDeque<>();
	private int maxCircles = 5;
	private int thresholdRadius = 50;
	private int circleRadius = 50;
	
	@Override
	public void addToCircleList(Circle data) {
		circleList.add(data);
		Blackboard.getInstance().firePropertyChange(Blackboard.PROPERTY_NAME_VIEW_DATA, null, null);
	}
	
	@Override
	public Deque<Circle> getCircleList() {
		return circleList;
	}
	
	@Override
	public void setCircleList(Deque<Circle> circleList) {
		this.circleList = circleList;
		Blackboard.getInstance().firePropertyChange(Blackboard.PROPERTY_NAME_VIEW_DATA, null, circleList);
	}
	
	@Override
	public int getThresholdRadius() {
		return thresholdRadius;
	}
	
	@Override
	public int getCircleRadius() {
		return circleRadius;
	}
	
	@Override
	public void setThresholdRadius(int thresholdRadius) {
		this.thresholdRadius = thresholdRadius;
	}
	
	@Override
	public void setCircleRadius(int circleRadius) {
		this.circleRadius = circleRadius;
	}
	
	@Override
	public int getMaxCircles() {
		return maxCircles;
	}
	
	@Override
	public void setMaxCircles(int maxCircles) {
		this.maxCircles = maxCircles;
	}
}
