package com.rcplatform.livechat.payment.api;

import com.rcplatform.livechat.payment.bean.AppStoreRequest;
import com.rcplatform.livechat.payment.bean.AppStoreResponse;
import com.rcplatform.livechat.payment.bean.AppStoreSubscriptionResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Yang Peng on 2017/5/10.
 *
 * @Description: app store 支付验证接口
 */
public interface AppStorePaymentApi {


     /**
      * app store 内购支付验证
      * @param appStoreRequest 收据对象 password receipt-data
      * @return 验证结果
      */
     @POST("/verifyReceipt")
     Call<AppStoreResponse> verifyReceipt(@Body AppStoreRequest appStoreRequest);


     /**
      *  app store 订阅支付验证
      * @param appStoreRequest 收据对象 password receipt-data
      * @return 验证结果
      */
     @POST("/verifyReceipt")
     Call<AppStoreSubscriptionResponse> subscriptionVerifyReceipt(@Body AppStoreRequest appStoreRequest);
}
