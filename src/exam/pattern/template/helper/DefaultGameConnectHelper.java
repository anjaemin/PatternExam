package exam.pattern.template.helper;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {
    @Override
    protected String doSecurity(String string) {
        System.out.println("more strong!! Decode!!");
        return string;
    }

    @Override
    protected boolean authentication(String id, String pwd) {
        System.out.println("authentication!!");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("authorization!!");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("connection!!");
        return info;
    }
}
