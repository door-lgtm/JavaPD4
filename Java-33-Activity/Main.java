class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){

	//3: create 3 new item objects
	CartItem Milk = new CartItem("Milk",3.00,1,false);
  CartItem Apple = new CartItem("Apple",2.50,2,true);
  CartItem Cucumber = new CartItem("Cucumber",4.00,2,true);


	
	//4: display name & original price of items that are on sale
	print("Milk is 3.00")
	
	//5: subtotal (for all quantities of all items in cart, using discounted prices)
	
	
	// display subtotal, tax and total
    
  }

}