class CartItem{
  // variables
  String itemName;
  double itemPrice;
  int quantity;
  boolean onSale;

  //1: Constructor
  CartItem(String itemName, double itemPrice,int quantity, boolean Onsale){
  this.itemName = itemName;
  this.itemPrice = itemPrice;
  this.quantity = quantity;
  this.Onsale = Onsale;
  }

  
  
  //2: fn getPrice() to get discounted price (if applicable)
  getPrice(){
    if(this.onSale){
      return this.itemPrice*0.9;
    }
    else {return this.itemPrice;
    }
  }


  

}