package top.bienvenido.date_24323;

import android.app.PropertyInvalidatedCache;
import android.bluetooth.BluetoothAdapter;
import android.os.IpcDataCache;
import top.bienvenido.mundo.common.ext.ExtQueryHandler;

/* JADX INFO: renamed from: top.bienvenido.date_24323.只有强者才配拥有父母可惜你是孤儿本来就没有父母, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/只有强者才配拥有父母可惜你是孤儿本来就没有父母.class */
public final class C0038 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final C0038 f475 = new C0038();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        IpcDataCache.QueryHandler queryHandler;
        IpcDataCache ipcDataCache = (IpcDataCache) t2.m483(BluetoothAdapter.class, "sGetProfileConnectionStateCache").mo393(null);
        if (ipcDataCache == null || (queryHandler = (IpcDataCache.QueryHandler) t2.m483(BluetoothAdapter.class, "sBluetoothProfileQuery").mo393(null)) == null) {
            return;
        }
        t2.m483(PropertyInvalidatedCache.class, "mComputer").mo394(ipcDataCache, new ExtQueryHandler(queryHandler));
        ipcDataCache.clear();
    }
}
