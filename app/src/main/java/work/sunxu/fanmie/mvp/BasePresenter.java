package work.sunxu.fanmie.mvp;

/**
 * class description here
 *
 * @author sunxu
 * @since 2018-08-10
 */
public interface BasePresenter<T extends BaseView>{

    void attachView(T view);

    void detachView();
}
