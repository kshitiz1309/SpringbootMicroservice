package observerPattern;

interface Subject {
    void subscriber(Observer ob);
    void unSubscriber(Observer ob);

    void newVideoUploaded(String title);
}
