public class testHandRequest {
    public static void main(String[] args) {
        Request request = new Request("egg,chicken,mi,drunk,shit");
        Handler handler = new Handler();
        handler.HandlerRequest(request);
    }
}
