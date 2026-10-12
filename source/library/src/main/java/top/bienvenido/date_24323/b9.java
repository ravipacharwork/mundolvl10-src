package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Service;
import android.os.ServiceManager;
import android.os.ServiceWithMetadata;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b9.class */
public final class b9 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final n9 f29 = new n9(0);

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Map f30;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Service m68(n4 n4Var) {
        return Service.binder(n4Var);
    }

    static {
        u2 s2Var;
        Map map;
        r2 r2Var;
        try {
            try {
                Field declaredField = ServiceManager.class.getDeclaredField("sCache");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var = u2.f337;
            }
            map = (Map) s2Var.mo393(null);
        } catch (Exception unused2) {
            map = c0031x7011f1e3;
            C0031x7011f1e3 c0031x7011f1e3 = new C0031x7011f1e3(0);
        }
        f30 = map;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m70() {
        u2 s2Var;
        r2 r2Var;
        try {
            try {
                Field declaredField = ServiceManager.class.getDeclaredField("sServiceManager");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField);
                }
            } catch (Exception unused) {
                s2Var = u2.f337;
            }
            u2 u2Var = s2Var;
            d2 d2Var = u4.f339;
            Object objMo393 = u2Var.mo393(null);
            if (objMo393 == null) {
                return;
            }
            d1 d1Var = new d1(objMo393, d2Var);
            d1Var.m118(new int[]{-1273953665, 1923498125}, new y8(a9.f8));
            if (AbstractC0065x6082d607.f509dj) {
                Function1 function1 = AbstractC0065x6082d607.f510x541a43c1 ? b9::m67 : b9::m68;
                int[] iArr = new int[2];
                iArr[0] = -837857901;
                iArr[1] = -501100219;
                d1Var.m118(iArr, new y8(function1));
            }
            s2Var.mo394((Object) null, d1Var.f57);
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Service m67(n4 n4Var) {
        ServiceWithMetadata serviceWithMetadata = new ServiceWithMetadata();
        serviceWithMetadata.service = n4Var;
        return Service.serviceWithMetadata(serviceWithMetadata);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Throwable, top.bienvenido.date_24323.d1] */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static d1 m72(String str, d2 d2Var, IBinder iBinder, Object obj) {
        String str2 = "Working on " + str + " with invocation handler...";
        ?? d1Var = new d1(obj, d2Var);
        n4 n4Var = new n4(iBinder, (IInterface) d1Var.f57);
        n9 n9Var = f29;
        synchronized (n9Var) {
            try {
                n9Var.m386(str.hashCode(), TuplesKt.to(n4Var, (Object) d1Var));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw d1Var;
            }
        }
        Map map = f30;
        synchronized (map) {
            try {
                map.put(str, n4Var);
            } catch (Throwable th2) {
                throw d1Var;
            }
        }
        d1Var.f54.m386(-1772511108, new z8(n4Var, d2Var));
        return d1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static d1 m71(String str, d2 d2Var, String str2) {
        u2 u2Var;
        u2 u2Var2;
        q2 q2Var;
        try {
            synchronized (f30) {
                try {
                    IBinder service = ServiceManager.getService(str);
                    if (service == null) {
                        return null;
                    }
                    if (str2 == null) {
                        String interfaceDescriptor = service.getInterfaceDescriptor();
                        str2 = interfaceDescriptor != null ? interfaceDescriptor + "$Stub" : null;
                        if (str2 == null) {
                            return null;
                        }
                    }
                    String str3 = str2;
                    Class<?>[] clsArr = new Class[1];
                    clsArr[0] = IBinder.class;
                    try {
                        try {
                            Method declaredMethod = Class.forName(str3).getDeclaredMethod("asInterface", clsArr);
                            declaredMethod.setAccessible(true);
                            u2Var2 = q2Var;
                            q2Var = new q2(declaredMethod);
                        } catch (Exception unused) {
                            u2Var = u2.f337;
                            u2Var2 = u2Var;
                        }
                    } catch (Exception unused2) {
                        u2Var = u2.f337;
                    }
                    u2 u2Var3 = u2Var2;
                    Object[] objArr = new Object[1];
                    objArr[0] = service;
                    Object objMo432 = u2Var3.mo432((Object) null, objArr);
                    if (objMo432 == null) {
                        return null;
                    }
                    return m72(str, d2Var, service, objMo432);
                } catch (Throwable th) {
                    throw str;
                }
            }
        } catch (Exception unused3) {
            return null;
        }
    }
}
