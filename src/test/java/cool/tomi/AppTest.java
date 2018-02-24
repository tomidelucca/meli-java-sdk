package cool.tomi;

import cool.tomi.models.Item;
import cool.tomi.services.ItemService;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {

    public AppTest(String testName) {
        super(testName);
    }


    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        ItemService service = new ItemService();
        Item item = service.getItemWithId("MLA679060698").getValue();
        assertEquals("MLA679060698", item.getId());
    }
}
