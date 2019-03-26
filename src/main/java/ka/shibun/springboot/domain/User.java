package ka.shibun.springboot.domain;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shibun
 * @since 2019-03-26
 */
@TableName("t_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String username;
    private String password;
    private String name;
    private String identitycard;
    @TableField("department_id")
    private Long departmentId;
    private Date jointime;
    private Long phonenum;
    @TableField("education_id")
    private Long educationId;
    private String address;
    @TableField("sex_id")
    private Long sexId;
    private Date birthday;
    private String remark;
    private Boolean state;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentitycard() {
        return identitycard;
    }

    public void setIdentitycard(String identitycard) {
        this.identitycard = identitycard;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public Long getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(Long phonenum) {
        this.phonenum = phonenum;
    }

    public Long getEducationId() {
        return educationId;
    }

    public void setEducationId(Long educationId) {
        this.educationId = educationId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getSexId() {
        return sexId;
    }

    public void setSexId(Long sexId) {
        this.sexId = sexId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "User{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", name=" + name +
        ", identitycard=" + identitycard +
        ", departmentId=" + departmentId +
        ", jointime=" + jointime +
        ", phonenum=" + phonenum +
        ", educationId=" + educationId +
        ", address=" + address +
        ", sexId=" + sexId +
        ", birthday=" + birthday +
        ", remark=" + remark +
        ", state=" + state +
        "}";
    }
}
