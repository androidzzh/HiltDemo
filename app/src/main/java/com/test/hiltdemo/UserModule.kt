package com.test.hiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton


@InstallIn(ApplicationComponent::class)//
@Module
class UserModule {
    /**
     * ioc容器获取实例的第二种实现方式（一般获取外部实例如Retrofit等）
     * 使用@module注解，@provides告诉ioc容器如何获取实例
     */
    @Singleton
    @Provides
    fun getUser():User{
        return User()
    }
}