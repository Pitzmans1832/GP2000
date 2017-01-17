package test;

import java.io.ByteArrayOutputStream;

import com.googlecode.jsonrpc4j.JsonRpcClient;

public class TestClient 
{
	private JsonRpcClient client;
	private ByteArrayOutputStream byteArrayOutputStream;
	
	public void setUp()
	{
		client = new JsonRpcClient();
		byteArrayOutputStream = new ByteArrayOutputStream();
	}
	public void tearDown()
	{
		client = null;
	}
}
