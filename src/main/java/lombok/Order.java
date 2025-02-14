package lombok;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {
    @Setter(AccessLevel.NONE)
    private String id;
    private List<Product> products;
    private String shippingAddress;
    private String paymentMethod;

}
