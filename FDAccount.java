package com.bank.model;
public  class FDAccount extends Account  implements Renewable {
	

	private int  tenure;
	private boolean autorenewal;
	
    public void updateAutoRenewal(int tenure )
      {
	   if (tenure>5)
	   {
		   autorenewal= true;
		   
		   System.out.println("Ready for auto renewal");
	   }
	   else
	   {
		   autorenewal=false;
	   
	   System.out.println("auto renewal possible only after 5 year");
	   }
	
       }

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public boolean isAutorenewal() {
		return autorenewal;
	}

	public void setAutorenewal(boolean autorenewal) {
		this.autorenewal = autorenewal;
	}
	


	public void updateautorenewal(int tenure) {
		// TODO Auto-generated method stub
		
	}
	

}
