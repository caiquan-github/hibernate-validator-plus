import com.kwon.validatorplus.groups.PostGroup;
import com.kwon.validatorplus.utils.ValidatorUtil;

import javax.validation.groups.Default;
import java.util.Date;

/**
 * @author Kwon
 */
public class AnnotationTest {
    public static void main(String[] args) {
        User user = new User();
        user.setName("小明");
        user.setPhone("14711111111");
        user.setIp("127.0.2.3");
        user.setDomain("baidu.com");
        user.setIdCard("430213444444421321");
        user.setUser("ubsdhdsj11111");
        user.setPasswd("jjre231123");
        user.setD2("202201");

//        user.setD1(new Date(1212L));
        ValidatorUtil.validate(user);
        ValidatorUtil.validate(user);
    }
}
