package FND_0;

// 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 수정금지 

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CNVTNUM cnvt = new CNVTNUM();
		TTL7446 ttl = new TTL7446();
		DISPFND fnd = new DISPFND();
		
		int [] num = new int [4];
		int [] out = new int [7];
		
		num = cnvt.cnvt();
		ttl.setInput(num);
		out = ttl.setTable();
		fnd.setInput(out);
		
		fnd.dispFND();
	}

}
