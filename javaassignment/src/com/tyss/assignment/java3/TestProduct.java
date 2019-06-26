class TestProduct
{
	public static void main(String[] args) {
		Product4bean p[]=new Product4bean[4];
		DBP1 d=new DBP1();
		
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Product4bean();
		//	d[i]=new DB1();
		}
		p[0].setId(123);
		p[0].setName("oil");
		p[1].setId(456);
		p[1].setName("soap");
		p[2].setId(891);
		p[2].setName("pen");
		p[3].setId(321);
		p[3].setName("ink");
		for(int i=0;i<p.length;i++)
			d.pass(p[i]);

	}
}