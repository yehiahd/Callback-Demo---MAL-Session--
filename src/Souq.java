
public class Souq {
	
	OnGetItemListener listener;
	
	public Souq() {
		// TODO Auto-generated constructor stub
	}

	public OnGetItemListener getListener() {
		return listener;
	}

	public void setListener(OnGetItemListener listener) {
		this.listener = listener;
		notifi();
	}
	
	public void notifi(){
		listener.onGet();
	}
	
	

}
