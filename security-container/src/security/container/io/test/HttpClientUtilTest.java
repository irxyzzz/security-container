package security.container.io.test;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import security.container.io.HttpClientUtil;

public class HttpClientUtilTest {

	@Test
	public void testGet() {
		fail("Not yet implemented");
	}

	@Test
	public void testPost() {
		String url = "http://security.ihsu.net:8080/SecurityServer/admit.do?p=login";
		Map<String, String> params = new HashMap<String, String>();
		params.put("user-name", "ihsu");
		params.put("password", "ihsu");
		String res = HttpClientUtil.post(url, params);
		System.out.println(res);
	}

	@Test
	public void testUpload() {
		String url = "http://security.ihsu.net:8080/SecurityServer/file.do?type=upload";
		Map<String, String> params = new HashMap<String, String>();
		params.put("filename", "test111");
		String path = "D:/love.sql";
		String res = HttpClientUtil.upload(url, params, path);
		System.out.println(res);
	}

}
