public class Main {
  public static void main(String[] args) throws Exception {
		Thread receiver = new Thread(new Receiver());
		receiver.start();
    Thread sender = new Thread(new Sender());
		sender.start();
	}
}