package com.yushan.rxjava.api;

import android.content.Context;

import com.yushan.rxjava.model.CheckIsOpenFarmResponse;
import com.yushan.rxjava.model.LoginRequest;
import com.yushan.rxjava.model.LoginResponse;
import com.yushan.rxjava.model.UserInfoResponse;

import java.util.Map;

import rx.Subscriber;

/**
 * Created by yushan on 2016/7/21.
 */
public interface Api {
    /**
     * 登录
     *
     * @param subscriber
     * @param loginRequest
     */
    void login(Subscriber<LoginResponse> subscriber, LoginRequest loginRequest);

    /**
     * 获取个人基本信息
     *
     * @param subscriber
     */
    void getUserInfo(Subscriber<UserInfoResponse> subscriber);

    /**
     * 检测是否打开健康农场
     */
    void checkIsOpenFarm(Subscriber<CheckIsOpenFarmResponse> subscriber, Map<String, Object> request);

}
