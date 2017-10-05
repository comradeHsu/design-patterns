import facade.WebProject;
import prototype.Prototype;
import singleton.SingletonFifth;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Hello World!");
//        WebProject webProject = new WebProject();
//        webProject.start();
        Prototype prototype = new Prototype();
        prototype.setStr("123");
        Prototype type = (Prototype) prototype.deepClone();
        System.out.println(type.getStr());
    }
}
