package factoryMethod;

public class SenderFactory {

    public Sender produceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }

    /**
     * 静态工厂模式
     * @return
     */
    public static Sender produce_Mail(){
        return new MailSender();
    }

    public static Sender produce_Sms(){
        return new SmsSender();
    }
}
