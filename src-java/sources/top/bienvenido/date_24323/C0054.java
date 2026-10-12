package top.bienvenido.date_24323;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: top.bienvenido.date_24323.我怕你爸外遇不够多死着死着就没妈了, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/我怕你爸外遇不够多死着死着就没妈了.class */
public final class C0054 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final C0054 f483 = new C0054();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        BluetoothAdapter defaultAdapter;
        d1 d1VarM657;
        u2 s2Var;
        r2 r2Var;
        d2 d2VarM497 = u4.m497(u4.f341);
        this.f485 = d2VarM497;
        boolean z = AbstractC0065x6082d607.f510x541a43c1;
        if (z) {
            BluetoothManager bluetoothManager = (BluetoothManager) b3.f17.getSystemService(BluetoothManager.class);
            defaultAdapter = bluetoothManager != null ? bluetoothManager.getAdapter() : null;
        } else {
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        }
        if (defaultAdapter == null) {
            return;
        }
        p2 p2Var = new p2("mManagerService");
        Object objMo393 = p2Var.f270.mo393(defaultAdapter);
        if (objMo393 == null || (d1VarM657 = m657("bluetooth_manager", objMo393)) == null) {
            return;
        }
        if (z) {
            try {
                Field declaredField = BluetoothAdapter.class.getDeclaredField("sAdapter");
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
            s2Var.mo394((Object) null, (Object) null);
        } else {
            p2Var.f270.mo394(defaultAdapter, d1VarM657.f57);
        }
        C0031x7011f1e3 c0031x7011f1e3 = new C0031x7011f1e3(0);
        d1VarM657.f54.m386(-1296507092, new C0040(c0031x7011f1e3, d2VarM497));
        d1VarM657.f54.m386(2097720179, new C0021x7d6d0bc2(c0031x7011f1e3, d2VarM497));
        d1VarM657.f54.m386(-110831682, new t4("02:00:00:00:00:00"));
        if (AbstractC0065x6082d607.f508) {
            try {
                C0038.f475.mo10();
            } catch (Throwable unused2) {
            }
        }
    }
}
