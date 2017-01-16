package users;
import com.googlecode.jsonrpc4j.JsonRpcError;
import com.googlecode.jsonrpc4j.JsonRpcErrors;
import com.googlecode.jsonrpc4j.JsonRpcParam;

public interface UserService 
{
    @JsonRpcErrors({
        @JsonRpcError(exception=UserExistsException.class,
            code=-5678, message="User already exists", data="The Data"),
        @JsonRpcError(exception=Throwable.class,code=-187)
    })
    User createUser(@JsonRpcParam(value="theUserName") String userName, @JsonRpcParam(value="thePassword") String password);
}
