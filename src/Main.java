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
    //Changes after merge
		Subscriber subscriber3 = new Subscriber("Ali");
		Subscriber subscriber4 = new Subscriber("Kamran");
		Subscriber subscriber5 = new Subscriber("Aliza");
		myChannel.registerObserver(subscriber3);
		myChannel.registerObserver(subscriber4);
		myChannel.registerObserver(subscriber5);
    }
}
