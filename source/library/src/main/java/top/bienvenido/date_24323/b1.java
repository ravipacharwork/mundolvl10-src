package top.bienvenido.date_24323;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/b1.class */
public final class b1 extends Binder {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final b1 f11;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Bundle f12;

    static {
        b1 b1Var = new b1();
        f11 = b1Var;
        Bundle bundle = new Bundle();
        n6 n6Var = n6.f241;
        bundle.putBinder(n6Var.getInterfaceDescriptor(), n6Var);
        r5 r5Var = r5.f290;
        bundle.putBinder(r5Var.getInterfaceDescriptor(), r5Var);
        w3 w3Var = w3.f375;
        bundle.putBinder(w3Var.getInterfaceDescriptor(), w3Var);
        q4 q4Var = q4.f280;
        bundle.putBinder(q4Var.getInterfaceDescriptor(), q4Var);
        m3 m3Var = m3.f224;
        bundle.putBinder(m3Var.getInterfaceDescriptor(), m3Var);
        bundle.putBinder("https://www.62v.net/jnative/binder", b1Var);
        bundle.putInt(Integer.TYPE.getName(), Process.myPid());
        f12 = bundle;
    }

    @Override // android.os.Binder, android.os.IBinder
    public final String getInterfaceDescriptor() {
        return "https://www.62v.net/jnative/binder";
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object objM385;
        int i3;
        if (i != 7001) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        try {
            long j = parcel.readLong();
            int i4 = (int) ((j & (-4294967296L)) >>> 32);
            int i5 = (int) (j & 4294967295L);
            u8 u8Var = u5.f351;
            synchronized (u8Var) {
                objM385 = u8Var.f358.m385(i5);
            }
            s5 s5Var = (s5) objM385;
            int i6 = -1;
            if (s5Var != null) {
                s5 s5Var2 = (s5) u8Var.m516(i4);
                if (s5Var2 != null) {
                    if (s5Var2.f308.hashCode() == s5Var.f308.hashCode()) {
                        i3 = b3.f19;
                    } else {
                        int i7 = s5Var.f313;
                        i6 = i7;
                        if (i7 == s5Var2.f313) {
                            i3 = b3.f19;
                        }
                    }
                    i6 = i3;
                }
            }
            parcel2.writeInt(i6);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }
}
