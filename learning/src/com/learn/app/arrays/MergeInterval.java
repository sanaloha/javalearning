package com.learn.app.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {

	public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        
        // Sort intervals by the start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        
        System.out.println("==="+Arrays.deepToString(intervals));

        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];

            if (currentEnd >= nextStart) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else {
                // No overlap, add the next interval
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] intervals = {{1, 3},{8, 10},{2, 6},{15, 18},{16,20}};
        int[][] result = merge(intervals);

        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
		
		
	}

}

/**
 * 
Sorting: The intervals are sorted based on their start times to ensure they are processed in order.
Merging: If the current interval overlaps with the next one, their end times are merged by taking the maximum of the two.
Result: Non-overlapping intervals are added to the result list, and the final list is converted back to a 2D array.
 * 
 * 
 */
