import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Task> set = new HashSet<>(15);
        while (set.size() < 15) {
            set.add(new Task());
        }
        set.forEach(t -> System.out.println(t.getTask()));
    }

    private static class Task {
        private final String s, rs;

        Task() {
            int a = (int) (Math.random() * 8 + 2);
            int b = (int) (Math.random() * 8 + 2);
            s = String.format("%d * %d", a, b);
            rs = String.format("%d * %d", b, a);
        }

        String getTask() {
            return s;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Task task = (Task) o;
            return (s.equals(task.s) || s.equals(task.rs));
        }

        @Override
        public int hashCode() {
            return s.hashCode() + rs.hashCode();
        }
    }
}
