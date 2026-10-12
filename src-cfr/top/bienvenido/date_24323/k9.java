/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.Signature
 *  android.os.Binder
 *  android.os.IInterface
 *  kotlin.jvm.internal.Intrinsics
 */
package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.IInterface;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.date_24323.p2;

public abstract class k9 {
    public static final p2 \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = new p2("mPM");

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Context object) {
        Object object2;
        PackageManager packageManager;
        block18: {
            block17: {
                block16: {
                    block15: {
                        if (Intrinsics.areEqual((Object)PackageInfo.CREATOR.getClass().getClassLoader(), (Object)PackageInfo.class.getClassLoader())) break block15;
                        return null;
                    }
                    if (Intrinsics.areEqual((Object)Signature.CREATOR.getClass().getClassLoader(), (Object)Signature.class.getClassLoader())) break block16;
                    return null;
                }
                Object object3 = object;
                p2 p22 = \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                try {
                    packageManager = object3.getApplicationContext().getPackageManager();
                }
                catch (Exception exception) {
                    return null;
                }
                if (!Intrinsics.areEqual((Object)packageManager.getClass().getClassLoader(), (Object)PackageManager.class.getClassLoader())) {
                    return null;
                }
                if (packageManager == null) {
                    return null;
                }
                try {
                    object2 = p22.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(packageManager);
                    if (object2 != null) break block17;
                    return null;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            if (!(object2 instanceof IInterface)) return object2;
            packageManager = ((IInterface)object2).asBinder();
            if (Intrinsics.areEqual((Object)packageManager.getClass().getClassLoader(), (Object)Binder.class.getClassLoader())) break block18;
            return null;
        }
        if (!Proxy.isProxyClass(packageManager.getClass())) return object2;
        return null;
    }
}

