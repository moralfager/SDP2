package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class IGAccount implements IObservable{
    List<String> post = new ArrayList<>();
    List<String> videos = new ArrayList<>();
    List<IObserver> followers = new ArrayList<>();
    public static String POST = "Post";
    public static String VIDEO = "Video";

    public void publishPost(String post){
        this.post.add(post);
        notifyall(POST);
    }
    public void publishVideo(String url){
        this.videos.add(url);
        notifyall(VIDEO);
    };
    public List<String> getTodaysPosts(){
        notifyall(POST);
        return post;
    };
    public List<String> getVideos(){
        notifyall(VIDEO);
        return videos;
    };

    public void removePost(String post){
        this.post.remove(post);
        notifyall(POST);
    }

    @Override
    public void add(IObserver observer) {
        this.followers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.followers.remove(observer);
    }

    @Override
    public void notifyall(String Type) {
        for(IObserver observer : followers){
            if(Type == "Video"){
                observer.update(VIDEO, this.videos);
            }else if(Type == "Post")
                observer.update(POST, this.post);
        }

    }
}
