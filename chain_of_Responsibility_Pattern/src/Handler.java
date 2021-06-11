

public class Handler {
    public void HandlerRequest(Request request){
        String data = request.getData();
        FilterChain filterChain = new FilterChain();
        filterChain.processData(data);
    }
}
