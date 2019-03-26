package ka.shibun.springboot.util;

/**
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
public class AjaxResult {

    private boolean success = true; //默认操作成功

    private String msg = "操作成功"; //返回文本字符信息

    private Object obj; //返回对象

    public static AjaxResult me(){
        return new AjaxResult();
    }

    public boolean isSuccess() {
        return success;
    }

    public AjaxResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObj() {
        return obj;
    }

    public AjaxResult setObj(Object obj) {
        this.obj = obj;
        return this;
    }
}