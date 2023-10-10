
import java.awt.EventQueue;
public class StartHere {
	public static void main(String[] s) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserI frame = new UserI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}	
}
