import org.junit.Test;

import static org.junit.Assert.*;

public class SILab2Test {

    @Test
    public void everyBranch() {
        List<String> allUsers = new ArrayList<String>();

        User user = new User("ime", "Password@123", "ime@example.com");

        assertFalse(SILab2.function(null, allUsers));

        User user2 = new User(null, null, "ime@example.com");
        assertFalse(SILab2.function(user2, allUsers));

        User user3 = new User("ime", "Ime@123", "ime@example.com");
        assertFalse(SILab2.function(user3, allUsers));

        User user4 = new User("ime", "password", "ime@example.com");
        assertFalse(SILab2.function(user4, allUsers));
       

        assertTrue(SILab2.function(user, allUsers));

    }

    @Test
    public void everyPath() {

        List<String> allUsers = new ArrayList<String>();

        User user = new User("ime", "Password@123", "ime@example.com");

        assertFalse(SILab2.function(null, allUsers));

        User user2 = new User(null, null, "ime@example.com");
        assertFalse(SILab2.function(user2, allUsers));

        User user3 = new User("ime", "Ime@123", "ime@example.com");
        assertFalse(SILab2.function(user3, allUsers));

        User user4 = new User("ime", "Password@", "ime@example.com");
        assertFalse(SILab2.function(user4, allUsers));

        User user5 = new User("ime", "password@123", "ime@example.com");
        assertFalse(SILab2.function(user5, allUsers));

        User user6 = new User("ime", "Password123", "ime@example.com");
        assertFalse(SILab2.function(user6, allUsers));

        assertTrue(SILab2.function(user, allUsers));
        
    }
}