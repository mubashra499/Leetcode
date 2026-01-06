import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        // Add current request time
        queue.add(t);

        // Remove outdated requests
        while (queue.peek() < t - 3000) {
            queue.remove();
        }

        // Number of recent requests
        return queue.size();
    }
}
