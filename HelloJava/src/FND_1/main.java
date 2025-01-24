package FND_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CNVTNUM cnvt1 = new CNVTNUM();
		CNVTNUM cnvt2 = new CNVTNUM();
		CNVTNUM cnvt3 = new CNVTNUM();
		CNVTNUM cnvt4 = new CNVTNUM();
	
		TTL7446 ttl1 = new TTL7446();
		TTL7446 ttl2 = new TTL7446();
		TTL7446 ttl3 = new TTL7446();
		TTL7446 ttl4 = new TTL7446();
		
		DISPFND fnd1 = new DISPFND();
		DISPFND fnd2 = new DISPFND();
		DISPFND fnd3 = new DISPFND();
		DISPFND fnd4 = new DISPFND();
		
		int [] num = new int [4];
		int [] out = new int [7];
		
		cnvt1.setNum(1);
		cnvt2.setNum(2);
		cnvt3.setNum(3);
		cnvt4.setNum(4);
		
		ttl1.setInput(cnvt1.cnvt());
		ttl2.setInput(cnvt2.cnvt());
		ttl3.setInput(cnvt3.cnvt());
		ttl4.setInput(cnvt4.cnvt());
		
		fnd1.setInput(ttl1.setTable());
		fnd2.setInput(ttl2.setTable());
		fnd3.setInput(ttl3.setTable());
		fnd4.setInput(ttl4.setTable());
		
		fnd1.dispFND();
		fnd2.dispFND();
		fnd3.dispFND();
		fnd4.dispFND();
		
		
		
		
		/* cnvt.setNum(5);
		cnvt.cnvt();
		num = cnvt.getOutput();
		
		ttl.setInput(num);
		ttl.setTable(); */
		
		/*for(int i =0; i <4; i++)
			System.out.print(num[3-i]); */
		
		/*num = cnvt.cnvt();
		ttl.setInput(num);
		out = ttl.setTable();
		fnd.setInput(out);
		
		fnd.dispFND();
		*/
	}

}
	
 