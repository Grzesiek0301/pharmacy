package models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedicineTest {

    @Test
    public void shouldReturnChangedName() {
        Medicine medicine = new Medicine("test1", 10);

        medicine.setMedicineName("test2");

        Assert.assertEquals("test2", medicine.getMedicineName());
    }

    @Test
    public void shouldReturnChangedPrice() {
        Medicine medicine = new Medicine("test1", 10);

        medicine.setMedicinePrice(20);

        Assert.assertEquals(20.0, medicine.getMedicinePrice(), 0.001);
    }



}