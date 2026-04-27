public class Length {

    private final double value;
    private final LengthUnit unit;

    // Enum for units (base unit = inches)
    public enum LengthUnit {
        FEET(12.0),
        INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    // Constructor
    public Length(double value, LengthUnit unit) {
        if (unit == null) {
            throw new IllegalArgumentException("Unit cannot be null");
        }
        this.value = value;
        this.unit = unit;
    }

    // Convert to base unit (inches)
    private double toBaseUnit() {
        return this.value * this.unit.getConversionFactor();
    }

    // Compare logic
    public boolean compare(Length other) {
        return Double.compare(this.toBaseUnit(), other.toBaseUnit()) == 0;
    }

    // equals override
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Length other = (Length) obj;
        return this.compare(other);
    }
}