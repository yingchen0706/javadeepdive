import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicInvocationHandler implements InvocationHandler {
	private Object subject;
	
	public DynamicInvocationHandler(Object subject) {
		this.subject = subject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Before invoking");
		Object result = method.invoke(subject, args);
		System.out.println("End invoking");

		return result;
	}

}
