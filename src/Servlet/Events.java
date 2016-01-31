package Servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pingplusplus.Pingpp;
import com.pingplusplus.model.Charge;

//import com.pingplusplus.exception.PingppException;
//import com.pingplusplus.model.Charge;



/**
 * Servlet implementation class Events
 */
@WebServlet("/Events")
public class Events extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String content  = charge();
		request.setAttribute("content", content);
		request.getRequestDispatcher("/Pages/SimpleContentPrinter.jsp").forward(request, response);
	} //end service
	

	public String charge() {
	    String apiKey = "sk_test_DSGmv1aLGSeTPennLKiLqDyT";
	    Pingpp.apiKey = apiKey;
	    
		String appId = "app_yTSijH0ej1K8mPmL";
        Charge charge = null;
        Map<String, Object> chargeMap = new HashMap<String, Object>();
        chargeMap.put("amount", 100);
        chargeMap.put("currency", "cny");
        chargeMap.put("subject", "Your Subject");
        chargeMap.put("body", "Your Body");
        chargeMap.put("order_no", "123456789");
        chargeMap.put("channel", "alipay");
        chargeMap.put("client_ip", "127.0.0.1");
        Map<String, String> app = new HashMap<String, String>();
        app.put("id",appId);
        chargeMap.put("app", app);
        try {
            //发起交易请求
            charge = Charge.create(chargeMap);
            System.out.println(charge);
            return charge.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return e.toString();
        }
    }
}
