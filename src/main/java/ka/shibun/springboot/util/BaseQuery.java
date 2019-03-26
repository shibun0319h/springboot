package ka.shibun.springboot.util;

/**
 * 公共的查询类
 *
 * @author shibun
 * @create 2019/3/26
 * @since 1.0.0
 */
public class BaseQuery {

    private Integer page=1;

    private Integer rows=10;
    //从哪里开始
    private Integer start =0;
    //查询的关键字
    private String keyword;

    public Integer getStart() {
        // (page-1)*size
        return (this.page-1)*this.rows;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}