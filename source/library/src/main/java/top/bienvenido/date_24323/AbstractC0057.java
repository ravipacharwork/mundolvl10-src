package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.ServiceManager;

/* JADX INFO: renamed from: top.bienvenido.date_24323.我是月黑风高偷你妈棺材钱的爹, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/我是月黑风高偷你妈棺材钱的爹.class */
public abstract class AbstractC0057 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public d2 f485;

    public AbstractC0057() {
        d2 d2Var = u4.f339;
        this.f485 = u4.f339;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract void mo10();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final d1 m657(String str, Object obj) {
        n9 n9Var = b9.f29;
        d2 d2Var = this.f485;
        try {
            synchronized (b9.f30) {
                try {
                    IBinder service = ServiceManager.getService(str);
                    if (service == null) {
                        return null;
                    }
                    return b9.m72(str, d2Var, service, obj);
                } catch (Throwable th) {
                    throw str;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m658(String... strArr) {
        n9 n9Var = b9.f29;
        d2 d2Var = this.f485;
        try {
            for (String str : strArr) {
                b9.m71(str, d2Var, null);
            }
        } catch (Exception unused) {
        }
    }
}
