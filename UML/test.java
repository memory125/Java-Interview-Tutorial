public class Product extends ConcurrencySafeEntity {
    // ...

    private Set<BacklogItem> backlogitems;

    public static BusinessPriorityTotals businessPriorityTotals() {
        // ...
    }
}    