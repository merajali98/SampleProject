package test.java.items;


import main.java.gst.Gst;
import main.java.gst.slabs.GstFor18Slab;
import main.java.items.Item;
import main.java.items.ItemImplementation;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ItemImplementationTest {

    Gst gst;
    Item item;

    @Before
    public void setUp(){
        gst =new GstFor18Slab();
        item=new ItemImplementation(1,100);
    }

    @Test
    public void calculateTaxAmountOnEachItem_itShouldReturnCalculatedTaxOnItemWhenGstObjectIsProvided(){
        double actualTax=item.calculateTaxAmountOnEachItem(gst);
        Assert.assertEquals(18.0,actualTax,0.0);

    }

    @Test
    public void calculateTaxAmountOnEachItem_itShouldReturnTotalAmountWithCalculatedTaxOnItemWhenGstObjectIsProvided(){
        double actualTax=item.calculateTotalAmountAfterAddingTax(gst);
        Assert.assertEquals(118.0,actualTax,0.0);

    }

}
