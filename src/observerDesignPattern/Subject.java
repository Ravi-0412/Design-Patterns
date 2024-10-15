package observerDesignPattern;

public interface Subject {

    //register an observer to a subject
    void register(observerDesignPattern.Observer observer);

    //unregister an observer from a subject
    void unregister(observerDesignPattern.Observer observer);

    //notify all observers for the change in subject's state
    void notifyObservers();

    //method to get update from subject by the observer
    Object getUpdate();

    //post message to observers
    void postMessage(String message);
}