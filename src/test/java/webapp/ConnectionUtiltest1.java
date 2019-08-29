package webapp;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.revature.webapp.controller.ConnectionUtil;

public class ConnectionUtiltest1 {

	@Test
	public void testConnection() {
        Connection connection = ConnectionUtil.getConnection();
        assertNotNull(connection);
    }
 

}
