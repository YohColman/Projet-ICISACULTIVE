package icisacultive.devweb.projet.entities;

public class MessageErreur {

    private String message;

    public MessageErreur(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
