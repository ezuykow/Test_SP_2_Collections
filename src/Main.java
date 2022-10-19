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
        private final int a, b;

        Task() {
           a = (int) (Math.random() * 8 + 2);
           b = (int) (Math.random() * 8 + 2);
        }

        String getTask() {
            return String.format("%d * %d", a, b);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Task task = (Task) o;

            if (a != task.a) return false;
            return b == task.b;
        }

        @Override
        public int hashCode() {
            int result = a;
            result = 31 * result + b;
            return result;
        }
    }
}
