package test;


import static org.junit.jupiter.api.Assertions.*;
import java.sql.SQLException;
import org.junit.jupiter.api.*;

import com.junit.DBconnectivity;

class DBconnectivityTest {

    private DBconnectivity db;

    @BeforeEach
    void setUp() throws SQLException {
        db = new DBconnectivity();
        db.makeConnection();
    }

    @AfterEach
    void tearDown() throws SQLException {
        db.disconnect();
    }

    @Test
    void testConnectionIsEstablished() throws SQLException {
        assertNotNull(db.getConnection(), "Connection should not be null");
        assertFalse(db.getConnection().isClosed(), "Connection should be open");
    }

    @Test
    void testConnectionIsClosed() throws SQLException {
        db.disconnect();
        assertTrue(db.getConnection().isClosed(), "Connection should be closed");
    }
}
