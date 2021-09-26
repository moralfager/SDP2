package ObserverPattern;

public class Test {
    public static void main(String[] args) {
        IGAccount igAccount = new IGAccount();
        IObserver f1 = new Follower("Alabama BOY");
        IObserver f2 = new Follower("Trasher GUY");
        igAccount.add(f1);
        igAccount.publishPost("Hello");
        igAccount.publishVideo("example.com/video");
        igAccount.getTodaysPosts();
        igAccount.getVideos();
    }

}
