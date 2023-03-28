public class Main {
    public static void main(String[] args) throws Exception {
        YouTubeChannel myChannel = new YouTubeChannel();

		Subscriber subscriber1 = new Subscriber("Alice");
		Subscriber subscriber2 = new Subscriber("Bob");

		myChannel.registerObserver(subscriber1);
		myChannel.registerObserver(subscriber2);

		// Later on, when a new video is uploaded
		myChannel.uploadVideo("New Video Title");
		
		// Changes from my branch
		Subscriber subscriber3 = new Subscriber("Ali");
		Subscriber subscriber4 = new Subscriber("Usman");
		myChannel.registerObserver(subscriber3);
		myChannel.registerObserver(subscriber4);
    }
}
