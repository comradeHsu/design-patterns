package factoryMethod;

public class MailSender implements Sender{

    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
