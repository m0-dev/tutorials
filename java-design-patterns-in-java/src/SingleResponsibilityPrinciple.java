import java.util.ArrayList;
import java.util.List;

public class SingleResponsibilityPrinciple {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }
}

class demo  {
    public static void main(String[] args) {
        SingleResponsibilityPrinciple srp = new SingleResponsibilityPrinciple();
        srp.addEntry("I said hello!");
        srp.addEntry("I ate a bug!");
        System.out.println(srp);
    }
}
