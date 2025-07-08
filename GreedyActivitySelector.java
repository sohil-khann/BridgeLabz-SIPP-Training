package DSA;

import java.util.*;

class Activity {
int start, end;

Activity(int start, int end) {
this.start = start;
this.end = end;
}
}

public class GreedyActivitySelector {
public static void main(String[] args) {
List<Activity> activities = Arrays.asList(
new Activity(1, 3),
new Activity(2, 4),
new Activity(3, 5),
new Activity(0, 6),
new Activity(5, 7),
new Activity(8, 9),
new Activity(5, 9)
);

// Sort by end time
activities.sort(Comparator.comparingInt(a -> a.end));

int count = 1; // first activity always selected
int lastEnd = activities.get(0).end;
System.out.println("Selected Activity: (" + activities.get(0).start + ", " + activities.get(0).end
+ ")");

for (int i = 1; i < activities.size(); i++) {
if (activities.get(i).start >= lastEnd) {
System.out.println("Selected Activity: (" + activities.get(i).start + ", " +
activities.get(i).end + ")");
lastEnd = activities.get(i).end;
count++;
}
}

System.out.println("Maximum activities: " + count);
}
}
