// Design Hit Counter
// Problem Description:
// Design a hit counter that can record hits and return the total number of hits in the past 5 minutes.
// Your counter should support two primary operations:
// hit(timestamp): Records a hit at the given timestamp.
// getHits(timestamp): Returns the number of hits that have occurred in the past 5 minutes (300 seconds) up to the given timestamp.
// Assume that timestamps are in seconds and are always increasing. You do not need to consider any invalid timestamp values or timestamps that are out of order.
// Input:
// hit(timestamp): An integer timestamp representing the time a hit occurred.
// getHits(timestamp): An integer timestamp representing the current time for which the count of hits in the past 5 minutes is requested.
// Output:
// getHits(timestamp): An integer representing the total number of hits that occurred within the [timestamp - 300, timestamp] interval.
// Example:
// Let's illustrate with an example:
// HitCounter counter = new HitCounter();

// // hit at timestamp 1
// counter.hit(1);

// // hit at timestamp 2
// counter.hit(2);

// // hit at timestamp 3
// counter.hit(3);

// // get hits at timestamp 4
// counter.getHits(4); // returns 3 (hits at 1, 2, 3 are all within [1, 4])

// // hit at timestamp 300
// counter.hit(300);

// // get hits at timestamp 300
// counter.getHits(300); // returns 4 (hits at 1, 2, 3, 300 are all within [0, 300])

// // get hits at timestamp 301
// counter.getHits(301); // returns 3 (hit at 1 is now outside the window [2, 301], hits at 2, 3, 300 are within)


import java.util.LinkedList;
import java.util.Queue;

public class Design_Hit_Counter {
    private Queue<Integer> hitsQueue;

    public Design_Hit_Counter() {
        hitsQueue = new LinkedList<>();
    }

    // Records a hit at the given timestamp
    public void hit(int timestamp) {
        hitsQueue.offer(timestamp);
    }

    // Returns the number of hits in the past 5 minutes (300 seconds)
    public int getHits(int timestamp) {
        // Remove all hits older than (timestamp - 300)
        while (!hitsQueue.isEmpty() && hitsQueue.peek() <= timestamp - 300) {
            hitsQueue.poll();
        }
        return hitsQueue.size();
    }

    public static void main(String[] args) {
        Design_Hit_Counter counter = new Design_Hit_Counter();

        counter.hit(1);
        counter.hit(2);
        counter.hit(3);

        System.out.println(counter.getHits(4));   // Output: 3

        counter.hit(300);

        System.out.println(counter.getHits(300)); // Output: 4
        System.out.println(counter.getHits(301)); // Output: 3
    }
}
