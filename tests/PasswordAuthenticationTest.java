package authentication.test;

import static org.junit.Assert.*;

import org.junit.Test;

import authentication.PasswordAuthentication;

public class PasswordAuthenticationTest {

	@Test
	public void hashTest() {
		String pass = "12345abcde";
		String prevPass = new PasswordAuthentication().hash(pass.toCharArray());
		String newPass = new PasswordAuthentication().hash(pass.toCharArray());
		assertNotEquals(prevPass, newPass);
		String fakePass = new PasswordAuthentication().hash("12345abcdE".toCharArray());
		assertNotEquals(prevPass, fakePass);
	}
	
	@Test
	public void authenticateTest() {
		String pass = "12345abcde";
		String hash = new PasswordAuthentication().hash(pass.toCharArray());
		assertEquals(true, new PasswordAuthentication().authenticate(pass.toCharArray(), hash));
		
		String fakeHash = new PasswordAuthentication().hash("12345abcdE".toCharArray());
		assertEquals(false, new PasswordAuthentication().authenticate(pass.toCharArray(), fakeHash));
	}

}
