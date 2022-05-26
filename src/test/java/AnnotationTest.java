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
        user.setPhone("14789429877");
        user.setIp("127.0.2.3");
        user.setDomain("baidu.com");
//        user.setD2("202203");

//        user.setD1(new Date(1212L));
        ValidatorUtil.validate(user, PostGroup.class);
    }
}
