package JaeBongs_Code.pattern.First.TemplePattern;

import java.util.HashMap;
import java.util.Map;

public class Counter extends Parent {
    protected Map<String, Integer> map;

    public Counter() {
        super();
        this.map = new HashMap<>();
    }

    @Override
    public void doJob(String name) {
        Integer count = map.get(name);
        if (count == null) {
            count = 0;
        }
        count++;
        map.put(name, count);

        System.out.printf("%s님의 %d번째 방문입니다.\n", name, count);
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.execute();
    }
}
