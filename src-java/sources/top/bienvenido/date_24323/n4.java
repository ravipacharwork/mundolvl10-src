package top.bienvenido.date_24323;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.ShellCallback;
import java.io.FileDescriptor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/n4.class */
public final class n4 implements IBinder {

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final u2 f237;

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final IBinder f238;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final IInterface f239;

    public n4(IBinder iBinder, IInterface iInterface) {
        this.f238 = iBinder;
        this.f239 = iInterface;
    }

    static {
        u2 u2Var;
        q2 q2Var;
        if (AbstractC0065x6082d607.f505) {
            try {
                Method declaredMethod = IBinder.class.getDeclaredMethod("getExtension", i.f159);
                declaredMethod.setAccessible(true);
                u2Var = q2Var;
                q2Var = new q2(declaredMethod);
            } catch (Exception unused) {
                u2Var = u2.f337;
            }
        } else {
            u2Var = u2.f337;
        }
        f237 = u2Var;
    }

    public final void shellCommand(FileDescriptor fileDescriptor, FileDescriptor fileDescriptor2, FileDescriptor fileDescriptor3, String[] strArr, ShellCallback shellCallback, ResultReceiver resultReceiver) {
    }

    public final void addFrozenStateChangeCallback(Executor executor, IBinder.FrozenStateChangeCallback frozenStateChangeCallback) {
        this.f238.addFrozenStateChangeCallback(executor, frozenStateChangeCallback);
    }

    @Override // android.os.IBinder
    public final IInterface queryLocalInterface(String str) {
        return this.f239;
    }

    public final boolean removeFrozenStateChangeCallback(IBinder.FrozenStateChangeCallback frozenStateChangeCallback) {
        return this.f238.removeFrozenStateChangeCallback(frozenStateChangeCallback);
    }

    public final IBinder getExtension() {
        return (IBinder) f237.mo432((Object) this.f238, new Object[0]);
    }

    @Override // android.os.IBinder
    public final void dump(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f238.dump(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final void dumpAsync(FileDescriptor fileDescriptor, String[] strArr) throws RemoteException {
        this.f238.dumpAsync(fileDescriptor, strArr);
    }

    @Override // android.os.IBinder
    public final String getInterfaceDescriptor() {
        return this.f238.getInterfaceDescriptor();
    }

    @Override // android.os.IBinder
    public final boolean isBinderAlive() {
        return this.f238.isBinderAlive();
    }

    @Override // android.os.IBinder
    public final void linkToDeath(IBinder.DeathRecipient deathRecipient, int i) throws RemoteException {
        this.f238.linkToDeath(deathRecipient, i);
    }

    @Override // android.os.IBinder
    public final boolean pingBinder() {
        return this.f238.pingBinder();
    }

    @Override // android.os.IBinder
    public final boolean transact(int i, Parcel parcel, Parcel parcel2, int i2) {
        return this.f238.transact(i, parcel, parcel2, i2);
    }

    @Override // android.os.IBinder
    public final boolean unlinkToDeath(IBinder.DeathRecipient deathRecipient, int i) {
        return this.f238.unlinkToDeath(deathRecipient, i);
    }
}
