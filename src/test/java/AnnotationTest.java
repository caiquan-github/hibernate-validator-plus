import com.kwon.validatorplus.groups.PostGroup;
import com.kwon.validatorplus.utils.ValidatorUtil;

import javax.validation.groups.Default;

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
        user.setIdCard("32");
        user.setUser("ubsdhdsj11111");
        user.setPasswd("jjre231123");
        user.setD2("202204");

//        user.setD1(new Date(1212L));
//        ValidatorUtil.validate(user, PostDefaultGroup.class);
        ValidatorUtil.validate(user, PostGroup.class, Default.class);
    }
}
