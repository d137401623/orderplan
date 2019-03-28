package santoo.entity;

public class OrderInfo {
    /**
     * 产品
     */
    private ProductInfo productInfo;
    /**
     * 数量
     */
    private Double num;
    /**
     * 优先级，最好只分普通和紧急
     */
    private String priority;
}
