package cn.ycbjie.ycaudioplayer.ui.advert.model.api;

import cn.ycbjie.ycaudioplayer.ui.advert.model.bean.AdvertCommon;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;


public interface AdvertApi {


    @GET("fundworks/media/getFlashScreen")
    Observable<AdvertCommon> getSplashImage(@Query("type") int type);


}
