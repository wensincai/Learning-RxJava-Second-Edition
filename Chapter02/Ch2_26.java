import io.reactivex.Observable;

public class Ch2_26 {
    public static void main(String[] args) {
        Observable.just(1 / 0)
        //Observable.just(1)
                //.map(i -> i / 0)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("Error captured: " + e));
    }
}