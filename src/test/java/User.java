import com.kwon.validatorplus.annotation.*;
import com.kwon.validatorplus.groups.PostDefaultGroup;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @author Kwon
 */
public class User {
    @NotBlank(groups = PostDefaultGroup.class,message = "不能为空")
    private String name;
    private Integer age;
    private Integer sex;
    @IDate(groups = PostDefaultGroup.class,message = "时间错误d1",min = "202204",max = "202206")
    private Date d1;
    @IDate (groups = PostDefaultGroup.class, message = "时间错误d2",min = "202204",max = "202206")
    private String d2;
    @IPhone(groups = PostDefaultGroup.class)
    private String phone;
    @IIpAddress(groups = PostDefaultGroup.class)
    private String ip;
    @IDomain(groups = PostDefaultGroup.class)
    private String domain;

    @IIdCard
    private String idCard;

    @IAccount
    private String user;
    @IPassword
    private String passwd;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
