package testserver;

import com.googlecode.jsonrpc4j.JsonRpcServer;
import statenumber.StateNumberRpcInterface;

public class Main {
	
	private static JsonRpcServer StateNumberRpcServer;
	
	public static void main(String[] args) {
		StateNumberRpcServer = new JsonRpcServer(new StateNumberRpcServerHandler(0));
	}
	
}

class StateNumberRpcServerHandler implements StateNumberRpcInterface {
	
	int number;
	
	public StateNumberRpcServerHandler() {
		number = 0;
	}
	
	public StateNumberRpcServerHandler(int num) {
		this.number = num;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int num) {
		this.number = num;
	}
	
}