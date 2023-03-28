import java.util.Scanner;
class Product{
     int pCode,price;
     String pName;
     Product(int pCode, String pName,int price)
     {
      this.pCode=pCode;
      this.pName=pName;
      this.price=price;
      }
}
class Products{
     public static void main (String[] args)
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Product code:");
	 int pCode=sc.nextInt();
	 System.out.println("Enter Product Name:");
	 String pName=sc.next();
	 System.out.println("Enter Product Price:");
	 int price=sc.nextInt();
	 Product[] ps=new Product[3];
	 ps[0]=new Product(pCode,pName,price);
	 ps[1]=new Product(101,"pen",10);
	 ps[2]=new Product(102,"pencil",20);
	 int minprice=ps[0].price;
	 System.out.println("pCode \tpName \tprice");
	 for(Product p:ps)
	 {
	  System.out.println(p.pCode+"\t"+p.pName+"\t"+p.price);
	  if(minprice>p.price)
	  {
 	    minprice=p.price;
           }
          }
	System.out.println("=====================");
	System.out.println("Lowest cost product \t");
	System.out.println("=====================");
	for(Product p:ps)
        {
	 if(minprice==p.price)
	 {
	  System.out.println("ProductCode:"+p.pCode);
	  System.out.println("ProductName:"+p.pName);
	  System.out.println("Productprice:"+p.price);
          }
        }
     }
}	
