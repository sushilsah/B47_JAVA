package com.tns.genericinterface;

public class GenericInterfaceDemo  implements GenericInterface<Integer>{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericInterfaceDemo gid = new GenericInterfaceDemo();
		 int res=gid.display(2000);
		System.out.println(res);

	}

	@Override
	public Integer display(Integer arg) {
		// TODO Auto-generated method stub
		return 10000 +arg;
	}

}
