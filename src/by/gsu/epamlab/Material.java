package by.gsu.epamlab;

public enum Material {
    STEEL("steel", 7850.0),
    COPPER("copper", 8500.0);

    private String name = "";
    private double density;

    Material() {
    }

    Material(String name, double density) {
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public double getDensity() {
        return density;
    }

    @Override
    public String toString() {
        return name + CSVExporter.FIELD_SEPARATOR + density;
    }
}
