import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetEquality() {
        assertTrue(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(1.0, Length.LengthUnit.FEET)));
    }

    @Test
    public void testInchesEquality() {
        assertTrue(new Length(1.0, Length.LengthUnit.INCHES)
                .equals(new Length(1.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testFeetInchesComparison() {
        assertTrue(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(12.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testFeetInequality() {
        assertFalse(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(2.0, Length.LengthUnit.FEET)));
    }

    @Test
    public void testInchesInequality() {
        assertFalse(new Length(1.0, Length.LengthUnit.INCHES)
                .equals(new Length(2.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testCrossUnitInequality() {
        assertFalse(new Length(1.0, Length.LengthUnit.FEET)
                .equals(new Length(10.0, Length.LengthUnit.INCHES)));
    }

    @Test
    public void testSameReference() {
        Length l = new Length(1.0, Length.LengthUnit.FEET);
        assertTrue(l.equals(l));
    }

    @Test
    public void testNullComparison() {
        assertFalse(new Length(1.0, Length.LengthUnit.FEET)
                .equals(null));
    }
}