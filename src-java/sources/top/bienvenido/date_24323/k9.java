package top.bienvenido.date_24323;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/k9.class */
public abstract class k9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final p2 f205 = new p2("mPM");

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m243(Context context) {
        PackageManager packageManager;
        try {
            if (!Intrinsics.areEqual(PackageInfo.CREATOR.getClass().getClassLoader(), PackageInfo.class.getClassLoader()) || !Intrinsics.areEqual(Signature.CREATOR.getClass().getClassLoader(), Signature.class.getClassLoader())) {
                return null;
            }
            p2 p2Var = f205;
            try {
                PackageManager packageManager2 = context.getApplicationContext().getPackageManager();
                packageManager = packageManager2;
                if (!Intrinsics.areEqual(packageManager2.getClass().getClassLoader(), PackageManager.class.getClassLoader())) {
                    packageManager = null;
                }
            } catch (Exception unused) {
            }
            if (packageManager == null) {
                return null;
            }
            Object objMo393 = p2Var.f270.mo393(packageManager);
            if (objMo393 == null) {
                return null;
            }
            if (objMo393 instanceof IInterface) {
                IBinder iBinderAsBinder = ((IInterface) objMo393).asBinder();
                if (!Intrinsics.areEqual(iBinderAsBinder.getClass().getClassLoader(), Binder.class.getClassLoader()) || Proxy.isProxyClass(iBinderAsBinder.getClass())) {
                    return null;
                }
            }
            return objMo393;
        } catch (Exception unused2) {
            return null;
        }
    }
}
