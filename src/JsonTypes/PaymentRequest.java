package JsonTypes;

public class PaymentRequest
{
	private String channel;
	private int amount;
	private String client_ip;
	private String order_no;
	
	public String getChannel(){
		return channel;
	}
	
	public void setChannel(String channel){
		this.channel = channel;
	}
	
	public int getAmount(){
		return amount;
	}
	
	public void setAmount(int amount){
		this.amount = amount;
	}
	
	public String getClient_ip(){
		return client_ip;
	}
	
	public void setClient_ip(String client_ip){
		this.client_ip = client_ip;
	}
	
	public String getOrder_no(){
		return order_no;
	}
	
	public void setOrder_no(String order_no){
		this.order_no = order_no;
	}
	
}
