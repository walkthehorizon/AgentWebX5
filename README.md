
特别注意：本库起始于AgentWeb 4.1.9 androidx版本，并且不打算支持support版本,后续主要保证持续跟进AgentWeb和X5的稳定版更新，未来sample亦会有所不同

## AgentWebX5 介绍

基于腾讯X5内核版的 [AgentWeb](https://github.com/Justson/AgentWeb) ，简单易用 ， 带有进度条 、 支持文件上传 、 下载 、 简化 Javascript 通信 、 链式调用  、性能更优 。更多使用请参照上面的 sample 。

<div style="display: flex;flex-direction: row;justify-content: center" width="100%">
    <img src="./img/arch.webp"/>
</div>

## AgentWebX5 功能
1. 支持进度条以及自定义进度条
2. 支持文件下载
3. 支持文件下载断点续传
4. 支持下载通知形式提示进度
5. 简化 Javascript 通信
6. 支持 Android 4.4 Kitkat 以及其他版本文件上传
7. 支持注入 Cookies
8. 支持全屏播放视频
9. 支持调起微信支付
10. 支持调起支付宝
11. 默认支持定位
12. 支持传入IWebLayout(下拉回弹效果)

## 引入

* Gradle
   ```
   compile 'com.github.Justson:agentwebX5-core:4.1.9'
   ```

## Android WebView
如果你更喜欢Android WebView ，请切换到这个仓库
[AgentWeb](https://github.com/Justson/AgentWeb)

## 使用

1. 直接通过Gradle依赖腾讯X5内核最新 [SDK](https://x5.tencent.com/tbs/), 亦可下载后SDK本地依赖。
2. 引入 `AgentWebX5`
3. 需要全局初始化X5内核 `QbSdk.initTbsSettings(map)`

## 注意事项
1. AgentWebX5 内部并没有直接依赖X5库 ，需要用户到[腾讯X5官网](https://x5.tencent.com/tbs/)下载 ， 并在项目中依赖该库 。
2. 由于使用的是 X5 内核，不是 Google 官方控件， 所以很多第三方开源组件不支持 。
3. 支付宝需要引入[支付宝SDK](https://open.alipay.com/platform/home.htm)项目中依赖上支付宝SDK即可 ,微信支付不需要做任何操作。
4. 注意权限 。
5. 注意腾讯X5库官方升级并替换成最新的库。
6. [onJsAlert 阻塞 ](https://github.com/Justson/AgentWebX5/issues/21)


## 问答

### AgentWeb 和 AgentWebX5 有什么区别吗？
AgentWebX5 和 AgentWeb 区别在于 AgentWeb 依赖于系统 WebView ，而 AgentWebX5 依赖是腾讯X5内核 ， AgentWebX5 是把 AgentWeb 内部 Android系统提供的WebView 替换成了X5库WebView 。
























