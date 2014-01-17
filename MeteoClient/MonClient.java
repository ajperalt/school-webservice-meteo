import fr.upsud.ws.Hello;
import fr.upsud.ws.HelloService;



public class MonClient {

	public static void main(String[] args) {
		HelloService serv = new HelloService(); //pour savoir quel objet créer, aller tt en bas du wsdl
		Hello port = serv.getHelloPort();
		
		System.out.println(port.sayHello("Titi"));

	}

}
