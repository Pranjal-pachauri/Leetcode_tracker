// Last updated: 7/13/2026, 10:06:46 AM
class RecentCounter {
    
    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
		while (t - queue.peek() > 3000) {
			queue.poll();
		}
		return queue.size();
    }
}