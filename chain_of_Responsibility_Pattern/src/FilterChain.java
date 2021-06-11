import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    List<Filter> filters = new ArrayList<>();
    public FilterChain() {
        filters.add(new FilterEgg());
        filters.add(new FilterShit());
        filters.add(new FilterShit());
    }
    public void processData(String data){
        for (Filter filter : filters) {
            filter.doFilter(data);
        }
    }
}
