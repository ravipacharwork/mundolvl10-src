/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.ProxyInfo
 *  android.os.Parcelable
 *  kotlin.Result
 *  kotlin.ResultKt
 *  kotlin.collections.CollectionsKt
 */
package top.bienvenido.date_24323;

import android.content.Intent;
import android.net.ProxyInfo;
import android.os.Parcelable;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import top.bienvenido.date_24323.w3;

public abstract class w5 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(String object, String string, String string2) {
        block7: {
            Throwable throwable2;
            block6: {
                ProxyInfo proxyInfo;
                Object object2;
                try {
                    object2 = object;
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                if (((String)object2).length() == 0) {
                    proxyInfo = ProxyInfo.buildDirectProxy((String)"", (int)0, (List)Collections.EMPTY_LIST);
                } else {
                    object = URI.create((String)object);
                    proxyInfo = ProxyInfo.buildDirectProxy((String)((URI)object).getHost(), (int)((URI)object).getPort(), (List)CollectionsKt.listOf((Object[])new String[]{"*.cn", "localhost", "127.*", "[::1]", "0.0.0.0", "[::0]"}));
                }
                object = proxyInfo;
                object = Result.constructor-impl((Object)w3.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403(new Intent("android.intent.action.PROXY_CHANGE").addFlags(0x24000000).putExtra("android.intent.extra.PROXY_INFO", (Parcelable)object).setPackage(string), string2));
                break block7;
            }
            object = Result.constructor-impl((Object)ResultKt.createFailure((Throwable)throwable2));
        }
        Result.exceptionOrNull-impl((Object)object);
    }
}

