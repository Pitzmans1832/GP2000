package test;

import com.googlecode.jsonrpc4j.JsonRpcServer;

public class TestServer 
{
	private JsonRpcServer server;
	
	public void setup()
	{
		server = new JsonRpcServer(new IncrementerFace()
		{
			Object val;
			public Object getValue()
			{
				try
				{
					return Double.valueOf(Double.parseDouble(val.toString())+1);
				}
				catch (NullPointerException e)
				{
					return new Double("3.8");
				}
			}
			public void setValue(Object o)
			{
				this.val = o;
			}
		});
	}
	public static void main(String[] args)
	{
		TestServer t = new TestServer();
		t.setup();
	}
	
	public interface IncrementerFace
	{
		Object getValue();
		void setValue(Object o);
	}
}
