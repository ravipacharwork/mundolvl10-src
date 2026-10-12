package top.bienvenido.date_24323;

import android.content.Intent;
import android.net.ProxyInfo;
import java.net.URI;
import java.util.Collections;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w5.class */
public abstract class w5 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m549(String str, String str2, String str3) {
        Object obj;
        ProxyInfo proxyInfoBuildDirectProxy;
        try {
            Result.Companion companion = Result.Companion;
            if (str.length() == 0) {
                proxyInfoBuildDirectProxy = ProxyInfo.buildDirectProxy("", 0, Collections.EMPTY_LIST);
            } else {
                URI uriCreate = URI.create(str);
                proxyInfoBuildDirectProxy = ProxyInfo.buildDirectProxy(uriCreate.getHost(), uriCreate.getPort(), CollectionsKt.listOf(new String[]{"*.cn", "localhost", "127.*", "[::1]", "0.0.0.0", "[::0]"}));
            }
            obj = Result.constructor-impl(Integer.valueOf(w3.f375.mo87(new Intent("android.intent.action.PROXY_CHANGE").addFlags(603979776).putExtra("android.intent.extra.PROXY_INFO", proxyInfoBuildDirectProxy).setPackage(str2), str3)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.constructor-impl(ResultKt.createFailure(th));
        }
        Result.exceptionOrNull-impl(obj);
    }
}
