package encapsulation;

public class MainEncap {
	
	public static void main(String[] args) {
		
		System.out.println("Person Details ");
		
		Person p = new Person();
		p.setpersonName("Rahul");
		p.setpersonAge(34);
		
		System.out.println("Person Name : "+p.getpersonName());
		System.out.println("Persone Age : "+p.getpersonAge());
		
		System.out.println();
		System.out.println("----------------------");
		
		System.out.println("Bank Details");
		
		BankAccount bk = new BankAccount();
		bk.setBalance(50000.0);  // the actual balance.
		System.out.println("Balance is : "+ bk.getBalance());
		bk.setAdd(56);  // using set we can only set amount.
		System.out.println("Amount added : " + bk.getAdd());
		
		bk.setWithdraw(1200);
		System.out.println("Amount withdrawn remaning balance : "+ bk.getWithdraw());

		System.out.println();
		
		Student st = new Student();
		st.setMarks(123);
		st.setName("Ganesh Kumar");
		System.out.println("Name :" + st.getName());
		System.out.println("Marks :" +st.getMarks());
		
		System.out.println();
		Login lg = new Login();
		lg.setMyLogin("GaneshKumar");
		lg.setMyPassword("Ganesh@1234");
		
		System.out.println("User Name : "+ lg.getMyLogin());
		System.out.println("Password : "+ lg.getMyPassword());
		
		System.out.println();
		
		Book bok = new Book(599);
		bok.setAuthor("Sham Kumar");
		bok.setTitle("Atomic Habbits ");
		
		System.out.println("Name of Author : "+ bok.getAuthor());
		System.out.println("Book Title : "+ bok.getTitle());
		System.out.println("Prise of Book : "+bok.getPrise());

		System.out.println();
	    System.out.println("Product Details ");
	    Product p1 = new Product();
	    p1.setProductID(23433);
	    p1.setproductQuantity(34);
	    System.out.println("Product Id : "+ p1.getProductId());
	    System.out.println("Product Quantity : "+ p1.getproductQuantity());
	}

}


