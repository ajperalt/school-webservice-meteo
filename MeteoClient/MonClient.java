
import com.superwebservice.publictypes.Meteo;
import com.superwebservice.publictypes.MeteoService;


public class MonClient {

	public static void main(String[] args) {
		HelloService serv = new MeteoService(); //pour savoir quel objet créer, aller tt en bas du wsdl
		Hello port = serv.getHelloPort();
		
		//System.out.println(port.sayHello("Titi"));

	}

}
