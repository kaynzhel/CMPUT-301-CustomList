import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    static CustomList list;

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Before
    public void setup(){
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest(){
        City c = new City("Edmonton", "Alberta");
        int size = list.getCount();
        list.addCity(c);
        assertEquals(size+1, list.getCount());
    }

    @Test
    public void testHasCity() {
        City includedCity = mockCity();
        list.addCity(includedCity);
        // checks if Edmonton exists
        assertEquals(true, list.hasCity(includedCity));
        // checks if Calgary exists, it shouldn't
        City notIncludedCity= new City ("Calgary", "Alberta");
        assertEquals(false, list.hasCity(notIncludedCity));
    }
}
