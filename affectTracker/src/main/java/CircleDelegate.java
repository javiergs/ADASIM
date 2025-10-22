import java.util.Deque;

interface CircleDelegate {
	void addToCircleList(Circle data);
	
	public Deque<Circle> getCircleList();
	
	public void setCircleList(Deque<Circle> circleList);
	
	public int getThresholdRadius();
	
	public int getCircleRadius();
	
	public void setThresholdRadius(int thresholdRadius);
	
	public void setCircleRadius(int circleRadius);
	
	public int getMaxCircles();
	
	public void setMaxCircles(int maxCircles);
}
