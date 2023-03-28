import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject{
    private List<Observer> observers;

    public YouTubeChannel() {
        this.observers = new ArrayList<>();
    }
    
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer observer : this.observers) {
            observer.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        notifyObservers(videoTitle);
    }
}
