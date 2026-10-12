package top.bienvenido.date_24323;

import android.bluetooth.IBluetooth;
import android.bluetooth.IBluetoothManagerCallback;
import android.os.IBinder;
import android.os.IInterface;
import top.bienvenido.mundo.common.ext.MundoBleCallback;

/* JADX INFO: renamed from: top.bienvenido.date_24323.扣你的卵子给你家哥哥做寿司吃去吧, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/扣你的卵子给你家哥哥做寿司吃去吧.class */
public final class C0062 extends MundoBleCallback {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final /* synthetic */ IBluetoothManagerCallback f489;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ d2 f490;

    public C0062(IBluetoothManagerCallback iBluetoothManagerCallback, d2 d2Var) {
        this.f489 = iBluetoothManagerCallback;
        this.f490 = d2Var;
    }

    @Override // top.bienvenido.mundo.common.ext.MundoBleCallback
    public final void onBluetoothServiceDown() {
        try {
            this.f489.onBluetoothServiceDown();
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoBleCallback
    public final void onBluetoothServiceUp(IBluetooth iBluetooth) {
        try {
            this.f489.onBluetoothServiceUp(iBluetooth != null ? (IBluetooth) c1.m95(iBluetooth, this.f490) : null);
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoBleCallback
    public final void onBrEdrDown() {
        try {
            this.f489.onBrEdrDown();
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoBleCallback
    public final void onBluetoothOn() {
        try {
            this.f489.onBluetoothOn();
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoBleCallback
    public final void onBluetoothOff() {
        try {
            this.f489.onBluetoothOff();
        } catch (Exception unused) {
        }
    }

    @Override // top.bienvenido.mundo.common.ext.MundoBleCallback
    public final void onBluetoothServiceUp(IBinder iBinder) {
        try {
            this.f489.onBluetoothServiceUp(new n4(iBinder, (IInterface) c1.m95(IBluetooth.Stub.asInterface(iBinder), this.f490)));
        } catch (Exception unused) {
        }
    }
}
