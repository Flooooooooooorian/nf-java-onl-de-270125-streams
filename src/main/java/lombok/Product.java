package lombok;


public record Product(
        String id,
        @With
        String name) {

}
