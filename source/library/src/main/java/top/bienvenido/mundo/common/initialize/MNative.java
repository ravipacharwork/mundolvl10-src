package top.bienvenido.mundo.common.initialize;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/common/initialize/MNative.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J$\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0087 ¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltop/bienvenido/mundo/common/initialize/MNative;", "", "", "code", "obj", "ioctl", "(ILjava/lang/Object;)Ljava/lang/Object;", "mundo"}, xi = 48)
public final class MNative {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final /* synthetic */ int f531 = 0;

    @JvmStatic
    public static final native Object ioctl(int code, Object obj);

    static {
        try {
            System.loadLibrary("xdfw8yegr");
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static Object m687(int i, Serializable serializable) {
        try {
            return ioctl(i, serializable);
        } catch (Throwable unused) {
            return null;
        }
    }
}
