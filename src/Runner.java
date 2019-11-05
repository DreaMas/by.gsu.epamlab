import by.gsu.epamlab.Material;
import by.gsu.epamlab.Subject;

public class Runner {
    public static void main(String[] args) {
        Subject subject = new Subject("wire", Material.STEEL, 0.03);
        System.out.println(subject);
        subject.setMaterial(Material.COPPER);
        System.out.println("The wire mass is " + subject.getMass() + " kg.");

    }
}
