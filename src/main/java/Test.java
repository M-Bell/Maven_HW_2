import org.springframework.beans.BeanMetadataAttribute;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("Asus", new PCProcessor(2.8), 32);
        System.out.println(pc);

        //Dependency from parent pom
        System.out.println(BeanMetadataAttribute.class.getCanonicalName());
    }
}
