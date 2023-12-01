import java.io.Serializable;
import java.util.Date;
public class book implements Serializable {
    private static final long serialVersionUID = 1l;
    private Integer bookid;
    private String bookname;
    private Double price;
    private String author;
    private String publish;
    private Integer categoryid;
    private String booklink;
    private Date deadline;

}
