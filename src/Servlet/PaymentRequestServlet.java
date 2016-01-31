package Servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pingplusplus.Pingpp;
import com.pingplusplus.model.Charge;

import JsonTypes.PaymentRequest;

/**
 * Servlet implementation class PaymentRequest
 */
@WebServlet("/PaymentRequestServlet")
public class PaymentRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final String apiKey = "sk_test_DSGmv1aLGSeTPennLKiLqDyT";
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		String pay_result = charge(request);
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write(pay_result);
	} //end service

	public String charge(HttpServletRequest request) {
		String json = getRequestContent(request);
		Gson gson = new Gson();
		PaymentRequest paymentRequest = gson.fromJson(json, PaymentRequest.class);
		String channel = paymentRequest.getChannel();
		int amount = paymentRequest.getAmount();
		String client_ip = paymentRequest.getClient_ip();
		String order_no = paymentRequest.getOrder_no();
		String body = "gson_channel:"+channel+"; gson_amount:"+amount+"; gson_client_ip:"+client_ip+"; "+"gson_order_no:"+order_no+";";
		
	    Pingpp.apiKey = apiKey;
		String appId = "app_yTSijH0ej1K8mPmL";
        Charge charge = null;
        Map<String, Object> chargeMap = new HashMap<String, Object>();
        //chargeMap.put("amount", 100);
        chargeMap.put("amount", amount);
        chargeMap.put("currency", "cny");
        chargeMap.put("subject", "Enzo's Subject");
        chargeMap.put("body", body);
        //chargeMap.put("order_no", "123456789");
        //chargeMap.put("channel", "alipay");
        //chargeMap.put("client_ip", "176.31.114.109");
        chargeMap.put("order_no", order_no);
        chargeMap.put("channel", channel);
        chargeMap.put("client_ip", client_ip);
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
	
	public String getRequestContent(HttpServletRequest request){
		StringBuffer sb = new StringBuffer("");
		String result = "";
		try {  
		    BufferedReader br = new BufferedReader(new InputStreamReader(request.getInputStream(), "utf-8"));  
		    String temp;  
		    while ((temp = br.readLine()) != null) {  
		        sb.append(temp);  
		    }  
		    br.close();  
		    result = sb.toString();  
		    return result;
		} catch (Exception e) {  
		    e.printStackTrace(); 
		    return "Error!";
		}  
		
	}
	

}

