package atk.app.model;

public interface MessagingGateway {
    void onBaseline(Observation indicator);

    void onChangeMessage(ChangeMessage message);
}
