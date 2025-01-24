package FND_0;

public class main_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
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
		fnd4.dispFND();*/
		
		FND fnd1 = new FND();
		FND fnd2 = new FND();
		FND fnd3 = new FND();
		FND fnd4 = new FND();
		
		fnd1.setNum(1);
		//fnd1.cnvtNum();
		fnd1.setTable();		
		fnd1.fillFND();
		
		fnd2.setNum(2);
		//fnd2.cnvtNum();
		fnd2.setTable();		
		fnd2.fillFND();
		
		fnd3.setNum(3);
		//fnd3.cnvtNum();
		fnd3.setTable();		
		fnd3.fillFND();
		
		fnd4.setNum(4);
		//fnd4.cnvtNum();
		fnd4.setTable();		
		fnd4.fillFND();
		
		fnd1.dispFND();
		fnd2.dispFND();
		fnd3.dispFND();
		fnd4.dispFND();
		
		
	}

}
