package exam.pattern.template.helper;

public abstract class AbstGameConnectHelper {

    // protected 접근제한자 사용시 같은 패키지에 있거나 상속관계일때 접근가능
    // default 접근제한자 사용시 같은 패키지에 있을때 접근가능
    protected abstract String doSecurity(String string);
    protected abstract boolean authentication(String id, String pwd);
    protected abstract int authorization(String userName);
    protected abstract String connection(String info);

    public String requestConnection(String str) {
        String decStr = doSecurity(str);

        String id = "aaa";
        String pwd = "bbb";
        String userName = "ccc";

        boolean flag = authentication(id, pwd);

        if(!flag) {
            throw new Error("auth error!!");
        }
        int res = authorization(userName);

        switch(res) {
            case 0:
                System.out.println("game manager");
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

            default:
                break;
        }

        return connection(str);
    }
}
