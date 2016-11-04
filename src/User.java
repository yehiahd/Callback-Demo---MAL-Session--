
public class User {
	
	private Souq souq;
	
	public User() {
		// TODO Auto-generated constructor stub
		souq = new Souq();
		souq.setListener(new OnGetItemListener() {
			
			@Override
			public void onGet() {
				// TODO Auto-generated method stub
				System.out.println("Now Item Available");
			}
		});
	}

}
