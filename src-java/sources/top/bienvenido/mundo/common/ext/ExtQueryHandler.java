package top.bienvenido.mundo.common.ext;

import android.os.IpcDataCache;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/mundo/common/ext/ExtQueryHandler.class */
@Metadata(mv = {2, 2, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ltop/bienvenido/mundo/common/ext/ExtQueryHandler;", "Landroid/os/IpcDataCache$QueryHandler;", "", "", "origin", "<init>", "(Landroid/os/IpcDataCache$QueryHandler;)V", "serviceQuery", "apply", "(Ljava/lang/Object;)Ljava/lang/Object;", "mundo"}, xi = 48)
public final class ExtQueryHandler extends IpcDataCache.QueryHandler<Object, Object> {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IpcDataCache.QueryHandler f529;

    public ExtQueryHandler(IpcDataCache.QueryHandler<Object, Integer> queryHandler) {
        this.f529 = queryHandler;
    }

    public Object apply(Object serviceQuery) {
        try {
            return this.f529.apply(serviceQuery);
        } catch (Exception unused) {
            return 0;
        }
    }
}
