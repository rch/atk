package atk.app.model;

public class ChangeMessage  extends SlotData {
    public String message;

    public ChangeMessage(SlotData time, String message) {
        super(time);
        this.message = message;
    }
}
