package com.cg.model;


	public class Invoice {
		private String id;
		private String desc;
		private int qty;
		private double unitPrice;



		public Invoice(String i,String d,int q,double u) {
		id=i;
		desc=d;
		qty=q;
		unitPrice=u;
		}
		public String getID() {
		return id;
		}
		public String getDesc() {
		return desc;
		}
		public int getQty() {
		return qty;
		}
		public void setQty(int q) {
		qty=q;
		}
		public double getUnitPrice() {
		return unitPrice;
		}
		public void setUnitPrice(double u) {
		unitPrice=u;
		}
		public double getTotal() {
		return unitPrice*qty;
		}
		public String toString() {
		return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice +"]";
		}
		
		public static void main(String[] args)
		{
		Invoice inv1 = new Invoice("A101", "Pen Red", 888, 0.08);
		System.out.println(inv1);
        inv1.setQty(999);
		inv1.setUnitPrice(0.99);
		System.out.println(inv1);
		System.out.println("id is: " + inv1.getID());
		System.out.println("desc is: " + inv1.getDesc());
		System.out.println("qty is: " + inv1.getQty());
		System.out.println("unitPrice is: " + inv1.getUnitPrice());
		System.out.println("The total is: " + inv1.getTotal());
		}
		}

