package abstract_class;

 abstract class Components
 {
	 abstract void sensors();
	 abstract void Network();
	 abstract void Verilog();
	 
 }
 abstract class Components1 extends Components
 {
	 void sensors()
	 {
		 System.out.println("DHT22 Sensor,is belongs to IoT");
	 }
	 void  Network()
	 {
		 System.out.println(" IPv4 and IPv6 Address is belongs to CISCO");
	 }
	 
 }
 class Components2 extends Components1
 {
	  void Verilog()
	  {
		  System.out.println("Chip Fabrication");
	  }
 }
 public class Electronics 
 {
	 public static void main(String[] args)
	 {
		 Components2 c2=new  Components2();
		 c2.sensors();
		 c2.Network();
		 c2.Verilog();
		 
	 }

	 
}
