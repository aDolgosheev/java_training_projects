public class TestTask_002 {
    private OnDoneListener<String> callback;

    public TestTask_002(OnDoneListener<String> callback) {
        this.callback = callback;
    }

    public void execute() {
        //smth
        callback.onDone("complete");
    }
}
