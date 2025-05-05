package leetcode75.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for (int j : arr) {
            occurrenceMap.merge(j, 1, Integer::sum);
        }
        Set<Integer> occurenceSet = new HashSet<>(occurrenceMap.values());
        return occurrenceMap.size() == occurenceSet.size();
    }
}
